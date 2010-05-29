package ar.com.futbolprode.negocio.entidades.modelo.usuario;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import ar.com.futbolprode.commons.auditor.Auditor;
import ar.com.futbolprode.negocio.entidades.modelo.jugada.Jugada;
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
	protected Set<Jugada> jugadas;
//	protected Set<UsuarioJugada> usuarioJugada;

	public Usuario() {
		// TODO Auto-generated constructor stub
	}
	public Usuario(String nombre, String login, String password) {

		this.nombre = nombre;
		this.login = login;
		this.password = password;
	}

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
//	public Set<UsuarioJugada> getUsuarioJugada() {
//		if(this.usuarioJugada==null){
//			this.usuarioJugada=new HashSet<UsuarioJugada>();
//		}
//		return usuarioJugada;
//	}
//	public void setUsuarioJugada(Set<UsuarioJugada> usuarioJugada) {
//		if(this.usuarioJugada==null){
//			this.usuarioJugada=new HashSet<UsuarioJugada>();
//		}
//		this.usuarioJugada = usuarioJugada;
//	}
	public Set<Jugada> getJugadas() {
		if(this.jugadas==null){
			this.jugadas=new HashSet<Jugada>();
		}
		return jugadas;
	}
	public void setJugadas(Set<Jugada> jugadas) {
		if(this.jugadas==null){
			this.jugadas=new HashSet<Jugada>();
		}
		this.jugadas = jugadas;
	}


}
