package ar.com.futbolprode.negocio.entidades.modelo.usuario;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import ar.com.futbolprode.commons.auditor.Auditor;
import ar.com.futbolprode.negocio.entidades.modelo.jugada.UsuarioJugada;

/**
 * Clase que define el usuario del sistema
 * 
 * @author acabrera
 * 
 */
public class Usuario extends Auditor {

	/**
	 * 
	 */
	protected String nombre;
	/**
	 * 
	 */
	protected String login;
	/**
	 * 
	 */
	protected String password;
	/**
	 * 	
	 */
	protected Set<UsuarioRol> roles;
	/**
	 * 
	 */
	protected List<UsuarioJugada> usuarioJugada;
	
 
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Set<UsuarioRol> getRoles() {
		return roles;
	}

	public void setRoles(Set<UsuarioRol> roles) {
		if (this.roles == null) {
			this.roles = new HashSet<UsuarioRol>();
		}
		this.roles = roles;
	}

	public List<UsuarioJugada> getUsuarioJugada() {
		if(this.usuarioJugada==null){
			this.usuarioJugada=new ArrayList<UsuarioJugada>();
		}
		return usuarioJugada;
	}

	public void setUsuarioJugada(List<UsuarioJugada> usuarioJugada) {
		if(this.usuarioJugada==null){
			this.usuarioJugada=new ArrayList<UsuarioJugada>();
		}
		this.usuarioJugada = usuarioJugada;
	}
}
