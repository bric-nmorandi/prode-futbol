/**
 * 
 */
package ar.com.futbolprode.negocio.logica.service.impl;

import java.util.List;

import ar.com.futbolprode.negocio.entidades.modelo.torneo.FechaTorneo;
import ar.com.futbolprode.negocio.logica.dao.FechaTorneoDao;
import ar.com.futbolprode.negocio.logica.service.FechaTorneoService;

/**
 * @author acabrera
 * 
 */
public class FechaTorneoServiceImpl implements FechaTorneoService {

	private FechaTorneoDao fechaTorneoDao;

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * ar.com.futbolprode.negocio.logica.service.FechaTorneoService#getAll()
	 */
	@Override
	public List<FechaTorneo> getAll() {
		return this.fechaTorneoDao.getAll();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * ar.com.futbolprode.negocio.logica.service.FechaTorneoService#getById(
	 * java.lang.Integer)
	 */
	@Override
	public FechaTorneo getById(Integer id) {
		return this.fechaTorneoDao.getById(id);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * ar.com.futbolprode.negocio.logica.service.FechaTorneoService#save(ar.
	 * com.futbolprode.negocio.entidades.modelo.torneo.FechaTorneo)
	 */
	@Override
	public void save(FechaTorneo fechaTorneo) {
		this.fechaTorneoDao.save(fechaTorneo);

	}

	public FechaTorneoDao getFechaTorneoDao() {
		return fechaTorneoDao;
	}

	public void setFechaTorneoDao(FechaTorneoDao fechaTorneoDao) {
		this.fechaTorneoDao = fechaTorneoDao;
	}

}
