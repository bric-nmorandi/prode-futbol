/**
 * 
 */
package ar.com.futbolprode.commons.hibernate.dao;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import ar.com.futbolprode.commons.auditor.Auditor;

/**
 * @author acabrera
 *
 */
public abstract class MaestroDao <T extends Auditor> extends HibernateDaoSupport {

	public final static int CERO = 0;
	
	private Class<T> entityClass;

	public MaestroDao(Class<T> clazz) {
		this.entityClass = clazz;
	}

	/**
	 * @return Todos los objetos guardados
	 */
	@SuppressWarnings("unchecked")
	public List<T> getAll() {
		return this.getHibernateTemplate().loadAll(entityClass);
	}

	/**
	 * @return El objeto con el id especificado
	 * @param id
	 */
	@SuppressWarnings("unchecked")
	public T getById(Integer id) {
		Object objeto = this.getHibernateTemplate().load(entityClass, id);
		if (objeto!= null)
			return (T) objeto;
		return null;
	}

	/**
	 * Guarda el objeto, actualizando la fecha de creación o modificación del
	 * mismo.
	 * 
	 * @param objeto
	 */
	public void save(T objeto) {
		if (objeto.getId() == null) {
			this.getHibernateTemplate().save(objeto);
		} else {
			this.getHibernateTemplate().saveOrUpdate(objeto);
		}
	}

	/**
	 * Elimina el objeto
	 * */
	public void delete(T objeto) {
		getHibernateTemplate().delete(objeto);
	}

	/**
	 * Elimina el objeto con el id especificado
	 * 
	 * @param id
	 */
	public void delete(Integer id) {
		getHibernateTemplate().delete(this.getById(id));
	}

	/**
	 * Elimina todos los objetos de la colecciï¿œn especificada
	 * 
	 * @param list
	 *            Colección de objetos a eliminar
	 * */
	public void deleteAll(List<T> list) {
		if (list != null && list.size() > 0) {
			getHibernateTemplate().deleteAll(list);
		}
	}
	
	/**
	 * @return La clase de la entidad administrada por este DAO
	 * */
	public Class<T> getEntityClass() {
		return entityClass;
	}

}
