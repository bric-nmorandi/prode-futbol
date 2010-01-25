/**
 * 
 */
package ar.com.futbolprode.negocio.logica.service.impl;

import java.util.List;

import ar.com.futbolprode.negocio.entidades.modelo.usuario.UsuarioRol;
import ar.com.futbolprode.negocio.logica.dao.UsuarioRolDao;
import ar.com.futbolprode.negocio.logica.service.UsuarioRolService;

/**
 * @author acabrera
 * 
 */
public class UsuarioRolServiceImpl implements UsuarioRolService {

	private UsuarioRolDao usuarioRolDao;

	/*
	 * (non-Javadoc)
	 * 
	 * @see ar.com.futbolprode.negocio.logica.service.UsuarioRolService#getAll()
	 */
	@Override
	public List<UsuarioRol> getAll() {
		return this.usuarioRolDao.getAll();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * ar.com.futbolprode.negocio.logica.service.UsuarioRolService#getById(java
	 * .lang.Integer)
	 */
	@Override
	public UsuarioRol getById(Integer id) {
		return this.usuarioRolDao.getById(id);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * ar.com.futbolprode.negocio.logica.service.UsuarioRolService#save(ar.com
	 * .futbolprode.negocio.entidades.modelo.usuario.UsuarioRol)
	 */
	@Override
	public void save(UsuarioRol usuarioRol) {
		this.usuarioRolDao.save(usuarioRol);

	}

	public UsuarioRolDao getUsuarioRolDao() {
		return usuarioRolDao;
	}

	public void setUsuarioRolDao(UsuarioRolDao usuarioRolDao) {
		this.usuarioRolDao = usuarioRolDao;
	}

}
