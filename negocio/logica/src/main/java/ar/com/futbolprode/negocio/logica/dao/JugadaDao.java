/**
 * 
 */
package ar.com.futbolprode.negocio.logica.dao;

import java.util.List;

import ar.com.futbolprode.negocio.entidades.modelo.jugada.Jugada;

/**
 * @author Veronica
 *
 */
public interface JugadaDao {

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
    
//    List<Jugada> getAllForDate(int fecha);
}
