/**
 * 
 */
package ar.com.futbolprode.negocio.logica.service;

import java.util.List;

import ar.com.futbolprode.negocio.entidades.modelo.usuario.RolPermiso;

/**
 * @author acabrera
 *
 */
public interface RolPermisoService {

	/**
	 * 
	 * @param rolPermiso
	 */
	void save(RolPermiso rolPermiso);

	/**
	 * 
	 * @param id
	 * @return
	 */
	RolPermiso getById(Integer id);

	/**
	 * 
	 * @return
	 */
	List<RolPermiso> getAll();
}
