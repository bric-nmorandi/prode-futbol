/**
 * 
 */
package ar.com.futbolprode.negocio.entidades.modelo.usuario;

import ar.com.futbolprode.commons.auditor.Auditor;

/**
 * @author acabrera
 *
 */
public class UsuarioRol extends Auditor {

	/**
	 * usuario del sistema
	 */
	protected Usuario usuario;
	/**
	 * rol del sistem
	 */
	protected Rol rol;
	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	public Rol getRol() {
		return rol;
	}
	public void setRol(Rol rol) {
		this.rol = rol;
	}	
}
