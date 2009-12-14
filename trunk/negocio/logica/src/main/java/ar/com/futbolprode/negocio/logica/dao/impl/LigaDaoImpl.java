/**
 * 
 */
package ar.com.futbolprode.negocio.logica.dao.impl;

import java.util.List;

import ar.com.futbolprode.commons.hibernate.dao.MaestroDao;
import ar.com.futbolprode.negocio.entidades.modelo.liga.Liga;
import ar.com.futbolprode.negocio.logica.dao.LigaDao;

/**
 * @author acabrera
 * 
 */
public class LigaDaoImpl extends MaestroDao<Liga> implements LigaDao {

	public LigaDaoImpl() {
		super(Liga.class);
	}
}
