/**
 * 
 */
package ar.com.futbolprode.negocio.logica.dao;

import java.util.List;

import ar.com.futbolprode.negocio.entidades.modelo.torneo.FechaTorneo;
import ar.com.futbolprode.negocio.logica.service.FechaTorneoService;

/**
 * 
 * @author acabrera
 * @since 28 Nov,2009
 * @see FechaTorneoService
 */
public interface FechaTorneoDao {

	/**
	 * 
	 * @param id
	 * @return
	 */
	FechaTorneo getById(Integer id);
	/**
	 * 
	 * @return
	 */
	List<FechaTorneo> getAll();
	/**
	 * 
	 * @param fechaTorneo
	 */
	void save(FechaTorneo fechaTorneo);
}
