/**
 * 
 */
package ar.com.futbolprode.commons.web.input;

import java.util.ArrayList;
import java.util.List;

import javax.faces.model.SelectItem;

import ar.com.futbolprode.commons.auditor.Auditor;
import ar.com.futbolprode.commons.web.faces.UtilFaces;

/**
 * @author acabrera
 * 
 */
public class ComboInput<T extends Auditor> extends Input<T> {

	protected T value;

	protected T defecto;

	protected List<T> list;
	protected List<SelectItem> selectItems;
	protected List<SelectItem> selectItemsConDefault;

	public ComboInput() {
		this.defecto = null;
		this.list = new ArrayList<T>();
	}

	@Override
	public T getDefecto() {
		return (T) this.defecto;
	}

	@Override
	public T getValue() {
		return (T) this.value;
	}

	@Override
	public boolean isEmpty() {
		return this.value == null;
	}

	@Override
	public boolean isEmptyOrDefault() {
		return this.isEmpty() || this.value.equals(this.defecto);
	}

	@Override
	public void setDefecto(T defecto) {
		this.defecto = defecto;

	}

	@Override
	public void setValue(T value) {
		this.value = value;

	}

	public List<T> getList() {
		return list;
	}

	public void setList(List<T> list) {
		this.list = list;
	}

	public List<SelectItem> getSelectItems() {
		this.selectItems = UtilFaces.crearListaItemsConAuditEnKey(this.list,
				false);
		return selectItems;
	}

	public List<SelectItem> getSelectItemsConDefault() {
		this.selectItemsConDefault = UtilFaces.crearListaItemsConAuditEnKey(
				this.list, true);
		return selectItemsConDefault;
	}

}
