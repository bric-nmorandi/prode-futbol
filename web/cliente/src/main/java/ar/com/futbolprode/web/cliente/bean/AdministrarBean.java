/**
 * 
 */
package ar.com.futbolprode.web.cliente.bean;

import java.util.ResourceBundle;

import ar.com.futbolprode.commons.web.bean.MultipleModeContainerBean;
import ar.com.futbolprode.negocio.logica.service.ClubService;
import ar.com.futbolprode.negocio.logica.service.TorneoService;

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
					.getBundle("ar/com/futbolprode/web/admin/properties/messages");
		}

		return bundle;
	}

	protected ClubService getClubService() {
		return (ClubService) getService("clubService");
	}

	protected TorneoService getTorneoService() {
		return (TorneoService) getService("torneoService");
	}
}
