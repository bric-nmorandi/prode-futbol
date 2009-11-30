/**
 * 
 */
package ar.com.futbolprode.negocio.entidades.modelo.torneo;

import ar.com.futbolprode.commons.auditor.Auditor;
import ar.com.futbolprode.negocio.entidades.modelo.club.Club;

/**
 * @author acabrera
 *
 */
public class TorneoClub extends Auditor {

	/**
	 * objeto que se encarga de asociar a un club, un determinado torneo
	 */
	private Club club;
	/**
	 * define a que torneo pertenece.
	 */
	private Torneo torneo;
	
	public Torneo getTorneo() {
		return torneo;
	}

	public void setTorneo(Torneo torneo) {
		this.torneo = torneo;
	}

	public Club getClub() {
		return club;
	}

	public void setClub(Club club) {
		this.club = club;
	}
	
}
