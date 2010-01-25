/**
 * 
 */
package ar.com.futbolprode.negocio.logica.dao;

import java.util.List;

import ar.com.futbolprode.negocio.entidades.modelo.usuario.Permiso;

/**
 * @author acabrera
 *
 */
public interface PermisoDao {

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
