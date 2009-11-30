/**
 * 
 */
package ar.com.futbolprode.negocio.logica.service;

import java.util.List;

import ar.com.futbolprode.negocio.entidades.modelo.torneo.PartidoFecha;

/**
 * @author acabrera
 * @since 28 Nov,2009
 */
public interface PartidoFechaService {

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
