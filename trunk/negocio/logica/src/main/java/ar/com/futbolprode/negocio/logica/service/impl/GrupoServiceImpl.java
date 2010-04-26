/**
 * 
 */
package ar.com.futbolprode.negocio.logica.service.impl;

import java.util.List;

import ar.com.futbolprode.negocio.entidades.modelo.grupo.Grupo;
import ar.com.futbolprode.negocio.logica.dao.GrupoDao;
import ar.com.futbolprode.negocio.logica.service.GrupoService;

/**
 * @author acabrera
 *
 */
public class GrupoServiceImpl implements GrupoService {

	private GrupoDao grupoDao;
	/* (non-Javadoc)
	 * @see ar.com.futbolprode.negocio.logica.service.GrupoService#getAll()
	 */
	@Override
	public List<Grupo> getAll() {
		return this.getGrupoDao().getAll();
	}

	/* (non-Javadoc)
	 * @see ar.com.futbolprode.negocio.logica.service.GrupoService#getById(int)
	 */
	@Override
	public Grupo getById(Integer id) {
		return this.getGrupoDao().getById(id);
	}

	/* (non-Javadoc)
	 * @see ar.com.futbolprode.negocio.logica.service.GrupoService#save(ar.com.futbolprode.negocio.entidades.modelo.grupo.Grupo)
	 */
	@Override
	public void save(Grupo grupo) {
		this.grupoDao.save(grupo);
	}

	public GrupoDao getGrupoDao() {
		return grupoDao;
	}

	public void setGrupoDao(GrupoDao grupoDao) {
		this.grupoDao = grupoDao;
	}

}
