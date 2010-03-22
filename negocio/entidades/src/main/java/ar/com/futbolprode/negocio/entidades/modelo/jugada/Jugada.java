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

	/**
	 * 
	 */
	private PartidoFecha partidoFecha;
	
	/**
	 * 
	 */
	private Resultado resultado;
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
	
}
