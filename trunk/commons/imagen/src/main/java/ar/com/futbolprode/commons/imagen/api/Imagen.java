/**
 * 
 */
package ar.com.futbolprode.commons.imagen.api;

import java.sql.Blob;

import ar.com.futbolprode.commons.auditor.Auditor;

/**
 * @author acabrera
 *
 */
public class Imagen extends Auditor {

	/**
	 * nombre del archivo de imagen
	 */
	protected String nombre;
	/**
	 * breve descripcion de la imagen
	 */
	protected String descripcion;
	/**
	 * camino relativo de la imagen
	 */
	protected String camino;
	/**
	 * archivo blob de la imagen en sí.
	 */
	protected Blob value;
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public String getCamino() {
		return camino;
	}
	public void setCamino(String camino) {
		this.camino = camino;
	}
	public Blob getValue() {
		return value;
	}
	public void setValue(Blob value) {
		this.value = value;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}	
}
