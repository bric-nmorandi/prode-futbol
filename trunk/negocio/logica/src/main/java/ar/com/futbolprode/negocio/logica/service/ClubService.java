/**
 * 
 */
package ar.com.futbolprode.negocio.logica.service;

import java.util.List;

import ar.com.futbolprode.negocio.entidades.modelo.Club;

/**
 * @author acabrera
 *
 */
public interface ClubService {

	/**
	 * 
	 * @param club
	 */
	void save(Club club);
	/**
	 * 
	 * @param id
	 * @return
	 */
	Club getById(Integer id);
	/**
	 * 
	 * @return
	 */
	List<Club> getAll();
}
