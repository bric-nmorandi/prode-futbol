/**
 * 
 */
package ar.com.futbolprode.negocio.entidades.modelo.jugada;

import ar.com.futbolprode.commons.auditor.Auditor;
import ar.com.futbolprode.negocio.entidades.modelo.torneo.PartidoFecha;
import ar.com.futbolprode.negocio.entidades.modelo.torneo.Resultado;

/**
 * @author Veronica
 * 
 */
public class Jugada extends Auditor {

	private static final int CERO = 0;

	private static final int UNO = 1;

	private static final int DOS = 2;

	private static final int TRES = 3;
	/**
	 * 
	 */
	private PartidoFecha partidoFecha;

	/**
	 * 
	 */
	private Resultado resultado;

	public Jugada() {
		// TODO Auto-generated constructor stub
	}

	public Jugada(PartidoFecha partidoFecha, Resultado resultado) {

		this.partidoFecha = partidoFecha;

		this.resultado = resultado;
	}

	public PartidoFecha getPartidoFecha() {
		return partidoFecha;
	}

	public void setPartidoFecha(PartidoFecha partidoFecha) {
		this.partidoFecha = partidoFecha;
	}

	public Resultado getResultado() {
		return resultado;
	}

	public void setResultado(Resultado resultado) {
		this.resultado = resultado;
	}

	public int puntosPorFecha() {
		int puntos = CERO;
		if (partidoFecha != null && resultado != null) {
			if (partidoFecha.getResultado() != null) {
				if (partidoFecha.getResultado().getValor() == resultado
						.getValor()) {
					puntos = UNO;
				}
			}
		}
		return puntos;
	}

}
