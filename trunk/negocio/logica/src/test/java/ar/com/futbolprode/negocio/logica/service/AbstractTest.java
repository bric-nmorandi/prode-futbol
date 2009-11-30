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

	private EstadoClubService estadoClubService;

	private TorneoService torneoService;

	private LigaService ligaService;
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

	public EstadoClubService getEstadoClubService() {
		return estadoClubService;
	}

	public void setEstadoClubService(EstadoClubService estadoClubService) {
		this.estadoClubService = estadoClubService;
	}

	public TorneoService getTorneoService() {
		return torneoService;
	}

	public void setTorneoService(TorneoService torneoService) {
		this.torneoService = torneoService;
	}

	public LigaService getLigaService() {
		return ligaService;
	}

	public void setLigaService(LigaService ligaService) {
		this.ligaService = ligaService;
	}
}
