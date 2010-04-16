/**
 * 
 */
package ar.com.futbolprode.negocio.logica.service;

import ar.com.futbolprode.negocio.entidades.modelo.torneo.FechaTorneo;
import ar.com.futbolprode.negocio.entidades.modelo.torneo.PartidoFecha;
import ar.com.futbolprode.negocio.entidades.modelo.torneo.Resultado;

/**
 * @author acabrera
 *
 */
public class PartidoFechaServicesTest extends AbstractTest {

	public void testActualizarResultado(){
		FechaTorneo fechaTorneo = this.getFechaTorneoService().getById(new Integer(UNO));
		if(fechaTorneo!=null){
			for (PartidoFecha partidoFecha : fechaTorneo.getPartidos()) {
				partidoFecha.setResultado(new Resultado('L'));
			}
			this.getFechaTorneoService().save(fechaTorneo);
		}
		
	}
}
