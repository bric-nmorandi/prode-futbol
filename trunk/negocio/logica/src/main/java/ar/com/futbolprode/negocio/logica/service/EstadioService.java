/**
 * 
 */
package ar.com.futbolprode.negocio.logica.service;

import java.util.List;

import ar.com.futbolprode.negocio.entidades.modelo.liga.Estadio;

/**
 * @author acabrera
 *
 */
public interface EstadioService {

	/**
	 * 
	 * @param estadio
	 */
	void save(Estadio estadio);
	/**
	 * 
	 * @param id
	 * @return
	 */
	Estadio getById(Integer id);
	/**
	 * 
	 * @return
	 */
	List<Estadio> getAll();
}
