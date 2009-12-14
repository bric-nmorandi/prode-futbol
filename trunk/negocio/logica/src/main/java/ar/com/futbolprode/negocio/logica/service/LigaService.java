package ar.com.futbolprode.negocio.logica.service;

import java.util.List;

import ar.com.futbolprode.negocio.entidades.modelo.liga.Liga;

/**
 * 
 * @author acabrera
 * @since 28 Nov,2009
 */
public interface LigaService {

	/**
	 * 
	 * @param id
	 * @return
	 */
	Liga getById(Integer id);
	/**
	 * 
	 * @return
	 */
	List<Liga> getAll();
	/**
	 * 
	 * @param liga
	 */
	void save(Liga liga);
}
