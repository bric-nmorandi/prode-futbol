package ar.com.futbolprode.commons.web.bean;



import java.util.ArrayList;
import java.util.List;

import org.apache.myfaces.custom.datalist.HtmlDataList;


import ar.com.futbolprode.commons.web.UtilJava;
import ar.com.futbolprode.commons.web.faces.UtilFaces;


/**
 * Ejemplo de utilizaci�n de este bean:
 * 
 * <pre>
 * 	&lt;t:dataList var=&quot;item&quot; layout=&quot;unorderedList&quot; styleClass=&quot;menu clearfix&quot; 
 * 		itemStyleClass=&quot;#{item.styleClass}&quot; value=&quot;#{menuBean.items}&quot; binding=&quot;#{menuBean.itemList}&quot; &gt;
 * 		&lt;f:attribute name=&quot;mark&quot; value=&quot;#{mark}&quot; /&gt;
 * 		&lt;h:commandLink action=&quot;#{item.action}&quot;&gt;
 * 			&lt;span&gt;&lt;h:outputText value=&quot;#{item.text}&quot; /&gt;&lt;/span&gt;
 * 		&lt;/h:commandLink&gt;
 * 	&lt;/t:dataList&gt;
 * </pre>
 * 
 * @author f.gonzalez
 * */
public abstract class AbstractMenuBean {

	public class Item {
		/** Estilo a ser aplicaco al item */
		private String styleClass;
		/** Outocome devuelto al hacer click sobre el item */
		private String action;
		/** Etiqueta mostrada */
		private String text;
		/** Rol requerido para mostrar el item */
		private String role;

		public Item(String styleClass, String action, String text, String role) {
			this.styleClass = styleClass;
			this.action = action;
			this.text = text;
			this.role = role;
		}

		public String getStyleClass() {
			return styleClass;
		}

		public void setStyleClass(String styleClass) {
			this.styleClass = styleClass;
		}

		public String getText() {
			return text;
		}

		public void setText(String text) {
			this.text = text;
		}

		/**
		 * Getter sin get. M�todo que se llama al hacer click sobre una opci�n
		 * del men�.
		 * */
		public String action() {
			return action;
		}

		public void setRole(String role) {
			this.role = role;
		}

		public String getRole() {
			return role;
		}
	}

	/** Lista de items disponibles. */
	private List<Item> itemsDisponibles;

	/** Lista de items a mostrar. Se llama desde la jsp para renderizar el men�. */
	private List<Item> items;

	/** Este atributo se usa solo para pasar la mark como par�metro */
	private HtmlDataList itemList;

	/**
	 * En este m�todo se deben crear los {@link Item} que podr� mostrar el men�.
	 * */
	protected abstract List<Item> crearItems();

	/**
	 * Devuelve la clase a aplicar al item que se est� mostrando actualmente.
	 * */
	protected abstract String getItemActivoStyleClass();

	/**
	 * Si este atributo es true, la lista de items a mostrar solo se popula
	 * cuando items es nulo (i.e., si se quiere volver a popular en determinado
	 * momento, hacer <code>setItems(null)</code>. Si es false, la lista de
	 * items a mostrar se repopula cada vez que se llama a {@link getItems()}.
	 * */
	private boolean repopularSoloSiNull = true;

	public List<Item> getItems() {
		if (items == null || !isRepopularSoloSiNull()) {
			populateItems();
		}

		String mark = (String) itemList.getAttributes().get("mark");

		for (Item item : items) {
			if (item.action.equals(mark)) {
				item.setStyleClass(getItemActivoStyleClass());
			} else {
				item.setStyleClass("");
			}
		}

		itemList.getAttributes().remove("mark");

		return items;
	}

	public void setItems(List<Item> items) {
		this.items = items;
	}

	/**
	 * Popula la lista de items a mostrar, seg�n el rol de usuario logueado.
	 * */
	private void populateItems() {
		if(itemsDisponibles == null) {
			itemsDisponibles = crearItems();
		}
		
		items = new ArrayList<Item>();

		for (Item item : itemsDisponibles) {

			if (!UtilJava.isEmpty(item.getRole())) {
				/*
				 * Si hay un rol definido, muestro el item solo si el usuario
				 * cumple con ese rol
				 */
				if (UtilFaces.isUserInRole(item.getRole())) {
					items.add(item);
				}
			} else {
				/* Si el item no tiene un rol definido se muestra siempre */
				items.add(item);
			}
		}
	}

	public HtmlDataList getItemList() {
		return itemList;
	}

	public void setItemList(HtmlDataList itemList) {
		this.itemList = itemList;
	}

	public void setRepopularSoloSiNull(boolean repopularSoloSiNull) {
		this.repopularSoloSiNull = repopularSoloSiNull;
	}

	public boolean isRepopularSoloSiNull() {
		return repopularSoloSiNull;
	}

}
