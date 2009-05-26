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

	protected static final int CERO = 0;
	private ClubService clubService;
	@Override
	protected String[] getConfigLocations() {
		return new String[] { "classpath:/ar/com/futbolprode/negocio/logica/service/spring-service.xml" };

	}

	public void testTest() {
		System.out.println("Listo");
	}

	public ClubService getClubService() {
		return clubService;
	}

	public void setClubService(ClubService clubService) {
		this.clubService = clubService;
	}
}
