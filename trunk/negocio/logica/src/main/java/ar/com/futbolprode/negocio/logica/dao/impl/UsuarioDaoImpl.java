/**
 * 
 */
package ar.com.futbolprode.negocio.logica.dao.impl;



import ar.com.futbolprode.commons.hibernate.dao.MaestroDao;
import ar.com.futbolprode.negocio.entidades.modelo.usuario.Usuario;
import ar.com.futbolprode.negocio.logica.dao.UsuarioDao;

/**
 * @author acabrera
 *
 */
public class UsuarioDaoImpl extends MaestroDao<Usuario> implements UsuarioDao {

	public UsuarioDaoImpl() {
		super(Usuario.class);
	}

}
