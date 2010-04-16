/**
 * 
 */
package ar.com.futbolprode.negocio.logica.service;

import ar.com.futbolprode.negocio.entidades.modelo.jugada.Jugada;
import ar.com.futbolprode.negocio.entidades.modelo.torneo.FechaTorneo;
import ar.com.futbolprode.negocio.entidades.modelo.torneo.PartidoFecha;
import ar.com.futbolprode.negocio.entidades.modelo.torneo.Resultado;

/**
 * @author acabrera
 *
 */
public class JugadaServicesTest extends AbstractTest {

	public void testSave(){
		if(this.getJugadaService().getAll().size()<=CERO){
			FechaTorneo fechaTorneo = this.getFechaTorneoService().getById(UNO);
			if(fechaTorneo!=null){
				for (PartidoFecha partidoFecha : fechaTorneo.getPartidos()) {
					Jugada jugada=new Jugada(partidoFecha,new Resultado('V'));
					this.getJugadaService().save(jugada);
				}
			}
			
			
		}
	}
	
	public void testPuntosPorJugada(){
		FechaTorneo fechaTorneo = this.getFechaTorneoService().getById(UNO);
		if(fechaTorneo!=null){
			
		}
	}
}
