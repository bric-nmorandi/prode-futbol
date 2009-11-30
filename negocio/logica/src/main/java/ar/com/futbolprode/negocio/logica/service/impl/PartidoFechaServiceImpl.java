/**
 * 
 */
package ar.com.futbolprode.negocio.logica.service.impl;

import java.util.List;

import ar.com.futbolprode.negocio.entidades.modelo.torneo.PartidoFecha;
import ar.com.futbolprode.negocio.logica.dao.PartidoFechaDao;
import ar.com.futbolprode.negocio.logica.service.PartidoFechaService;

/**
 * @author acabrera
 * @since 28 Nov,2009
 */
public class PartidoFechaServiceImpl implements PartidoFechaService {

	private PartidoFechaDao partidoFechaDao;

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * ar.com.futbolprode.negocio.logica.service.PartidoFechaService#getAll()
	 */
	@Override
	public List<PartidoFecha> getAll() {
		return this.partidoFechaDao.getAll();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * ar.com.futbolprode.negocio.logica.service.PartidoFechaService#getById
	 * (java.lang.Integer)
	 */
	@Override
	public PartidoFecha getById(Integer id) {
		return this.partidoFechaDao.getById(id);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * ar.com.futbolprode.negocio.logica.service.PartidoFechaService#save(ar
	 * .com.futbolprode.negocio.entidades.modelo.torneo.PartidoFecha)
	 */
	@Override
	public void save(PartidoFecha partidoFecha) {
		this.partidoFechaDao.save(partidoFecha);

	}

	public PartidoFechaDao getPartidoFechaDao() {
		return partidoFechaDao;
	}

	public void setPartidoFechaDao(PartidoFechaDao partidoFechaDao) {
		this.partidoFechaDao = partidoFechaDao;
	}

}
