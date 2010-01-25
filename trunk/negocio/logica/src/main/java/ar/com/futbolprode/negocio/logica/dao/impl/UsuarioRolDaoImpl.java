/**
 * 
 */
package ar.com.futbolprode.negocio.logica.dao.impl;

import ar.com.futbolprode.commons.hibernate.dao.MaestroDao;
import ar.com.futbolprode.negocio.entidades.modelo.usuario.UsuarioRol;
import ar.com.futbolprode.negocio.logica.dao.UsuarioRolDao;

/**
 * @author acabrera
 * 
 */
public class UsuarioRolDaoImpl extends MaestroDao<UsuarioRol> implements
		UsuarioRolDao {

	public UsuarioRolDaoImpl() {
		super(UsuarioRol.class);
	}

}
