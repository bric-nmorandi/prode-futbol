/**
 * 
 */
package ar.com.futbolprode.negocio.logica.service;

import java.util.Random;

import org.apache.commons.lang.math.IntRange;
import org.apache.commons.lang.math.Range;
import ar.com.futbolprode.negocio.entidades.modelo.club.Club;
import ar.com.futbolprode.negocio.entidades.modelo.club.EstadoClub;
import ar.com.futbolprode.negocio.entidades.modelo.grupo.Grupo;
import ar.com.futbolprode.negocio.entidades.modelo.liga.Liga;
import ar.com.futbolprode.negocio.logica.util.Clubes;
import ar.com.futbolprode.negocio.logica.util.Clubes.ClubesLiga;
import ar.com.futbolprode.negocio.logica.util.Clubes.PaisesMundial2010;

/**
 * @author acabrera
 * 
 */
public class ClubServicesTest extends AbstractTest {

	/**
	 * almacenar en la base de datos equipos
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

	/**
	 * 
	 */
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

	/**
	 * 
	 */
	private void insertLigaClub() {
		Liga liga = new Liga(Clubes.ClubesLiga.salta.toString());
		this.getLigaService().save(liga);
	}

	/**
	 * Insertar equipos del mundial
	 */
	public void testSaveMundial() {
		if (!(this.getLigaService().getBydescripcion(
				Clubes.ClubesLiga.mundial.toString()) == null)) {
			Liga liga = this.getLigaService().getBydescripcion(
					ClubesLiga.mundial.toString());

			if (liga.getClubes().size() <= CERO) {

				Random random = new Random(1);

				if (this.getGrupoService().getAll().size() <= CERO) {
					this.insertGruposMundial();
				}

				for (int i = 0; i < PaisesMundial2010.values().length; i++) {

					Club club = new Club(PaisesMundial2010.values()[i]
							.toString(), PaisesMundial2010.values()[i]
							.toString(), liga, this.getEstadoClubService()
							.getById(random.nextInt(2) + 1), getByIdGrupo(i));

					this.getClubService().save(club);
				}
			}

		} else {
			// inserto liga mundial
			this.getLigaService().save(
					new Liga(Clubes.ClubesLiga.mundial.toString()));
		}
	}

	/**
	 * Genero los grupos del mundial
	 */
	private void insertGruposMundial() {
		for (int i = 1; i <= 8; i++) {
			Grupo grupo = new Grupo(String.valueOf(i), String.valueOf(i));
			this.getGrupoService().save(grupo);
		}
	}

	/**
	 * para insertar cada equipo en su respectivo grupo utilizo esta función
	 * teniendo en cuenta el ordenamiento correcto de los equipos (de acuerdo a
	 * la enumeracion {@link PaisesMundial2010}. Y teniendo en cuenta que en la
	 * base solo se encuentran los grupos ( {@link Grupo} ) del mundial.
	 * 
	 * @param valor
	 * @return Grupo al cual pertenece el equipo 
	 */
	private Grupo getByIdGrupo(int valor) {

		Grupo grupo = null;

		// inicializo el valor minimo del rango
		int min = 0;

		// inilializo el valor maximo del rango
		int max = 3;

		int grupoId = 1;

		boolean grupoEncontrado = false;

		while (!grupoEncontrado) {
			Range range = new IntRange(min, max);
			if (range.containsInteger(valor)) {
				grupo = this.getGrupoService().getById(grupoId);
				grupoEncontrado = !grupoEncontrado;
			} else {
				grupoId++;
				min = max + 1;
				max = max + 4;
			}
		}
		return grupo;
	}
}
