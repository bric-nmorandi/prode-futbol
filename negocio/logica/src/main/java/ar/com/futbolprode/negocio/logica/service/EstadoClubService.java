/**
 * 
 */
package ar.com.futbolprode.negocio.logica.service;

import java.util.List;

import ar.com.futbolprode.negocio.entidades.modelo.club.EstadoClub;

/**
 * @author acabrera
 *
 */
public interface EstadoClubService {
	/**
	 * 
	 * @param estadoClub
	 */
	void save(EstadoClub estadoClub);
	/**
	 * 
	 * @param id
	 * @return
	 */
	EstadoClub getById(Integer id);
	/**
	 * 
	 * @return
	 */
	List<EstadoClub> getAll();
}
