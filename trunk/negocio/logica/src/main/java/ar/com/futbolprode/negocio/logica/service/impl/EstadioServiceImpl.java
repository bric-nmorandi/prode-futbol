/**
 * 
 */
package ar.com.futbolprode.negocio.logica.service.impl;

import java.util.List;

import ar.com.futbolprode.negocio.entidades.modelo.liga.Estadio;
import ar.com.futbolprode.negocio.logica.dao.EstadioDao;
import ar.com.futbolprode.negocio.logica.service.EstadioService;

/**
 * @author acabrera
 *
 */
public class EstadioServiceImpl implements EstadioService{

	private EstadioDao estadioDao;
	@Override
	public List<Estadio> getAll() {
		return this.estadioDao.getAll();
	}

	@Override
	public Estadio getById(Integer id) {
		return this.estadioDao.getById(id);
	}

	@Override
	public void save(Estadio estadio) {
		this.estadioDao.save(estadio);
	}

	public EstadioDao getEstadioDao() {
		return estadioDao;
	}

	public void setEstadioDao(EstadioDao estadioDao) {
		this.estadioDao = estadioDao;
	}

}
