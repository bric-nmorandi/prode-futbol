/**
 * 
 */
package ar.com.futbolprode.negocio.logica.service;

import java.util.List;

import ar.com.futbolprode.negocio.entidades.modelo.usuario.Permiso;

/**
 * @author acabrera
 *
 */
public interface PermisoService {
	/**
	 * 
	 * @param permiso
	 */
	void save(Permiso permiso);
	/**
	 * 
	 * @param id
	 * @return
	 */
	Permiso getById(Integer id);
	/**
	 * 
	 * @return
	 */
	List<Permiso> getAll();
}
