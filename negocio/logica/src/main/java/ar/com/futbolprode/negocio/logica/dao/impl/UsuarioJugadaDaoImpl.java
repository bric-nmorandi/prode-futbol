/**
 * 
 */
package ar.com.futbolprode.negocio.logica.dao.impl;

import java.util.List;

import org.hibernate.Criteria;

import ar.com.futbolprode.commons.hibernate.dao.MaestroDao;
import ar.com.futbolprode.negocio.entidades.modelo.jugada.UsuarioJugada;
import ar.com.futbolprode.negocio.logica.dao.UsuarioJugadaDao;

/**
 * @author acabrera
 *
 */
public class UsuarioJugadaDaoImpl extends MaestroDao<UsuarioJugada> implements
		UsuarioJugadaDao {

	public UsuarioJugadaDaoImpl() {
		super(UsuarioJugada.class);
	}
	
	@Override
	public List<UsuarioJugada> getByFecha(int fecha) {
		Criteria criteria=getSession().createCriteria(UsuarioJugada.class);
		
		return null;
	}

}
