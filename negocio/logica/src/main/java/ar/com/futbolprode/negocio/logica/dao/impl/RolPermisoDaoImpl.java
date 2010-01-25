/**
 * 
 */
package ar.com.futbolprode.negocio.logica.dao.impl;

import ar.com.futbolprode.commons.hibernate.dao.MaestroDao;
import ar.com.futbolprode.negocio.entidades.modelo.usuario.RolPermiso;
import ar.com.futbolprode.negocio.logica.dao.RolPermisoDao;

/**
 * @author acabrera
 * 
 */
public class RolPermisoDaoImpl extends MaestroDao<RolPermiso> implements
		RolPermisoDao {

	public RolPermisoDaoImpl() {
		super(RolPermiso.class);
	}
}
