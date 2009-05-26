/**
 * 
 */
package ar.com.futbolprode.negocio.logica.dao;

import java.util.List;

import ar.com.futbolprode.negocio.entidades.modelo.torneo.Torneo;

/**
 * @author acabrera
 *
 */
public interface TorneoDao {

	/**
	 * 
	 * @param torneo
	 */
	void save(Torneo torneo);
	/**
	 * 
	 * @param id
	 * @return
	 */
	Torneo getById(Integer id);
	/**
	 * 
	 * @return
	 */
	List<Torneo> getAll();
}
