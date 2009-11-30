/**
 * 
 */
package ar.com.futbolprode.negocio.logica.dao;

import java.util.List;

import ar.com.futbolprode.negocio.entidades.modelo.torneo.EstadoTorneo;

/**
 * @author acabrera
 * @since 28 Nov,2009
 */
public interface EstadoTorneoDao {

	/**
	 * 
	 * @param estadoTorneo
	 */
	void save(EstadoTorneo estadoTorneo);

	/**
	 * 
	 * @param id
	 * @return
	 */
	EstadoTorneo getById(Integer id);

	/**
	 * 
	 * @return
	 */
	List<EstadoTorneo> getAll();
}
