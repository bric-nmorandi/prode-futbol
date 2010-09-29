/**
 * 
 */
package ar.com.futbolprode.negocio.logica.dao;

import java.util.List;

import ar.com.futbolprode.negocio.entidades.modelo.jugada.UsuarioJugada;

/**
 * @author acabrera
 *
 */
public interface UsuarioJugadaDao {
	
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

	/**
	 * 
	 * @param fecha
	 * @return
	 */
	List<UsuarioJugada> getByFecha(int fecha);
}
