/**
 * 
 */
package ar.com.futbolprode.negocio.logica.service.impl;

import java.util.List;

import ar.com.futbolprode.negocio.entidades.modelo.usuario.Usuario;
import ar.com.futbolprode.negocio.logica.dao.UsuarioDao;
import ar.com.futbolprode.negocio.logica.service.UsuarioService;

/**
 * @author acabrera
 * 
 */
public class UsuarioServiceImpl implements UsuarioService {

	private UsuarioDao usuarioDao;

	/*
	 * (non-Javadoc)
	 * 
	 * @see ar.com.futbolprode.negocio.logica.service.UsuarioService#getAll()
	 */
	@Override
	public List<Usuario> getAll() {
		return this.usuarioDao.getAll();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * ar.com.futbolprode.negocio.logica.service.UsuarioService#getById(java
	 * .lang.Integer)
	 */
	@Override
	public Usuario getById(Integer id) {
		return this.usuarioDao.getById(id);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * ar.com.futbolprode.negocio.logica.service.UsuarioService#save(ar.com.
	 * futbolprode.negocio.entidades.modelo.usuario.Usuario)
	 */
	@Override
	public void save(Usuario usuario) {
		this.usuarioDao.save(usuario);

	}

	public UsuarioDao getUsuarioDao() {
		return usuarioDao;
	}

	public void setUsuarioDao(UsuarioDao usuarioDao) {
		this.usuarioDao = usuarioDao;
	}

}
