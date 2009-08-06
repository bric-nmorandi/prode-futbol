/**
 * 
 */
package ar.com.futbolprode.negocio.logica.service.impl;

import java.util.List;

import ar.com.futbolprode.negocio.entidades.modelo.torneo.EstadoTorneo;
import ar.com.futbolprode.negocio.logica.dao.EstadoTorneoDao;
import ar.com.futbolprode.negocio.logica.service.EstadoTorneoService;

/**
 * @author acabrera
 * 
 */
public class EstadoTorneoServiceImpl implements EstadoTorneoService {

	protected EstadoTorneoDao estadoTorneoDao;

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * ar.com.futbolprode.negocio.logica.service.EstadoTorneoService#getAll()
	 */
	@Override
	public List<EstadoTorneo> getAll() {
		return this.estadoTorneoDao.getAll();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * ar.com.futbolprode.negocio.logica.service.EstadoTorneoService#getById
	 * (java.lang.Integer)
	 */
	@Override
	public EstadoTorneo getById(Integer id) {
		return this.estadoTorneoDao.getById(id);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * ar.com.futbolprode.negocio.logica.service.EstadoTorneoService#save(ar
	 * .com.futbolprode.negocio.entidades.modelo.torneo.EstadoTorneo)
	 */
	@Override
	public void save(EstadoTorneo estadoTorneo) {
		this.estadoTorneoDao.save(estadoTorneo);
	}

	public EstadoTorneoDao getEstadoTorneoDao() {
		return estadoTorneoDao;
	}

	public void setEstadoTorneoDao(EstadoTorneoDao estadoTorneoDao) {
		this.estadoTorneoDao = estadoTorneoDao;
	}

}
