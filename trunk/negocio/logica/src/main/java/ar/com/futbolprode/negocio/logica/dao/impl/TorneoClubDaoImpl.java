/**
 * 
 */
package ar.com.futbolprode.negocio.logica.dao.impl;

import ar.com.futbolprode.commons.hibernate.dao.MaestroDao;
import ar.com.futbolprode.negocio.entidades.modelo.torneo.TorneoClub;
import ar.com.futbolprode.negocio.logica.dao.TorneoClubDao;

/**
 * @author acabrera
 *
 */
public class TorneoClubDaoImpl extends MaestroDao<TorneoClub> implements TorneoClubDao {

	public TorneoClubDaoImpl() {
		super(TorneoClub.class);
	}

}
