/**
 * 
 */
package ar.com.futbolprode.negocio.entidades.modelo.usuario;

import ar.com.futbolprode.commons.auditor.Auditor;

/**
 * @author acabrera
 *
 */
public class RolPermiso extends Auditor{

	/**
	 * 
	 */
	protected Rol rol;
	/**
	 * 
	 */
	protected Permiso permiso;
	public Rol getRol() {
		return rol;
	}
	public void setRol(Rol rol) {
		this.rol = rol;
	}
	public Permiso getPermiso() {
		return permiso;
	}
	public void setPermiso(Permiso permiso) {
		this.permiso = permiso;
	}
	
}
