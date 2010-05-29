/**
 * 
 */
package ar.com.futbolprode.web.cliente.bean;

import java.util.ResourceBundle;

import ar.com.futbolprode.commons.web.bean.MultipleModeContainerBean;
import ar.com.futbolprode.negocio.logica.service.ClubService;
import ar.com.futbolprode.negocio.logica.service.JugadaService;
import ar.com.futbolprode.negocio.logica.service.TorneoService;
import ar.com.futbolprode.negocio.logica.service.UsuarioService;

/**
 * @author acabrera administrador General de beans
 */
public class AdministrarBean extends MultipleModeContainerBean {

	private ResourceBundle bundle;

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * ar.com.futbolprode.commons.web.bean.MultipleModeContainerBean#defineOutcomes
	 * ()
	 */
	@Override
	protected void defineOutcomes() {
		// TODO Auto-generated method stub

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see ar.com.futbolprode.commons.web.bean.ContainerBean#getBundle()
	 */
	@Override
	public ResourceBundle getBundle() {
		if (bundle == null) {
			bundle = ResourceBundle
					.getBundle("ar/com/futbolprode/web/cliente/properties/messages");
		}

		return bundle;
	}

	protected ClubService getClubService() {
		return (ClubService) getService("clubService");
	}

	protected TorneoService getTorneoService() {
		return (TorneoService) getService("torneoService");
	}
	protected JugadaService getJugadaService(){
		return (JugadaService)getService("jugadaService");
	}
	protected UsuarioService getUsuarioService(){
		return (UsuarioService)getService("usuarioService");
	}
}
