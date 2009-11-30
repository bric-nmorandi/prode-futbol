/**
 * 
 */
package ar.com.futbolprode.negocio.logica.dao.impl;


import ar.com.futbolprode.commons.hibernate.dao.MaestroDao;
import ar.com.futbolprode.negocio.entidades.modelo.torneo.Resultado;
import ar.com.futbolprode.negocio.logica.dao.ResultadoDao;

/**
 * @author acabrera
 * @since 28 Nov,2009
 * @see MaestroDao
 * @see ResultadoDao 
 */
public class ResultadoDaoImpl extends MaestroDao<Resultado> implements
		ResultadoDao {

	public ResultadoDaoImpl() {
		super(Resultado.class);
	}

}
