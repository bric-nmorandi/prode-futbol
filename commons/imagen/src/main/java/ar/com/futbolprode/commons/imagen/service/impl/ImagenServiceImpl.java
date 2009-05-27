/**
 * 
 */
package ar.com.futbolprode.commons.imagen.service.impl;

import ar.com.futbolprode.commons.imagen.api.Imagen;
import ar.com.futbolprode.commons.imagen.dao.ImagenDao;
import ar.com.futbolprode.commons.imagen.service.ImagenService;

/**
 * @author acabrera
 * 
 */
public class ImagenServiceImpl implements ImagenService {

	protected ImagenDao imagenDao;

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * ar.com.futbolprode.commons.imagen.service.ImagenService#getById(java.
	 * lang.Integer)
	 */
	@Override
	public Imagen getById(Integer id) {
		return this.imagenDao.getById(id);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @seear.com.futbolprode.commons.imagen.service.ImagenService#save(ar.com.
	 * futbolprode.commons.imagen.api.Imagen)
	 */
	@Override
	public void save(Imagen imagen) {
		this.imagenDao.save(imagen);

	}

	public ImagenDao getImagenDao() {
		return imagenDao;
	}

	public void setImagenDao(ImagenDao imagenDao) {
		this.imagenDao = imagenDao;
	}

}
