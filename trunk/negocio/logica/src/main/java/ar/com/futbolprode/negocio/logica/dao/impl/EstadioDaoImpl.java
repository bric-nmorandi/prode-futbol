/**
 * 
 */
package ar.com.futbolprode.negocio.logica.dao.impl;

import java.util.List;

import ar.com.futbolprode.commons.hibernate.dao.MaestroDao;
import ar.com.futbolprode.negocio.entidades.modelo.liga.Estadio;
import ar.com.futbolprode.negocio.logica.dao.EstadioDao;

/**
 * @author acabrera
 *
 */
public class EstadioDaoImpl extends MaestroDao<Estadio> implements EstadioDao {

	public EstadioDaoImpl() {
		super(Estadio.class);
	}	

}
