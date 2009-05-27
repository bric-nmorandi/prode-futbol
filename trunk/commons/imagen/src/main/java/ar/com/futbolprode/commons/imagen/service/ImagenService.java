/**
 * 
 */
package ar.com.futbolprode.commons.imagen.service;

import ar.com.futbolprode.commons.imagen.api.Imagen;

/**
 * @author acabrera
 *
 */
public interface ImagenService {

	/**
	 * 
	 * @param imagen
	 */
	void save(Imagen imagen);
	/**
	 * 
	 * @param id
	 * @return
	 */
	Imagen getById(Integer id);
	
}
