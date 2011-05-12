/**
 * 
 */
package ar.com.futbolprode.negocio.logica.service.impl;

import java.util.List;

import ar.com.futbolprode.negocio.entidades.modelo.jugada.UsuarioJugada;
import ar.com.futbolprode.negocio.logica.dao.UsuarioJugadaDao;
import ar.com.futbolprode.negocio.logica.service.UsuarioJugadaService;

/**
 * @author acabrera
 * 
 */
public class UsuarioJugadaServiceImpl implements UsuarioJugadaService {

	private UsuarioJugadaDao usuarioJugadaDao;

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * ar.com.futbolprode.negocio.logica.service.UsuarioJugadaService#getAll()
	 */
	@Override
	public List<UsuarioJugada> getAll() {
		return this.usuarioJugadaDao.getAll();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * ar.com.futbolprode.negocio.logica.service.UsuarioJugadaService#getById
	 * (java.lang.Integer)
	 */
	@Override
	public UsuarioJugada getById(Integer id) {
		return this.usuarioJugadaDao.getById(id);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * ar.com.futbolprode.negocio.logica.service.UsuarioJugadaService#save(ar
	 * .com.futbolprode.negocio.entidades.modelo.jugada.UsuarioJugada)
	 */
	@Override
	public void save(UsuarioJugada usuarioJugada) {
		this.usuarioJugadaDao.save(usuarioJugada);

	}

	public UsuarioJugadaDao getUsuarioJugadaDao() {
		return usuarioJugadaDao;
	}

	public void setUsuarioJugadaDao(UsuarioJugadaDao usuarioJugadaDao) {
		this.usuarioJugadaDao = usuarioJugadaDao;
	}

}
