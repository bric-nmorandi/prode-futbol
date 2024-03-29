/**
 * 
 */
package ar.com.futbolprode.negocio.entidades.modelo.club;

import java.util.HashSet;
import java.util.Set;

import ar.com.futbolprode.commons.auditor.Auditor;
import ar.com.futbolprode.negocio.entidades.modelo.grupo.Grupo;
import ar.com.futbolprode.negocio.entidades.modelo.liga.Liga;
import ar.com.futbolprode.negocio.entidades.modelo.torneo.TorneoClub;

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
	/**
	 * Objeto que contiene los torneos en los cuales participo el club
	 */
	private Set<TorneoClub> torneosClub;
	/**
	 * Liga de futbol a la cual pertenece el club
	 */
	private Liga liga;

	private Grupo grupo;
	
	private String imagen;
	
	public Club(String nombre, String descripcion, Liga liga,
			EstadoClub estadoClub) {
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.liga = liga;
		this.estadoClub = estadoClub;
	}
	
	public Club(String nombre, String descripcion, Liga liga,
			EstadoClub estadoClub,Grupo grupo) {
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.liga = liga;
		this.estadoClub = estadoClub;
		this.grupo=grupo;
	}
	
	public Club() {
		// TODO Auto-generated constructor stub
	}

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

	public Set<TorneoClub> getTorneosClub() {
		return torneosClub;
	}

	public void setTorneosClub(Set<TorneoClub> torneos) {
		if (this.torneosClub == null) {
			this.torneosClub = new HashSet<TorneoClub>();
		}
		this.torneosClub = torneos;
	}

	public Liga getLiga() {
		return liga;
	}

	public void setLiga(Liga liga) {
		this.liga = liga;
	}

	public Grupo getGrupo() {
		return grupo;
	}

	public void setGrupo(Grupo grupo) {
		this.grupo = grupo;
	}

	public String getImagen() {
		return imagen;
	}

	public void setImagen(String imagen) {
		this.imagen = imagen;
	}

}
