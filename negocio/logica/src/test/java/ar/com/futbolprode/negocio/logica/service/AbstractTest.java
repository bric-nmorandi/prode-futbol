/**
 * 
 */
package ar.com.futbolprode.negocio.logica.service;

import org.springframework.test.AbstractDependencyInjectionSpringContextTests;

/**
 * @author acabrera
 * 
 */
public class AbstractTest extends AbstractDependencyInjectionSpringContextTests {

	@Override
	protected String[] getConfigLocations() {
		return new String[] { "classpath:/ar/com/futbolprode/negocio/logica/service/spring-service.xml" };

	}

	public void testTest() {
		System.out.println("Listo");
	}
}
