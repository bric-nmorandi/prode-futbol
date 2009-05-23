/**
 * 
 */
package ar.com.futbolprode.negocio.logica.dao.ompl;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;


import ar.com.futbolprode.negocio.entidades.modelo.Club;
import ar.com.futbolprode.negocio.logica.dao.ClubDao;

/**
 * @author acabrera
 * 
 */
public class ClubDaoImpl  extends HibernateDaoSupport  implements ClubDao {

	/*
	 * (non-Javadoc)
	 * 
	 * @see ar.com.futbolprode.negocio.logica.dao.ClubDao#getAll()
	 */
	@Override
	public List<Club> getAll() {
		return this.getHibernateTemplate().loadAll(Club.class);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * ar.com.futbolprode.negocio.logica.dao.ClubDao#getById(java.lang.Integer)
	 */
	@Override
	public Club getById(Integer id) {
		return this.getHibernateTemplate().load(Club.class, id);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * ar.com.futbolprode.negocio.logica.dao.ClubDao#save(ar.com.futbolprode
	 * .negocio.entidades.modelo.Club)
	 */
	@Override
	public void save(Club club) {
		if(club.getId()==null){
			this.getHibernateTemplate().save(club);
		}else{
			this.getHibernateTemplate().saveOrUpdate(club);
		}

	}

}
