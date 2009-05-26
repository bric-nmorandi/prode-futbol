package ar.com.futbolprode.negocio.entidades.modelo.usuario;

import java.util.HashSet;
import java.util.Set;

import ar.com.futbolprode.commons.auditor.Auditor;

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

}
