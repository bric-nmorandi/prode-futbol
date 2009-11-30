/**
 * 
 */
package ar.com.futbolprode.negocio.logica.dao;

import java.util.List;

import ar.com.futbolprode.negocio.entidades.modelo.torneo.PartidoFecha;

/**
 * @author acabrera
 *
 */
public interface PartidoFechaDao {

	/**
	 * 
	 * @param id
	 * @return
	 */
	PartidoFecha getById(Integer id);
	/**
	 * 
	 * @return
	 */
	List<PartidoFecha> getAll();
	/**
	 * 
	 * @param partidoFecha
	 */
	void save(PartidoFecha partidoFecha);
}
