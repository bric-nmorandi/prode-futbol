/**
 * 
 */
package ar.com.futbolprode.negocio.logica.service;

import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import ar.com.futbolprode.negocio.entidades.modelo.club.Club;
import ar.com.futbolprode.negocio.entidades.modelo.torneo.FechaTorneo;
import ar.com.futbolprode.negocio.entidades.modelo.torneo.PartidoFecha;
import ar.com.futbolprode.negocio.entidades.modelo.torneo.Torneo;

/**
 * Define los metodos para realizar pruebas a instancias del tipo
 * {@link FechaTorneo}
 * 
 * @author acabrera
 * @since 13 Dic,2009
 * @see FechaTorneo
 */
public class FechaTorneoServicesTest extends AbstractTest {

	/**
	 * 
	 */
	public void testSave() {
		List<Torneo> torneos = this.getTorneoService().getAll();
		if (torneos.size() >= CERO) {
			FechaTorneo fechaTorneo = new FechaTorneo(new Date(), torneos
					.get(CERO));
			Set<PartidoFecha> partidos = new HashSet<PartidoFecha>();
			List<Club> clubes = this.getClubService().getAll();
			for (int i = 0; i < clubes.size(); i = i + 2) {
				try{
				partidos.add(new PartidoFecha(clubes.get(i), clubes.get(i + 1),
						fechaTorneo, new Date()));
				}catch (Exception e) {
					// TODO: handle exception
				}
			}
			fechaTorneo.setPartidos(partidos);
			this.getFechaTorneoService().save(fechaTorneo);
		}
	}
}
