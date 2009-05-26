/**
 * 
 */
package ar.com.futbolprode.negocio.entidades.modelo.usuario;

import ar.com.futbolprode.commons.auditor.Auditor;

/**
 * un permiso habilita a un usuario a realizar una determinada tarea en el
 * sistema
 * 
 * @author acabrera
 * 
 */
public class Permiso extends Auditor {

	protected String nombre;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
}
