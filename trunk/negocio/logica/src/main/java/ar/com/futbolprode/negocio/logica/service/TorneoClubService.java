/**
 * 
 */
package ar.com.futbolprode.negocio.logica.service;

import java.util.List;

import ar.com.futbolprode.negocio.entidades.modelo.torneo.TorneoClub;

/**
 * @author acabrera
 *
 */
public interface TorneoClubService {

	/**
	 * 
	 * @param torneoClubDao
	 */
	void save(TorneoClub torneoClub);
	/**
	 * 
	 * @param id
	 * @return
	 */
	TorneoClub getById(Integer id);
	/**
	 * 
	 * @return
	 */
	List<TorneoClub> getAll();
}
