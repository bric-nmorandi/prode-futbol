/**
 * 
 */
package ar.com.futbolprode.negocio.entidades.modelo.usuario;

import java.util.HashSet;
import java.util.Set;

import ar.com.futbolprode.commons.auditor.Auditor;

/**
 * un rol agrupa uno o mas permisos {@link Permiso}
 * @author acabrera
 *
 */
public class Rol extends Auditor {

	protected String nombre;
	protected Set<RolPermiso> permisos;
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Set<RolPermiso> getPermisos() {
		return permisos;
	}
	public void setPermisos(Set<RolPermiso> permisos) {
		if(this.permisos == null){
			this.permisos = new HashSet<RolPermiso>();
		}
		this.permisos = permisos;
	}
	
	
}
