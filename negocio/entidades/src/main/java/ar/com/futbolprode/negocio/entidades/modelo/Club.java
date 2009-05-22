/**
 * 
 */
package ar.com.futbolprode.negocio.entidades.modelo;

/**
 * @author acabrera
 * 
 */
public class Club {

	/**
	 * identificador unico del club
	 */
	private Integer id;
	/**
	 * nombre del club
	 */
	private String nombre;
	/**
	 * descripcion del club
	 */
	private String descripcion;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
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
}
