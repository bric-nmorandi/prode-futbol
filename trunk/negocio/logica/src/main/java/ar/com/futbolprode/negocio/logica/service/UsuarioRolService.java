/**
 * 
 */
package ar.com.futbolprode.negocio.logica.service;

import java.util.List;

import ar.com.futbolprode.negocio.entidades.modelo.usuario.UsuarioRol;

/**
 * @author acabrera
 *
 */
public interface UsuarioRolService {

	/**
	 * 
	 * @param usuarioRol
	 */
	void save(UsuarioRol usuarioRol);
	/**
	 * 
	 * @param id
	 * @return
	 */
	UsuarioRol getById(Integer id);
	/**
	 * 
	 * @return
	 */
	List<UsuarioRol> getAll();
}
