/**
 * 
 */
package ar.com.futbolprode.negocio.logica.dao;

import java.util.List;

import ar.com.futbolprode.negocio.entidades.modelo.torneo.Resultado;

/**
 * @author acabrera
 * @since 28 Nov,2009
 */
public interface ResultadoDao {

	/**
	 * 
	 * @param id
	 * @return
	 */
	Resultado getById(Integer id);

	/**
	 * 
	 * @return
	 */
	List<Resultado> getAll();

	/**
	 * 
	 * @param resultado
	 */
	void save(Resultado resultado);
}
