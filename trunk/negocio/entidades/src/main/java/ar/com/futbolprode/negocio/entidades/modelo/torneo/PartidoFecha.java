/**
 * 
 */
package ar.com.futbolprode.negocio.entidades.modelo.torneo;

import java.util.Date;

import ar.com.futbolprode.commons.auditor.Auditor;
import ar.com.futbolprode.negocio.entidades.modelo.club.Club;

/**
 * @author acabrera
 *
 */
public class PartidoFecha extends Auditor {

	/**
	 * Club local en este partido {@link PartidoFecha}
	 */
	private Club clubLocal;
	/** 
	 * club visitante en este partido {@link PartidoFecha}
	 */
	private Club clubVisitante;
	/**
	 * se define el resultado {@link Resultado} obtenido
	 */
	private Resultado resultado;
	/**
	 * se define el horario de dicho {@link PartidoFecha}
	 */
	private Date horario;
	/**
	 * se define a que fecha pertenece el partído.
	 */
	private FechaTorneo fechaTorneo;
	
	public Club getClubLocal() {
		return clubLocal;
	}

	public void setClubLocal(Club clubLocal) {
		this.clubLocal = clubLocal;
	}

	public Club getClubVisitante() {
		return clubVisitante;
	}

	public void setClubVisitante(Club clubVisitante) {
		this.clubVisitante = clubVisitante;
	}

	public Resultado getResultado() {
		return resultado;
	}

	public void setResultado(Resultado resultado) {
		this.resultado = resultado;
	}

	public Date getHorario() {
		return horario;
	}

	public void setHorario(Date horario) {
		this.horario = horario;
	}

	public FechaTorneo getFechaTorneo() {
		return fechaTorneo;
	}

	public void setFechaTorneo(FechaTorneo fechaTorneo) {
		this.fechaTorneo = fechaTorneo;
	}
	
}
