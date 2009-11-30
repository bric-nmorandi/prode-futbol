/**
 * 
 */
package ar.com.futbolprode.negocio.logica.dao.impl;

import ar.com.futbolprode.commons.hibernate.dao.MaestroDao;
import ar.com.futbolprode.negocio.entidades.modelo.torneo.FechaTorneo;
import ar.com.futbolprode.negocio.logica.dao.FechaTorneoDao;

/**
 * Implementacion de {@link FechaTorneoDao}
 * 
 * @author acabrera
 * @since 28,Nov 2009
 * @see MaestroDao
 * @see FechaTorneoDao
 */
public class FechaTorneoDaoImpl extends MaestroDao<FechaTorneo> implements
		FechaTorneoDao {

	public FechaTorneoDaoImpl() {
		super(FechaTorneo.class);
	}
}
