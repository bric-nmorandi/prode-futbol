/**
 * 
 */
package ar.com.futbolprode.negocio.logica.service;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import ar.com.futbolprode.negocio.entidades.modelo.club.Club;
import ar.com.futbolprode.negocio.entidades.modelo.torneo.EstadoTorneo;
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

	/**
	 * Creo y almaceno una instancia del tipo {@link Torneo} en el caso de que no exista.
	 * Si es posible le agrego equipos participantes al mismo.
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
					.getEstadoTorneoService().getById(1));
			
			List<Club> clubes = this.getClubService().getAll();
			
			Set<TorneoClub> torneosclubes = new HashSet<TorneoClub>();
			
			for (Club club : clubes) {
				torneosclubes.add(new TorneoClub(club, torneo));
			}
            torneo.setTorneosClub(torneosclubes);
            this.getTorneoService().save(torneo);
		}
	}
}
