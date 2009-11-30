/**
 * 
 */
package ar.com.futbolprode.negocio.logica.service.impl;

import java.util.List;

import ar.com.futbolprode.negocio.entidades.modelo.torneo.TorneoClub;
import ar.com.futbolprode.negocio.logica.dao.TorneoClubDao;
import ar.com.futbolprode.negocio.logica.service.TorneoClubService;

/**
 * @author acabrera
 *
 */
public class TorneoClubServiceImpl implements TorneoClubService {

	protected TorneoClubDao torneoClubDao;
	
	/* (non-Javadoc)
	 * @see ar.com.futbolprode.negocio.logica.service.TorneoClubService#getAll()
	 */
	@Override
	public List<TorneoClub> getAll() {
		return this.torneoClubDao.getAll();
	}

	/* (non-Javadoc)
	 * @see ar.com.futbolprode.negocio.logica.service.TorneoClubService#getById(java.lang.Integer)
	 */
	@Override
	public TorneoClub getById(Integer id) {
		return this.torneoClubDao.getById(id);
	}

	/* (non-Javadoc)
	 * @see ar.com.futbolprode.negocio.logica.service.TorneoClubService#save(ar.com.futbolprode.negocio.entidades.modelo.torneo.TorneoClub)
	 */
	@Override
	public void save(TorneoClub torneoClub) {
		this.torneoClubDao.save(torneoClub);
	}
	
	public void setTorneoClubDao(TorneoClubDao torneoClubDao) {
		this.torneoClubDao = torneoClubDao;
	}

}
