/**
 * 
 */
package ar.com.futbolprode.negocio.entidades.modelo.jugada;

import ar.com.futbolprode.commons.auditor.Auditor;
import ar.com.futbolprode.negocio.entidades.modelo.usuario.Usuario;

/**
 * @author Veronica
 *
 */
@Deprecated
public class UsuarioJugada extends Auditor {

	/**
	 * {@link Usuario}
	 */
	private Usuario usuario;
	
	/**
	 * {@link Jugada}
	 */
	private Jugada jugada;
	
	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	public Jugada getJugada() {
		return jugada;
	}
	public void setJugada(Jugada jugada) {
		this.jugada = jugada;
	}
	
}
