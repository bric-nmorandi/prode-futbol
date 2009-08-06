/**
 * 
 */
package ar.com.futbolprode.negocio.entidades.modelo.club;

import ar.com.futbolprode.commons.auditor.Auditor;

/**
 * @author acabrera
 * 
 */
public class Club extends Auditor {

	/**
	 * nombre del club
	 */
	private String nombre;
	/**
	 * descripcion del club
	 */
	private String descripcion;
	/**
	 * estado del club. En la actualidad pueden ser activo/desactivo/
	 */
	private EstadoClub estadoClub;
	
	public EstadoClub getEstadoClub() {
		return estadoClub;
	}
	public void setEstadoClub(EstadoClub estadoClub) {
		this.estadoClub = estadoClub;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
}
