/**
 * 
 */
package ar.com.futbolprode.commons.web.input;

import ar.com.futbolprode.commons.web.Constants;

/**
 * @author acabrera
 * 
 */
public class TextInput extends Input<String> {

	protected String value;
	protected String defecto;

	public TextInput() {

	}

	public TextInput(String defecto) {
		this.defecto = defecto;
	}

	public TextInput(String defecto, String value) {
		this.defecto = defecto;
		this.value = value;
	}

	@Override
	public String getDefecto() {
		return this.defecto;
	}

	@Override
	public String getValue() {
		if (this.value == null) {
			return Constants.EMPTY_STRING;
		}
		return this.value;
	}

	@Override
	public boolean isEmpty() {
		return this.value == null || this.value.equals(Constants.EMPTY_STRING);
	}

	@Override
	public boolean isEmptyOrDefault() {
		return this.isEmpty() || this.value.equals(this.defecto);
	}

	@Override
	public void setDefecto(String defecto) {
		this.defecto = defecto;

	}

	@Override
	public void setValue(String value) {
		this.value = value;

	}

}
