/**
 * 
 */
package ar.com.futbolprode.commons.imagen.service.impl;

import java.util.List;

import ar.com.futbolprode.commons.imagen.api.Thumsnail;
import ar.com.futbolprode.commons.imagen.dao.ThumsnailDao;
import ar.com.futbolprode.commons.imagen.service.ThumsnailService;

/**
 * @author acabrera
 * 
 */
public class ThumsnailServiceImpl implements ThumsnailService {

	protected ThumsnailDao thumsnailDao;

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * ar.com.futbolprode.commons.imagen.service.ThumsnailService#getById(java
	 * .lang.Integer)
	 */
	@Override
	public Thumsnail getById(Integer id) {
		return this.thumsnailDao.getById(id);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see ar.com.futbolprode.commons.imagen.service.ThumsnailService#getAll()
	 */
	@Override
	public List<Thumsnail> getAll() {
		return this.thumsnailDao.getAll();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * ar.com.futbolprode.commons.imagen.service.ThumsnailService#save(ar.com
	 * .futbolprode.commons.imagen.api.Thumsnail)
	 */
	@Override
	public void save(Thumsnail thumsnail) {
		this.thumsnailDao.save(thumsnail);

	}

	public ThumsnailDao getThumsnailDao() {
		return thumsnailDao;
	}

	public void setThumsnailDao(ThumsnailDao thumsnailDao) {
		this.thumsnailDao = thumsnailDao;
	}
}
