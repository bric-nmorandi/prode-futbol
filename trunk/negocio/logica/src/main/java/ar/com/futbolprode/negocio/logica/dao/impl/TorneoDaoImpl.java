/**
 * 
 */
package ar.com.futbolprode.negocio.logica.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import ar.com.futbolprode.negocio.entidades.modelo.torneo.Torneo;
import ar.com.futbolprode.negocio.logica.dao.TorneoDao;

/**
 * @author acabrera
 *
 */
public class TorneoDaoImpl extends HibernateDaoSupport implements TorneoDao {

	/* (non-Javadoc)
	 * @see ar.com.futbolprode.negocio.logica.dao.TorneoDao#getAll()
	 */
	@Override
	public List<Torneo> getAll() {
		return this.getHibernateTemplate().loadAll(Torneo.class);
	}

	/* (non-Javadoc)
	 * @see ar.com.futbolprode.negocio.logica.dao.TorneoDao#getById(java.lang.Integer)
	 */
	@Override
	public Torneo getById(Integer id) {
		return (Torneo)this.getHibernateTemplate().load(Torneo.class, id);
	}

	/* (non-Javadoc)
	 * @see ar.com.futbolprode.negocio.logica.dao.TorneoDao#save(ar.com.futbolprode.negocio.entidades.modelo.Torneo)
	 */
	@Override
	public void save(Torneo torneo) {
		if(torneo.getId() == null){
			this.getHibernateTemplate().save(torneo);
		}else{
			this.getHibernateTemplate().saveOrUpdate(torneo);
		}
	}

}
