/**
 * 
 */
package ar.com.futbolprode.negocio.logica.service;

import ar.com.futbolprode.negocio.entidades.modelo.usuario.Usuario;

/**
 * @author acabrera
 * 
 */
public class UsuarioServicesTest extends AbstractTest {

	/**
	 * 
	 */
	private static final String NOMBRE = "ARTURO";
	/**
	 * 
	 */
	private static final String LOGIN = "turo";
	/**
	 * 
	 */
	private static final String PASSWORD = "123";

	public void testSave() {
		if (this.getUsuarioService().getAll().size() <= CERO) {
			Usuario usuario = new Usuario(NOMBRE, LOGIN, PASSWORD);
			this.getUsuarioService().save(usuario);
		}
	}
}
