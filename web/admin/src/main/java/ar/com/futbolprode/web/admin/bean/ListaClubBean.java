/**
 * 
 */
package ar.com.futbolprode.web.admin.bean;

import java.util.ArrayList;
import java.util.List;

import ar.com.futbolprode.commons.web.Constants;
import ar.com.futbolprode.negocio.entidades.modelo.club.Club;

/**
 * @author acabrera
 * administrador de clubes
 */
public class ListaClubBean extends AdministrarBean {

	protected List<Club> clubes;

	public static final int ROWS=10;
	
	@Override
	protected void init() {
		this.populatedListaClub();
	}

	public String listarClub() {
		populatedListaClub();
		return Constants.SUCCESS;
	}

	/**
	 * obtento una lista con todos los clubes en la base de datos
	 * 
	 */
	protected void populatedListaClub() {
		if (this.clubes == null) {
			this.clubes = new ArrayList<Club>();
		}
		this.clubes = this.getClubService().getAll();
	}

	public List<Club> getClubes() {
		if (this.clubes == null) {
			this.clubes = new ArrayList<Club>();
			populatedListaClub();
		}
		return clubes;
	}

	public void setClubes(List<Club> clubes) {
		if (this.clubes == null) {
			this.clubes = new ArrayList<Club>();
		}
		this.clubes = clubes;
	}

	public int getROWS() {
		return ROWS;
	}
}
