/**
 * 
 */
package ar.com.futbolprode.negocio.logica.dao.impl;


import ar.com.futbolprode.commons.hibernate.dao.MaestroDao;
import ar.com.futbolprode.negocio.entidades.modelo.usuario.Rol;
import ar.com.futbolprode.negocio.logica.dao.RolDao;

/**
 * @author acabrera
 *
 */
public class RolDaoImpl extends MaestroDao<Rol> implements RolDao {

	public RolDaoImpl() {
		super(Rol.class);
	}
}
