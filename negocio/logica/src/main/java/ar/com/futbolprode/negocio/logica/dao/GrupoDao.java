/**
 * 
 */
package ar.com.futbolprode.negocio.logica.dao;

import java.util.List;

import ar.com.futbolprode.negocio.entidades.modelo.grupo.Grupo;

/**
 * @author acabrera
 *
 */
public interface GrupoDao {

	/**
	 * 
	 * @param grupo
	 */
	void save(Grupo grupo);
	/**
	 * 
	 * @param id
	 * @return
	 */
	Grupo getById(Integer id);
	/**
	 * 
	 * @return
	 */
	List<Grupo> getAll();
}
