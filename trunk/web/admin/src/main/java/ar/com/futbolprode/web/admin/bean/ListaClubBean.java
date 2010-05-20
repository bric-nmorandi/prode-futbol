/**
 * 
 */
package ar.com.futbolprode.web.admin.bean;

import java.util.ArrayList;
import java.util.List;

import ar.com.futbolprode.commons.web.Constants;
import ar.com.futbolprode.commons.web.faces.UtilFaces;
import ar.com.futbolprode.negocio.entidades.modelo.club.Club;

/**
 * @author acabrera administrador de clubes
 */
public class ListaClubBean extends AdministrarBean {

	protected List<Club> clubes;

	public static final int ROWS = 10;

	public List<EstadisticasClub> estadisticas;

	public Club clubUpdate;

	public String clubUpdateString;

	@Override
	protected void init() {
		this.populatedListaClub();
		this.cargarEstadisticas();
	}

	public String listarClub() {
		populatedListaClub();
		return Constants.SUCCESS;
	}

	public void cargarEstadisticas() {
		this.estadisticas = new ArrayList<EstadisticasClub>();
		this.estadisticas.add(new EstadisticasClub("nombre1", 10));
		this.estadisticas.add(new EstadisticasClub("nombre2", 20));
	}

	/**
	 * 
	 * @return
	 */
	public String modificarClub() {
		clubUpdateString = (String) UtilFaces.getRequestParameter("paramIdClub");
		clubUpdate = this.getClubService().getById(Integer.valueOf(clubUpdateString));		
		return "abmClub";
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

	public class EstadisticasClub {
		public String nombre;
		public int cantidad;

		public EstadisticasClub(String nombre, int cantidad) {
			this.nombre = nombre;
			this.cantidad = cantidad;
		}

		public EstadisticasClub() {
			// TODO Auto-generated constructor stub
		}

		public String getNombre() {
			return nombre;
		}

		public void setNombre(String nombre) {
			this.nombre = nombre;
		}

		public int getCantidad() {
			return cantidad;
		}

		public void setCantidad(int cantidad) {
			this.cantidad = cantidad;
		}

	}

	public List<EstadisticasClub> getEstadisticas() {
		return estadisticas;
	}

	public void setEstadisticas(List<EstadisticasClub> estadisticas) {
		this.estadisticas = estadisticas;
	}

	public Club getClubUpdate() {
		return clubUpdate;
	}

	public void setClubUpdate(Club clubUpdate) {
		this.clubUpdate = clubUpdate;
	}

	public String getClubUpdateString() {
		return clubUpdateString;
	}

	public void setClubUpdateString(String clubUpdateString) {
		this.clubUpdateString = clubUpdateString;
	}
}
