/**
 * 
 */
package ar.com.futbolprode.commons.imagen.service;

import java.util.List;

import ar.com.futbolprode.commons.imagen.api.Thumsnail;

/**
 * @author acabrera
 *
 */
public interface ThumsnailService {

	/**
	 * 
	 * @param thumsnail
	 */
	void save(Thumsnail thumsnail);
	/**
	 * 
	 * @param id
	 * @return
	 */
	Thumsnail getById(Integer id);
	/**
	 * 
	 * @return
	 */
	List<Thumsnail> getAll();
}
