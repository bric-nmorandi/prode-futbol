/**
 * 
 */
package ar.com.futbolprode.negocio.logica.dao.impl;

import java.util.List;

import ar.com.futbolprode.commons.hibernate.dao.MaestroDao;
import ar.com.futbolprode.negocio.entidades.modelo.grupo.Grupo;
import ar.com.futbolprode.negocio.logica.dao.GrupoDao;

/**
 * @author acabrera
 *
 */
public class GrupoDaoImpl extends MaestroDao<Grupo> implements GrupoDao {

	public GrupoDaoImpl() {
		super(Grupo.class);
	}
}
