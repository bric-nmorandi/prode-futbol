/**
 * 
 */
package ar.com.futbolprode.negocio.entidades.modelo.torneo;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import ar.com.futbolprode.commons.auditor.Auditor;

/**
 * @author acabrera
 * 
 */
public class Torneo extends Auditor {
	/**
	 * nombre del torneo
	 */
	private String nombre;

	private Set<TorneoClub> torneosClub;

	private EstadoTorneo estadoTorneo;

	public Torneo(String nombre, EstadoTorneo estadoTorneo) {
		this.nombre = nombre;
		this.estadoTorneo = estadoTorneo;
	}

	public Torneo() {
		// TODO Auto-generated constructor stub
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Set<TorneoClub> getTorneosClub() {
		return torneosClub;
	}

	public void setTorneosClub(Set<TorneoClub> torneosClub) {
		if (this.torneosClub == null) {
			this.torneosClub = new HashSet<TorneoClub>();
		}
		this.torneosClub = torneosClub;
	}

	public EstadoTorneo getEstadoTorneo() {
		return estadoTorneo;
	}

	public void setEstadoTorneo(EstadoTorneo estadoTorneo) {
		this.estadoTorneo = estadoTorneo;
	}

}
