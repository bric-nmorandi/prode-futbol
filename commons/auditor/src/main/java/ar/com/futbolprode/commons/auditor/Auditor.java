/**
 * 
 */
package ar.com.futbolprode.commons.auditor;

import java.util.Date;

/**
 * @author acabrera
 *
 */
public class Auditor {

	/**
	 * identificador unico
	 */
	protected Integer id;
	/**
	 * fecha de creacion del objeto auditable
	 */
	protected Date fechaCreacion;
	/**
	 * fecha de modificacion del objeto auditable
	 */
	protected Date fechaModificacion;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Date getFechaCreacion() {
		return fechaCreacion;
	}
	public void setFechaCreacion(Date fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}
	public Date getFechaModificacion() {
		return fechaModificacion;
	}
	public void setFechaModificacion(Date fechaModificacion) {
		this.fechaModificacion = fechaModificacion;
	}
}
