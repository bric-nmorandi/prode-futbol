/**
 * 
 */
package ar.com.futbolprode.negocio.logica.service.impl;

import java.util.List;

import ar.com.futbolprode.negocio.entidades.modelo.liga.Liga;
import ar.com.futbolprode.negocio.logica.dao.LigaDao;
import ar.com.futbolprode.negocio.logica.service.LigaService;

/**
 * @author acabrera
 * 
 */
public class LigaServiceImpl implements LigaService {

	private LigaDao ligaDao;

	/*
	 * (non-Javadoc)
	 * 
	 * @see ar.com.futbolprode.negocio.logica.service.LigaService#getAll()
	 */
	@Override
	public List<Liga> getAll() {
		return this.ligaDao.getAll();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * ar.com.futbolprode.negocio.logica.service.LigaService#getById(java.lang
	 * .Integer)
	 */
	@Override
	public Liga getById(Integer id) {
		return this.ligaDao.getById(id);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * ar.com.futbolprode.negocio.logica.service.LigaService#save(ar.com.futbolprode
	 * .negocio.entidades.modelo.liga.Liga)
	 */
	@Override
	public void save(Liga liga) {
		this.ligaDao.save(liga);

	}
	
	@Override
	public Liga getBydescripcion(String descripcion) {
		return this.getLigaDao().getByDescripcion(descripcion);
	}

	public LigaDao getLigaDao() {
		return ligaDao;
	}

	public void setLigaDao(LigaDao ligaDao) {
		this.ligaDao = ligaDao;
	}

}
