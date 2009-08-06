/**
 * 
 */
package ar.com.futbolprode.negocio.logica.service;

import java.util.List;

import ar.com.futbolprode.negocio.entidades.modelo.torneo.EstadoTorneo;

/**
 * @author acabrera
 *
 */
public interface EstadoTorneoService {
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
