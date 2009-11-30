/**
 * 
 */
package ar.com.futbolprode.negocio.logica.service.impl;

import java.util.List;

import ar.com.futbolprode.negocio.entidades.modelo.club.EstadoClub;
import ar.com.futbolprode.negocio.logica.dao.EstadoClubDao;
import ar.com.futbolprode.negocio.logica.service.EstadoClubService;

/**
 * Implementacion de {@link EstadoClubService}
 * 
 * @author acabrera
 * @since 28 Nov,2009
 * @see EstadoClub
 * @see EstadoClubDao
 */
public class EstadoClubServiceImpl implements EstadoClubService {

	protected EstadoClubDao estadoClubDao;

	/*
	 * (non-Javadoc)
	 * 
	 * @see ar.com.futbolprode.negocio.logica.service.EstadoClubService#getAll()
	 */
	@Override
	public List<EstadoClub> getAll() {
		return this.estadoClubDao.getAll();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * ar.com.futbolprode.negocio.logica.service.EstadoClubService#getById(java
	 * .lang.Integer)
	 */
	@Override
	public EstadoClub getById(Integer id) {
		return this.estadoClubDao.getById(id);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * ar.com.futbolprode.negocio.logica.service.EstadoClubService#save(ar.com
	 * .futbolprode.negocio.entidades.modelo.club.EstadoClub)
	 */
	@Override
	public void save(EstadoClub estadoClub) {
		this.estadoClubDao.save(estadoClub);

	}

	public EstadoClubDao getEstadoClubDao() {
		return estadoClubDao;
	}

	public void setEstadoClubDao(EstadoClubDao estadoClubDao) {
		this.estadoClubDao = estadoClubDao;
	}
	

}
