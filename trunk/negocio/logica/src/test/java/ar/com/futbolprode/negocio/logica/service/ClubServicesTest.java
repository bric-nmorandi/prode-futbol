/**
 * 
 */
package ar.com.futbolprode.negocio.logica.service;

import ar.com.futbolprode.negocio.entidades.modelo.club.Club;

/**
 * @author acabrera
 *
 */
public class ClubServicesTest extends AbstractTest {

	public void testSave(){
		if(this.getClubService().getAll().size()<= CERO){
			Club club = new Club();
			club.setNombre("Central Norte");
			club.setDescripcion("Central norte de salta");
			this.getClubService().save(club);
		}
	}
}
