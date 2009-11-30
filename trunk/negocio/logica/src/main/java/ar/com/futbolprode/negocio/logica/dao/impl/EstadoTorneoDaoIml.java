/**
 * 
 */
package ar.com.futbolprode.negocio.logica.dao.impl;



import ar.com.futbolprode.commons.hibernate.dao.MaestroDao;
import ar.com.futbolprode.negocio.entidades.modelo.torneo.EstadoTorneo;
import ar.com.futbolprode.negocio.logica.dao.EstadoTorneoDao;

/**
 * Implementacion de {@link EstadoTorneo}, metodos pertenecientes a la capa DAO
 * @author acabrera
 * @since 28 Nov,2009
 * @see MaestroDao
 * @see EstadoTorneoDao
 */
public class EstadoTorneoDaoIml extends MaestroDao<EstadoTorneo> implements
		EstadoTorneoDao {

	public EstadoTorneoDaoIml() {
		super(EstadoTorneo.class);
	}
}
