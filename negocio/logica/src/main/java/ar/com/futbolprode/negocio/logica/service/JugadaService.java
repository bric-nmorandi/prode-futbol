/**
 * 
 */
package ar.com.futbolprode.negocio.logica.service;

import java.util.List;

import ar.com.futbolprode.negocio.entidades.modelo.club.Club;
import ar.com.futbolprode.negocio.entidades.modelo.jugada.Jugada;

/**
 * @author Veronica
 *
 */
public interface JugadaService {

	/**
	 * 
	 * @param jugada
	 */
    void save(Jugada jugada);
    /**
     * 
     * @param integer
     * @return
     */
    Jugada getById(Integer integer);
    /**
     * 
     * @return
     */
    List<Jugada> getAll();
}
