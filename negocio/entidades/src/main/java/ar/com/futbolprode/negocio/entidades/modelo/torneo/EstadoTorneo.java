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
 */
public class EstadoTorneo extends Auditor {

	/**
	 * descripcion del estado del torneo. Posibles valores: Activado,
	 * Desactivado
	 */
	protected String descripcion;

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
}
