package ar.com.futbolprode.commons.imagen.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import ar.com.futbolprode.commons.imagen.api.Thumsnail;
import ar.com.futbolprode.commons.imagen.dao.ThumsnailDao;

public class ThumsnailDaoImpl extends HibernateDaoSupport implements ThumsnailDao {

	@Override
	public List<Thumsnail> getAll() {
		return this.getHibernateTemplate().loadAll(Thumsnail.class);
	}

	@Override
	public Thumsnail getById(Integer id) {
		return (Thumsnail)this.getHibernateTemplate().load(Thumsnail.class, id);
	}

	@Override
	public void save(Thumsnail thumsnail) {
		if(thumsnail.getId() == null){
			this.getHibernateTemplate().save(thumsnail);
		}else{
			this.getHibernateTemplate().saveOrUpdate(thumsnail);
		}

	}

}
