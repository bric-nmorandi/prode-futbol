/**
 * 
 */
package ar.com.futbolprode.negocio.logica.service;

import java.util.Random;

import ar.com.futbolprode.negocio.entidades.modelo.club.Club;
import ar.com.futbolprode.negocio.entidades.modelo.club.EstadoClub;
import ar.com.futbolprode.negocio.entidades.modelo.liga.Liga;
import ar.com.futbolprode.negocio.logica.util.Clubes;

/**
 * @author acabrera
 * 
 */
public class ClubServicesTest extends AbstractTest {

	/**
	 * 
	 */
	public void testSave() {
		if (this.getClubService().getAll().size() <= CERO) {
			if (this.getEstadoClubService().getAll().size() <= CERO) {
				this.insertEstadosClub();
			}
			if (this.getLigaService().getAll().size() <= CERO) {
				this.insertLigaClub();
			}
			Object clubes[] = Clubes.values();
			Object descripciones[] = Clubes.ClubesDescripcion.values();
			Random random = new Random(1);
			for (int i = 0; i < clubes.length; i++) {
				Club club = new Club();
				club.setNombre(clubes[i].toString());
				club.setDescripcion(descripciones[i].toString());
				club.setEstadoClub(this.getEstadoClubService().getById(
						random.nextInt(2) + 1));
				club.setLiga(this.getLigaService().getById(1));
				this.getClubService().save(club);
			}
		}
	}

	public void testGetLiga() {
		for (Liga liga : this.getLigaService().getAll()) {
			for (Club club : liga.getClubes()) {
				System.out.println(club.getDescripcion() + " :"
						+ club.getNombre());
			}
		}
	}

	/**
	 * 
	 */
	private void insertEstadosClub() {
		EstadoClub estadoClubActivo = new EstadoClub(Clubes.ClubesEstado.activo
				.toString());
		this.getEstadoClubService().save(estadoClubActivo);
		EstadoClub estadoClubDesactivo = new EstadoClub(
				Clubes.ClubesEstado.desactivo.toString());
		this.getEstadoClubService().save(estadoClubDesactivo);
	}

	private void insertLigaClub() {
		Liga liga = new Liga(Clubes.ClubesLiga.salta.toString());
		this.getLigaService().save(liga);
	}

}
