/**
 * 
 */
package ar.com.futbolprode.negocio.logica.dao;

import java.util.List;

import ar.com.futbolprode.negocio.entidades.modelo.usuario.Rol;

/**
 * @author acabrera
 *
 */
public interface RolDao {

	/**
	 * 
	 * @param rol
	 */
	void save(Rol rol);
	/**
	 * 
	 * @param id
	 * @return
	 */
	Rol getById(Integer id);
	/**
	 * 
	 * @return
	 */
	List<Rol> getAll();
}
