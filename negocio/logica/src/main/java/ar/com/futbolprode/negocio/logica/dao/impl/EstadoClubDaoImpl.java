/**
 * 
 */
package ar.com.futbolprode.negocio.logica.dao.impl;

import java.util.List;

import ar.com.futbolprode.commons.hibernate.dao.MaestroDao;
import ar.com.futbolprode.negocio.entidades.modelo.club.EstadoClub;
import ar.com.futbolprode.negocio.entidades.modelo.torneo.TorneoClub;
import ar.com.futbolprode.negocio.logica.dao.EstadoClubDao;
import ar.com.futbolprode.negocio.logica.dao.TorneoClubDao;

/**
 * @author acabrera
 *
 */
public class EstadoClubDaoImpl extends MaestroDao<EstadoClub> implements EstadoClubDao {

	public EstadoClubDaoImpl() {
		super(EstadoClub.class);
	}

}
