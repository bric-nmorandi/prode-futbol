/**
 * 
 */
package ar.com.futbolprode.negocio.entidades.modelo.club;

import ar.com.futbolprode.commons.auditor.Auditor;

/**
 * @author acabrera
 *
 */
public class EstadoClub extends Auditor {

	private String descripcion;

	public EstadoClub(String descripcion) {
		this.descripcion=descripcion;
	}
	
	public EstadoClub() {
		// TODO Auto-generated constructor stub
	}
	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
}
