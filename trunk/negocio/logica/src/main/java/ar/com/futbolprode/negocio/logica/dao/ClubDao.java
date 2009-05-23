/**
 * 
 */
package ar.com.futbolprode.negocio.logica.dao;

import java.util.List;

import ar.com.futbolprode.negocio.entidades.modelo.Club;

/**
 * @author acabrera
 *
 */
public interface ClubDao {

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
