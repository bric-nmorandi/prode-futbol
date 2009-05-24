/**
 * 
 */
package ar.com.futbolprode.negocio.entidades.modelo;

import java.util.ArrayList;
import java.util.List;

import ar.com.futbolprode.commons.auditor.Auditor;

/**
 * @author acabrera
 * 
 */
public class Torneo extends Auditor {
	/**
	 * nombre del torneo
	 */
	private String nombre;
	/**
	 * lista de los clubese que participan en el torneo
	 */
	private List<Club> clubes;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<Club> getClubes() {
		return clubes;
	}

	public void setClubes(List<Club> clubes) {
		if (this.clubes == null) {
			this.clubes = new ArrayList<Club>();
		}
		this.clubes = clubes;
	}
}
