/**
 * 
 */
package ar.com.futbolprode.negocio.logica.service.impl;

import java.util.List;

import ar.com.futbolprode.negocio.entidades.modelo.torneo.Torneo;
import ar.com.futbolprode.negocio.logica.dao.TorneoDao;
import ar.com.futbolprode.negocio.logica.service.TorneoService;

/**
 * @author acabrera
 * 
 */
public class TorneoServiceImpl implements TorneoService {

	protected TorneoDao torneoDao;

	/*
	 * (non-Javadoc)
	 * 
	 * @see ar.com.futbolprode.negocio.logica.service.TorneoService#getAll()
	 */
	@Override
	public List<Torneo> getAll() {
		return this.torneoDao.getAll();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * ar.com.futbolprode.negocio.logica.service.TorneoService#getById(java.
	 * lang.Integer)
	 */
	@Override
	public Torneo getById(Integer id) {
		return this.torneoDao.getById(id);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @seear.com.futbolprode.negocio.logica.service.TorneoService#save(ar.com.
	 * futbolprode.negocio.entidades.modelo.Torneo)
	 */
	@Override
	public void save(Torneo torneo) {
		this.torneoDao.save(torneo);

	}

	public TorneoDao getTorneoDao() {
		return torneoDao;
	}

	public void setTorneoDao(TorneoDao torneoDao) {
		this.torneoDao = torneoDao;
	}

}
