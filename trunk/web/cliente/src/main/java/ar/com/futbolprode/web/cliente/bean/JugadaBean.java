/**
 * 
 */
package ar.com.futbolprode.web.cliente.bean;

import java.util.ArrayList;
import java.util.List;

import ar.com.futbolprode.negocio.entidades.modelo.jugada.Jugada;
import ar.com.futbolprode.negocio.entidades.modelo.usuario.Usuario;

/**
 * @author acabrera
 *
 */
public class JugadaBean extends AdministrarBean {

	public List<Jugada> jugadas;

	public Usuario usuario;
	@Override
	protected void init() {
		this.populatedListaJugadas();
	}
	private void populatedListaJugadas(){
		this.usuario=this.getUsuarioService().getById(1);
		procesarSetAListaJugada();
//		OBTENER jugadas de acuerdo a un usuario.		
	}
	private void procesarSetAListaJugada(){
		for (Jugada jugada : this.usuario.getJugadas()) {
			this.getJugadas().add(jugada);
		}
	}
	public List<Jugada> getJugadas() {
		if(this.jugadas==null){
			this.jugadas=new ArrayList<Jugada>();
		}
		return jugadas;
	}

	public void setJugadas(List<Jugada> jugadas) {
		if(this.jugadas==null){
			this.jugadas=new ArrayList<Jugada>();
		}
		this.jugadas = jugadas;
	}
	
	public void modificarJugada(){
//		
	}
	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
}
