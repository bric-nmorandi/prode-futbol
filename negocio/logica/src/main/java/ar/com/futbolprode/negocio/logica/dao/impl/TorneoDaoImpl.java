/**
 * 
 */
package ar.com.futbolprode.negocio.logica.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import ar.com.futbolprode.commons.hibernate.dao.MaestroDao;
import ar.com.futbolprode.negocio.entidades.modelo.torneo.Torneo;
import ar.com.futbolprode.negocio.logica.dao.TorneoDao;

/**
 * @author acabrera
 *
 */
public class TorneoDaoImpl extends MaestroDao<Torneo> implements TorneoDao {

	public TorneoDaoImpl() {
		super(Torneo.class);
	}


}
