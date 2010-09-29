/**
 * 
 */
package ar.com.futbolprode.negocio.logica.service;

import java.util.List;

import ar.com.futbolprode.negocio.entidades.modelo.jugada.UsuarioJugada;

/**
 * @author acabrera
 *
 */
public interface UsuarioJugadaService {
	/**
	 * 
	 * @param id
	 * @return
	 */
	UsuarioJugada getById(Integer id);
	/**
	 * 
	 * @return
	 */
	List<UsuarioJugada> getAll();
	/**
	 * 
	 * @param usuarioJugada
	 */
	void save(UsuarioJugada usuarioJugada);
}
