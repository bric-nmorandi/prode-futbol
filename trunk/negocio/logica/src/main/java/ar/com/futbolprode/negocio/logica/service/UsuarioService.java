/**
 * 
 */
package ar.com.futbolprode.negocio.logica.service;

import java.util.List;

import ar.com.futbolprode.negocio.entidades.modelo.usuario.Usuario;

/**
 * @author acabrera
 *
 */
public interface UsuarioService {

	
	/**
	 * Almacena un objeto del tipo {@link Usuario}
	 * @param usuario
	 */
	void save(Usuario usuario);
	
	/**
	 * Obtiene un objeto del tipo {@link Usuario}
	 * @param id
	 * @return
	 */
	Usuario getById(Integer id);
	
	/**
	 * Obtiene todos los objetos del tipo {@link Usuario} que se encuentran almacenados
	 * @return
	 */
	List<Usuario> getAll();
}
