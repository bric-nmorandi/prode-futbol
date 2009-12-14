/**
 * 
 */
package ar.com.futbolprode.negocio.entidades.modelo.torneo;

import ar.com.futbolprode.commons.auditor.Auditor;

/**
 * el torneo debe tener un estado en si. Por ahora se definen los siguientes
 * estados: Activo, Desactivado,
 * 
 * @author acabrera
 * @since 13 Dic,2009
 * @see Torneo
 */
public class EstadoTorneo extends Auditor {

	/**
	 * descripcion del estado del torneo. Posibles valores: Activado,
	 * Desactivado
	 */
	protected String descripcion;

	public EstadoTorneo(String descripcion) {
		this.descripcion = descripcion;
	}

	public EstadoTorneo() {
		// TODO Auto-generated constructor stub
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
}
