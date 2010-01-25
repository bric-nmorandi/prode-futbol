/**
 * 
 */
package ar.com.futbolprode.negocio.logica.service.impl;

import java.util.List;

import ar.com.futbolprode.negocio.entidades.modelo.usuario.Permiso;
import ar.com.futbolprode.negocio.logica.dao.PermisoDao;
import ar.com.futbolprode.negocio.logica.service.PermisoService;

/**
 * @author acabrera
 * 
 */
public class PermisoServiceImpl implements PermisoService {

	private PermisoDao permisoDao;

	/*
	 * (non-Javadoc)
	 * 
	 * @see ar.com.futbolprode.negocio.logica.service.PermisoService#getAll()
	 */
	@Override
	public List<Permiso> getAll() {
		return this.permisoDao.getAll();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * ar.com.futbolprode.negocio.logica.service.PermisoService#getById(java
	 * .lang.Integer)
	 */
	@Override
	public Permiso getById(Integer id) {
		return this.permisoDao.getById(id);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * ar.com.futbolprode.negocio.logica.service.PermisoService#save(ar.com.
	 * futbolprode.negocio.entidades.modelo.usuario.Permiso)
	 */
	@Override
	public void save(Permiso permiso) {
		this.permisoDao.save(permiso);

	}

	public PermisoDao getPermisoDao() {
		return permisoDao;
	}

	public void setPermisoDao(PermisoDao permisoDao) {
		this.permisoDao = permisoDao;
	}

}
