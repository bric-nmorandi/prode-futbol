/**
 * 
 */
package ar.com.futbolprode.negocio.logica.dao.impl;

import java.util.List;

import ar.com.futbolprode.commons.hibernate.dao.MaestroDao;
import ar.com.futbolprode.negocio.entidades.modelo.jugada.Jugada;
import ar.com.futbolprode.negocio.logica.dao.JugadaDao;

/**
 * @author Veronica
 *
 */
public class JugadaDaoImpl extends MaestroDao<Jugada> implements JugadaDao {

	public JugadaDaoImpl() {
		super(Jugada.class);
	}
}
