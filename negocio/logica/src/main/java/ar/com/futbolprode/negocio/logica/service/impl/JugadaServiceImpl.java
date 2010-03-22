/**
 * 
 */
package ar.com.futbolprode.negocio.logica.service.impl;

import java.util.List;

import ar.com.futbolprode.negocio.entidades.modelo.jugada.Jugada;
import ar.com.futbolprode.negocio.logica.dao.JugadaDao;
import ar.com.futbolprode.negocio.logica.service.JugadaService;

/**
 * @author Veronica
 *
 */
public class JugadaServiceImpl implements JugadaService {


	private JugadaDao jugadaDao;	
	
	@Override
	public List<Jugada> getAll() {
		return this.jugadaDao.getAll();
	}

	@Override
	public Jugada getById(Integer integer) {
		return this.jugadaDao.getById(integer);
	}

	@Override
	public void save(Jugada jugada) {
		this.jugadaDao.save(jugada);		
	}

	public JugadaDao getJugadaDao() {
		return jugadaDao;
	}

	public void setJugadaDao(JugadaDao jugadaDao) {
		this.jugadaDao = jugadaDao;
	}



}
