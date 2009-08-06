package ar.com.futbolprode.negocio.logica.dao;

import java.util.List;

import ar.com.futbolprode.negocio.entidades.modelo.club.EstadoClub;

/**
 * 
 * @author acabrera
 *
 */
public interface EstadoClubDao {
	/**
	 * 
	 * @param estadoClub
	 */
	void save(EstadoClub estadoClub);
	/**
	 * 
	 * @param id
	 * @return
	 */
	EstadoClub getById(Integer id);
	/**
	 * 
	 * @return
	 */
	List<EstadoClub> getAll();
}
