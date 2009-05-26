/**
 * 
 */
package ar.com.futbolprode.negocio.logica.service.impl;

import java.util.List;

import ar.com.futbolprode.negocio.entidades.modelo.club.Club;
import ar.com.futbolprode.negocio.logica.dao.ClubDao;
import ar.com.futbolprode.negocio.logica.service.ClubService;

/**
 * @author acabrera
 *
 */
public class ClubServiceImpl implements ClubService {

	protected ClubDao clubDao;
	/* (non-Javadoc)
	 * @see ar.com.futbolprode.negocio.logica.service.ClubService#getAll()
	 */
	@Override
	public List<Club> getAll() {
		return this.clubDao.getAll();
	}

	/* (non-Javadoc)
	 * @see ar.com.futbolprode.negocio.logica.service.ClubService#getById(java.lang.Integer)
	 */
	@Override
	public Club getById(Integer id) {
		return this.clubDao.getById(id);
	}

	/* (non-Javadoc)
	 * @see ar.com.futbolprode.negocio.logica.service.ClubService#save(ar.com.futbolprode.negocio.entidades.modelo.Club)
	 */
	@Override
	public void save(Club club) {
		this.clubDao.save(club);

	}

	public ClubDao getClubDao() {
		return clubDao;
	}

	public void setClubDao(ClubDao clubDao) {
		this.clubDao = clubDao;
	}

}
