/**
 * 
 */
package ar.com.futbolprode.negocio.logica.dao.impl;


import ar.com.futbolprode.commons.hibernate.dao.MaestroDao;
import ar.com.futbolprode.negocio.entidades.modelo.usuario.Permiso;
import ar.com.futbolprode.negocio.logica.dao.PermisoDao;

/**
 * @author acabrera
 * 
 */
public class PermisoDaoImpl extends MaestroDao<Permiso> implements PermisoDao {

	public PermisoDaoImpl() {
		super(Permiso.class);
	}

}
