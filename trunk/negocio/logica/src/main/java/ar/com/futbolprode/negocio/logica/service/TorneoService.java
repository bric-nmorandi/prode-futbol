/**
 * 
 */
package ar.com.futbolprode.negocio.logica.service;

import java.util.List;

import ar.com.futbolprode.negocio.entidades.modelo.Torneo;

/**
 * @author acabrera
 *
 */
public interface TorneoService {
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
