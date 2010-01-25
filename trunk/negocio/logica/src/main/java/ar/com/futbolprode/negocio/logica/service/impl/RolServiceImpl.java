/**
 * 
 */
package ar.com.futbolprode.negocio.logica.service.impl;

import java.util.List;

import ar.com.futbolprode.negocio.entidades.modelo.usuario.Rol;
import ar.com.futbolprode.negocio.logica.dao.RolDao;
import ar.com.futbolprode.negocio.logica.service.RolService;

/**
 * @author acabrera
 * 
 */
public class RolServiceImpl implements RolService {

	private RolDao rolDao;

	/*
	 * (non-Javadoc)
	 * 
	 * @see ar.com.futbolprode.negocio.logica.service.RolService#getAll()
	 */
	@Override
	public List<Rol> getAll() {
		return this.rolDao.getAll();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * ar.com.futbolprode.negocio.logica.service.RolService#getById(java.lang
	 * .Integer)
	 */
	@Override
	public Rol getById(Integer id) {
		return this.rolDao.getById(id);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * ar.com.futbolprode.negocio.logica.service.RolService#save(ar.com.futbolprode
	 * .negocio.entidades.modelo.usuario.Rol)
	 */
	@Override
	public void save(Rol rol) {
		this.rolDao.save(rol);

	}

	public RolDao getRolDao() {
		return rolDao;
	}

	public void setRolDao(RolDao rolDao) {
		this.rolDao = rolDao;
	}

}
