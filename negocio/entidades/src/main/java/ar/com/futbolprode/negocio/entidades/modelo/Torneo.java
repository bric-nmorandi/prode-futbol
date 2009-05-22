/**
 * 
 */
package ar.com.futbolprode.negocio.entidades.modelo;

import java.util.ArrayList;
import java.util.List;

/**
 * @author acabrera
 * 
 */
public class Torneo {
	/**
	 * identificador unico del torneo
	 */
	private Integer id;
	/**
	 * nombre del torneo
	 */
	private String nombre;
	/**
	 * lista de los clubese que participan en el torneo
	 */
	private List<Club> clubes;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

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
