/**
 * 
 */
package ar.com.futbolprode.negocio.logica.service.impl;

import java.util.List;

import ar.com.futbolprode.negocio.entidades.modelo.usuario.RolPermiso;
import ar.com.futbolprode.negocio.logica.dao.RolPermisoDao;
import ar.com.futbolprode.negocio.logica.service.RolPermisoService;

/**
 * @author acabrera
 * 
 */
public class RolPermisoServiceImpl implements RolPermisoService {

	private RolPermisoDao rolPermisoDao;

	/*
	 * (non-Javadoc)
	 * 
	 * @see ar.com.futbolprode.negocio.logica.service.RolPermisoService#getAll()
	 */
	@Override
	public List<RolPermiso> getAll() {
		return this.rolPermisoDao.getAll();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * ar.com.futbolprode.negocio.logica.service.RolPermisoService#getById(java
	 * .lang.Integer)
	 */
	@Override
	public RolPermiso getById(Integer id) {
		return this.rolPermisoDao.getById(id);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * ar.com.futbolprode.negocio.logica.service.RolPermisoService#save(ar.com
	 * .futbolprode.negocio.entidades.modelo.usuario.RolPermiso)
	 */
	@Override
	public void save(RolPermiso rolPermiso) {
		this.rolPermisoDao.save(rolPermiso);

	}

	public RolPermisoDao getRolPermisoDao() {
		return rolPermisoDao;
	}

	public void setRolPermisoDao(RolPermisoDao rolPermisoDao) {
		this.rolPermisoDao = rolPermisoDao;
	}

}
