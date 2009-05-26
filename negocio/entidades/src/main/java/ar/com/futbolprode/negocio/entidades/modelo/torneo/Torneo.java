/**
 * 
 */
package ar.com.futbolprode.negocio.entidades.modelo.torneo;

import java.util.ArrayList;
import java.util.List;

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

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
}
