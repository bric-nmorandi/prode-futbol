/**
 * 
 */
package ar.com.futbolprode.negocio.entidades.modelo.torneo;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import ar.com.futbolprode.commons.auditor.Auditor;
import ar.com.futbolprode.negocio.entidades.Constants;

/**
 * @author acabrera
 * 
 */
public class FechaTorneo extends Auditor {

	/**
	 * fecha del torneo en sí.
	 */
	private Date fechaDelTorneo;
	/**
	 * conjunto de todos los partidos de la fecha {@link FechaTorneo}
	 */
	private Set<PartidoFecha> partidos;

	public Date getFechaDelTorneo() {
		return fechaDelTorneo;
	}

	public void setFechaDelTorneo(Date fechaDelTorneo) {
		this.fechaDelTorneo = fechaDelTorneo;
	}

	public Set<PartidoFecha> getPartidos() {
		return partidos;
	}

	public void setPartidos(Set<PartidoFecha> partidos) {
		if (this.partidos == null) {
			this.partidos = new HashSet<PartidoFecha>();
		}
		this.partidos = partidos;
	}

	/*
	 * define la cantidad de triunfos locales que se dieron en esa fecha
	 */
	public int getCantidadTriunfosLocales() {
		int resultado = 0;
		for (PartidoFecha partido : this.getPartidos()) {
			if (partido.getResultado().getValor() == Constants.LOCAL)
				resultado++;
		}
		return resultado;
	}
	/*
	 * define la cantidad de triunfos visitantes que se dieron en esa fecha
	 */
	public int getCantidadTriunfosVisitantes() {
		int resultado = 0;
		for (PartidoFecha partido : this.getPartidos()) {
			if (partido.getResultado().getValor() == Constants.VISITANTE)
				resultado++;
		}
		return resultado;
	}
	/*
	 * define la cantidad de empates que se dieron en esa fecha
	 */
	public int getCantidadEmpates() {
		int resultado = 0;
		for (PartidoFecha partido : this.getPartidos()) {
			if (partido.getResultado().getValor() == Constants.EMPATE)
				resultado++;
		}
		return resultado;
	}
}
