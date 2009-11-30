/**
 * 
 */
package ar.com.futbolprode.negocio.logica.service;

import java.util.List;

import ar.com.futbolprode.negocio.entidades.modelo.torneo.Resultado;

/**
 * @author acabrera
 *
 */
public interface ResultadoService {

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
