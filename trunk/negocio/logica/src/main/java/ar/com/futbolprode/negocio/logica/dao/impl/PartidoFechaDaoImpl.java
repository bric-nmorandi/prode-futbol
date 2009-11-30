/**
 * 
 */
package ar.com.futbolprode.negocio.logica.dao.impl;


import ar.com.futbolprode.commons.hibernate.dao.MaestroDao;
import ar.com.futbolprode.negocio.entidades.modelo.torneo.PartidoFecha;
import ar.com.futbolprode.negocio.logica.dao.PartidoFechaDao;

/**
 * @author acabrera
 * @since 28 Nov,2009
 * @see MaestroDao
 * @see PartidoFechaDao
 */
public class PartidoFechaDaoImpl extends MaestroDao<PartidoFecha> implements
		PartidoFechaDao {

	public PartidoFechaDaoImpl() {
		super(PartidoFecha.class);
	}
}
