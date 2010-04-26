/**
 * 
 */
package ar.com.futbolprode.negocio.logica.dao.impl;

import org.hibernate.Criteria;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Restrictions;

import ar.com.futbolprode.commons.hibernate.dao.MaestroDao;
import ar.com.futbolprode.negocio.entidades.modelo.liga.Liga;
import ar.com.futbolprode.negocio.logica.dao.LigaDao;

/**
 * @author acabrera
 * 
 */
public class LigaDaoImpl extends MaestroDao<Liga> implements LigaDao {

	public LigaDaoImpl() {
		super(Liga.class);
	}
	@Override
	public Liga getByDescripcion(String descripcion) {
		Criteria criteria = getSession().createCriteria(Liga.class);
		criteria.add(Restrictions.like("descripcion", descripcion,MatchMode.ANYWHERE));
		if(criteria.list().size()<=CERO){
			return null;	
		}
		return (Liga)criteria.list().get(CERO);
	}
}
