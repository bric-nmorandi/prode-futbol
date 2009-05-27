/**
 * 
 */
package ar.com.futbolprode.commons.imagen.dao.impl;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import ar.com.futbolprode.commons.imagen.api.Imagen;
import ar.com.futbolprode.commons.imagen.dao.ImagenDao;

/**
 * @author acabrera
 * 
 */
public class ImagenDaoImpl extends HibernateDaoSupport implements ImagenDao {

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * ar.com.futbolprode.commons.imagen.dao.ImagenDao#getById(java.lang.Integer
	 * )
	 */
	@Override
	public Imagen getById(Integer id) {
		return (Imagen) this.getHibernateTemplate().load(Imagen.class, id);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * ar.com.futbolprode.commons.imagen.dao.ImagenDao#save(ar.com.futbolprode
	 * .commons.imagen.api.Imagen)
	 */
	@Override
	public void save(Imagen imagen) {
		if (imagen.getId() == null) {
			this.getHibernateTemplate().save(imagen);
		} else {
			this.getHibernateTemplate().saveOrUpdate(imagen);
		}

	}

}
