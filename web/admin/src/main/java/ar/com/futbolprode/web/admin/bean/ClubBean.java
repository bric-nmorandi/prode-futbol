/**
 * 
 */
package ar.com.futbolprode.web.admin.bean;

import ar.com.futbolprode.commons.web.input.TextInput;
import ar.com.futbolprode.negocio.entidades.modelo.club.Club;
import ar.com.futbolprode.negocio.logica.service.ClubService;

/**
 * @author acabrera
 *
 */
public class ClubBean extends AdministrarBean {

	protected Club club; 
	
	protected ClubService clubService;
	
	protected TextInput nombre;
	
	protected TextInput descripcion;
	
	public String clubString;
	
	@Override
	protected void init() {		
		cargarClub();
	}
	
	protected void cargarClub(){
		if(club!=null){
			nombre.setValue(club.getNombre());
		}
		//club = this.getClubService().getById(id);
	}

	protected void saveClub(){
		//TODO	
	}
	protected void cancel(){
		//TODO
	}
	
	public Club getClub() {
		return club;
	}

	public void setClub(Club club) {
		this.club = club;
	}

	public ClubService getClubService() {
		return (ClubService)this.getService("clubService");
	}

	public TextInput getNombre() {
		return nombre;
	}

	public void setNombre(TextInput nombre) {
		this.nombre = nombre;
	}

	public TextInput getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(TextInput descripcion) {
		this.descripcion = descripcion;
	}

	public String getClubString() {
		return clubString;
	}

	public void setClubString(String clubString) {
		this.clubString = clubString;
	}
	
}
