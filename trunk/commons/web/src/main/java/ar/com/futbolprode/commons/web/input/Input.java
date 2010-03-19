package ar.com.futbolprode.commons.web.input;



/**
 * Clase abstracta para representar un input de un form
 * 
 * @author f.gonzalez
 * */
public abstract class Input<T> {

	/**
	 * Setea el valor del campo.
	 * */
	public abstract void setValue(T value);

	/**
	 * Devuelve el valor actual del campo.
	 * */
	public abstract T getValue();

	/**
	 * Define el valor por defecto del campo.
	 * */
	public abstract void setDefecto(T defecto);

	/**
	 * Devuelve el valor por defecto del campo.
	 * */
	public abstract T getDefecto();
	
	/**
	 * Pone el campo en null.
	 * */
	public void clear() {
		setValue(null);
	}
	
	/**
	 * Setea el campo a su valor por defecto.
	 * */
	public void reset() {
		setValue(getDefecto());
	}
	
	/**
	 * @return true si no se ingreso ningun valor al campo
	 * */
	public abstract boolean isEmpty();	
	
	/**
	 * @return true si no se ingreso ningun valor al campo o est� seteado en su valor por defecto
	 * */
	public abstract boolean isEmptyOrDefault();	

	@Override
	public String toString() {
		if (getValue() != null)
			return getValue().toString();
		else
			return "";
	}

	@SuppressWarnings("unchecked")
	@Override
	public boolean equals(Object obj) {
		if (getValue() == null) {
			return false;
		} 
		
		if (obj instanceof Input) {
			return getValue().equals(((Input) obj).getValue());
		}
		
		return false;			
	}
}
