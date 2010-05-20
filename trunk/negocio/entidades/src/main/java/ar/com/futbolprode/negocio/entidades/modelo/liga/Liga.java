/**
 * 
 */
package ar.com.futbolprode.negocio.entidades.modelo.liga;

import java.util.HashSet;
import java.util.Set;

import ar.com.futbolprode.commons.auditor.Auditor;
import ar.com.futbolprode.negocio.entidades.modelo.club.Club;

/**
 * Clase que define a una liga. La liga esta compuesta por una lista de clubes (
 * <code>Club</code>)
 * 
 * @author acabrera
 * @since 28 Nov,2009
 * @see Auditor
 * @see Club
 * 
 */
public class Liga extends Auditor {

	/**
	 * breve descripcion de la liga
	 */
	private String descripcion;
	/**
	 * clubes pertenecientes a una determinada liga.
	 */
	private Set<Club> clubes;

	public Liga(String descripcion) {
		this.descripcion = descripcion;
	}

	public Liga() {
		// TODO Auto-generated constructor stub
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Set<Club> getClubes() {
		return clubes;
	}

	public void setClubes(Set<Club> clubes) {
		if (this.clubes == null) {
			this.clubes = new HashSet<Club>();
		}
		this.clubes = clubes;
	}
	public Club getClub(int i){
		for (Club club : clubes) {
			if(club.getId().intValue()==i){
				return club;
			}
		}
		return null; 
	}

}
