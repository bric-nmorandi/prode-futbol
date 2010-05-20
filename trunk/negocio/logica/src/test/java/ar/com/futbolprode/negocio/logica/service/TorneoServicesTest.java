/**
 * 
 */
package ar.com.futbolprode.negocio.logica.service;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.StringTokenizer;

import ar.com.futbolprode.negocio.entidades.modelo.club.Club;
import ar.com.futbolprode.negocio.entidades.modelo.liga.Liga;
import ar.com.futbolprode.negocio.entidades.modelo.torneo.EstadoTorneo;
import ar.com.futbolprode.negocio.entidades.modelo.torneo.FechaTorneo;
import ar.com.futbolprode.negocio.entidades.modelo.torneo.PartidoFecha;
import ar.com.futbolprode.negocio.entidades.modelo.torneo.Torneo;
import ar.com.futbolprode.negocio.entidades.modelo.torneo.TorneoClub;
import ar.com.futbolprode.negocio.logica.util.Torneos;

/**
 * define diferentes test para las intancias del tipo {@link Torneo}
 * 
 * @author acabrera
 * @since 13 Dic,2009
 */
public class TorneoServicesTest extends AbstractTest {

	private SimpleDateFormat simpleDateFormat= new SimpleDateFormat("dd-MM-yyyy HH:mm");
	/**
	 * Creo y almaceno una instancia del tipo {@link Torneo} en el caso de que
	 * no exista. Si es posible le agrego equipos participantes al mismo.
	 * 
	 */
	public void testSave() {
		if (this.getTorneoService().getAll().size() <= CERO) {
			if (this.getEstadoTorneoService().getAll().size() <= CERO) {

				this.getEstadoTorneoService().save(
						new EstadoTorneo(Torneos.TorneosEstados.activo
								.toString()));
				this.getEstadoTorneoService().save(
						new EstadoTorneo(Torneos.TorneosEstados.desactivo
								.toString()));
			}
			Torneo torneo = new Torneo(Torneos.APERTURA.toString(), this
					.getEstadoTorneoService().getById(UNO));

			List<Club> clubes = this.getClubService().getAll();

			Set<TorneoClub> torneosclubes = new HashSet<TorneoClub>();

			for (Club club : clubes) {
				torneosclubes.add(new TorneoClub(club, torneo));
			}
			torneo.setTorneosClub(torneosclubes);
			this.getTorneoService().save(torneo);
		}
	}

	public void testSaveMundial() throws IOException, ParseException {

		Torneo torneo = new Torneo("Mundial 2010", this
				.getEstadoTorneoService().getById(UNO));
		torneo.setFechas(getFechasTorneoMundial());
		this.getTorneoService().save(torneo);
	}

	private Set<FechaTorneo> getFechasTorneoMundial() throws IOException, ParseException {
		Set<FechaTorneo> fechas = new HashSet<FechaTorneo>();
		File archivoFixture = new File(
				"./src/main/resources/ar/com/futbolprode/negocio/logica/file/fixtureMundial2010.txt");
		BufferedReader linea = new BufferedReader(new FileReader(archivoFixture));
		String registro;
		int i=0;
		
		Liga liga = this.getLigaService().getById(2);		
		
		FechaTorneo fecha1= new FechaTorneo();
		FechaTorneo fecha2= new FechaTorneo();
		FechaTorneo fecha3= new FechaTorneo();
		while((registro=linea.readLine())!=null){
			
			if(i!=CERO){
				
				StringTokenizer st = new StringTokenizer(registro,"|");
				
				int j = 0;
				
				PartidoFecha partidoFecha = new PartidoFecha();
				
				while(st.hasMoreTokens()){
					String campo = st.nextToken();
					
					
					if(j==CERO){
						switch (Integer.valueOf(campo)) {
												case 1:{
													partidoFecha.setFechaTorneo(fecha1);
													fecha1.getPartidos().add(partidoFecha);
													break;						
												}
												case 2:{
													partidoFecha.setFechaTorneo(fecha2);
													fecha2.getPartidos().add(partidoFecha);
													break;						
												}
												case 3:{
													partidoFecha.setFechaTorneo(fecha3);
													fecha3.getPartidos().add(partidoFecha);
													break;						
												}
						}						
					}//if j = UNO
					if(j==3){//horario partido
						partidoFecha.setHorario(this.simpleDateFormat.parse(campo.trim()));
					}
					if(j==4){
						partidoFecha.setEstadio(this.getEstadioService().getById(Integer.valueOf(campo.trim())));
					}
					if(j==5){
						partidoFecha.setClubLocal(liga.getClub(Integer.valueOf(campo.trim())));
					}
					if(j==6){
						partidoFecha.setClubVisitante(liga.getClub(Integer.valueOf(campo.trim())));
					}
				j++;				
				}
			}
			i++;			
		}
		fechas.add(fecha1);
		fechas.add(fecha2);
		fechas.add(fecha3);
		return fechas;
	}
}
