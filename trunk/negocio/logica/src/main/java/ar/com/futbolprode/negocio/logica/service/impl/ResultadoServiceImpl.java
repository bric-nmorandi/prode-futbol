/**
 * 
 */
package ar.com.futbolprode.negocio.logica.service.impl;

import java.util.List;

import ar.com.futbolprode.negocio.entidades.modelo.torneo.Resultado;
import ar.com.futbolprode.negocio.logica.dao.ResultadoDao;
import ar.com.futbolprode.negocio.logica.service.ResultadoService;

/**
 * @author acabrera
 * 
 */
public class ResultadoServiceImpl implements ResultadoService {

	private ResultadoDao resultadoDao;

	/*
	 * (non-Javadoc)
	 * 
	 * @see ar.com.futbolprode.negocio.logica.service.ResultadoService#getAll()
	 */
	@Override
	public List<Resultado> getAll() {
		return this.resultadoDao.getAll();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * ar.com.futbolprode.negocio.logica.service.ResultadoService#getById(java
	 * .lang.Integer)
	 */
	@Override
	public Resultado getById(Integer id) {
		return this.resultadoDao.getById(id);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * ar.com.futbolprode.negocio.logica.service.ResultadoService#save(ar.com
	 * .futbolprode.negocio.entidades.modelo.torneo.Resultado)
	 */
	@Override
	public void save(Resultado resultado) {
		this.resultadoDao.save(resultado);

	}

	public ResultadoDao getResultadoDao() {
		return resultadoDao;
	}

	public void setResultadoDao(ResultadoDao resultadoDao) {
		this.resultadoDao = resultadoDao;
	}

}
