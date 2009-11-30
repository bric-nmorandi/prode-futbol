/**
 * 
 */
package ar.com.futbolprode.negocio.logica.dao.impl;

import ar.com.futbolprode.commons.hibernate.dao.MaestroDao;
import ar.com.futbolprode.negocio.entidades.modelo.club.Club;
import ar.com.futbolprode.negocio.logica.dao.ClubDao;

/**
 * implementacion de {@link ClubDao}
 * 
 * @author acabrera
 * @since 28 Nov,2009
 * @see MaestroDao
 */
public class ClubDaoImpl extends MaestroDao<Club> implements ClubDao {

	public ClubDaoImpl() {
		super(Club.class);
	}
}
