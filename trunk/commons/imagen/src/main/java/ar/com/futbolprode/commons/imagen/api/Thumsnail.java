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
public class Thumsnail extends Auditor {

	/**
	 * nombre del archivo de imagen
	 */
	protected String nombre;
	/**
	 * breve descripcion de la imagen
	 */
	protected String descripcion;
	/**
	 * 
	 */
	protected Imagen imagen;
	/**
	 * imagen en si.
	 */
	protected Blob value;
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
	public Imagen getImagen() {
		return imagen;
	}
	public void setImagen(Imagen imagen) {
		this.imagen = imagen;
	}
	public Blob getValue() {
		return value;
	}
	public void setValue(Blob value) {
		this.value = value;
	}	
}
