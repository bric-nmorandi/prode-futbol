package ar.com.futbolprode.commons.web.bean.mode;



/**
 * Representa un modo de funcionamiento de un backing bean. Generalmente Create,
 * Update, Delete, etc. Permite definir los outcomes asociados al modo.
 * 
 * @author acabrera,vvelastiqui
 * */
public class BeanMode {

	private String nombre;

	public BeanMode(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * Indica si este modo se encuentra activo.
	 * */
	private boolean activo = false;

	/**
	 * Outcome al que debe dirigir el bean estando en este modo, en caso de
	 * exito.
	 * */
	private String outcomeSuccess;

	/**
	 * Outcome al que debe dirigir el bean estando en este modo, en caso de
	 * error.
	 * */
	private String outcomeError;

	public void setActivo(boolean activo) {
		this.activo = activo;
	}

	public Boolean isActivo() {
		return activo;
	}

	public void setOutcomeSuccess(String outcomeSuccess) {
		this.outcomeSuccess = outcomeSuccess;
	}

	public String getOutcomeSuccess() {
		return outcomeSuccess;
	}

	public void setOutcomeError(String outcomeError) {
		this.outcomeError = outcomeError;
	}

	public String getOutcomeError() {
		return outcomeError;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	@Override
	public String toString() {
		return "Modo: " + this.nombre + " (" + this.activo + ")";
	}

}
