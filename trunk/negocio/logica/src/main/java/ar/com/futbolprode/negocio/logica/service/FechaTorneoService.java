/**
 * 
 */
package ar.com.futbolprode.negocio.logica.service;

import java.util.List;

import ar.com.futbolprode.negocio.entidades.modelo.torneo.FechaTorneo;

/**
 * @author acabrera
 * @since 28 Nov,2009
 */
public interface FechaTorneoService {

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
