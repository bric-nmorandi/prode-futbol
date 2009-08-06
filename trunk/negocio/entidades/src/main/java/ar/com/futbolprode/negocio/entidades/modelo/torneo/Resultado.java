/**
 * 
 */
package ar.com.futbolprode.negocio.entidades.modelo.torneo;

import ar.com.futbolprode.commons.auditor.Auditor;

/**
 * @author acabrera
 *
 */
public class Resultado extends Auditor {

	/**
	 * el valor define si es un triunfo visitante,local u empate.los char serían: V,L,E
	 */
	private char valor;
	/**
	 * se pueden escribir observaciones del partido como, suspensión, expulsiones, penales errados.
	 */
	private String observaciones;
	public char getValor() {
		return valor;
	}
	public void setValor(char valor) {
		this.valor = valor;
	}
	public String getObservaciones() {
		return observaciones;
	}
	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}
	
}
