package ar.com.futbolprode.commons.web.faces;


import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

import javax.faces.FactoryFinder;
import javax.faces.application.Application;
import javax.faces.application.ApplicationFactory;
import javax.faces.application.FacesMessage;
import javax.faces.application.ViewHandler;
import javax.faces.component.UIViewRoot;
import javax.faces.context.FacesContext;
import javax.faces.el.ValueBinding;
import javax.faces.model.SelectItem;
import javax.faces.validator.ValidatorException;
import javax.servlet.ServletContext;
import javax.servlet.ServletRequest;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;

import ar.com.futbolprode.commons.auditor.Auditor;
import ar.com.futbolprode.commons.web.Constants;


/**
 * Clase que tiene metodos public y static, que son invocados desde otras clases
 * (beans) Brinda funcionalidades que son consideradas genericas.
 */
public class UtilFaces {

	private static Logger logger = Logger.getLogger(UtilFaces.class);

	/**
	 * Get servlet context.
	 * 
	 * @return the servlet context
	 */
	public static ServletContext getServletContext() {
		return (ServletContext) FacesContext.getCurrentInstance()
				.getExternalContext().getContext();
	}

	/**
	 * Store the managed bean inside the session scope.
	 * 
	 * @param beanName
	 *            the name of the managed bean to be stored
	 * @param managedBean
	 *            the managed bean to be stored
	 */
	@SuppressWarnings("unchecked")
	public static void setManagedBeanInSession(String beanName,
			Object managedBean) {
		FacesContext.getCurrentInstance().getExternalContext().getSessionMap()
				.put(beanName, managedBean);
	}

	/**
	 * Remove the managed bean based on the bean name.
	 * 
	 * @param beanName
	 *            the bean name of the managed bean to be removed
	 */
	public static void resetManagedBean(String beanName) {
		logger.debug("Reseteando bean: " + beanName);
		getValueBinding(getJsfEl(beanName)).setValue(
				FacesContext.getCurrentInstance(), null);
	}

	public static String getJsfEl(String value) {
		return "#{" + value + "}";
	}

	/**
	 * Get managed bean based on the bean name.
	 * 
	 * @param beanName
	 *            the bean name
	 * @return the managed bean associated with the bean name
	 */
	public static Object getManagedBean(String beanName) {
		Object o = getValueBinding(getJsfEl(beanName)).getValue(
				FacesContext.getCurrentInstance());
		return o;
	}

	private static Application getApplication() {
		ApplicationFactory appFactory = (ApplicationFactory) FactoryFinder
				.getFactory(FactoryFinder.APPLICATION_FACTORY);
		return appFactory.getApplication();
	}

	private static ValueBinding getValueBinding(String el) {
		return getApplication().createValueBinding(el);
	}

	/**
	 * Get parameter value from request scope.
	 * 
	 * @param name
	 *            the name of the parameter
	 * @return the parameter value
	 */
	public static String getRequestParameter(String name) {
		return (String) FacesContext.getCurrentInstance().getExternalContext()
				.getRequestParameterMap().get(name);
	}
	
	/**
	 * Set parameter value from request scope.
	 * 
	 * @param name
	 *            the name of the parameter
	 * @return the parameter value
	 */
	/**
	 * Set parameter value from request scope.
	 * @param name the name of the parameter
	 * @param value the value of the parameter
	 */
	@SuppressWarnings("unchecked")
	public static void setRequestParameter(FacesContext facesContext,String name, String value) {
		facesContext.getExternalContext().getRequestParameterMap().put(name, value);
	}

	/**
	 * Add information message.
	 * 
	 * @param msg
	 *            the information message
	 */
	public static void addInfoMessage(String msg) {
		addInfoMessage(null, msg);
	}

	/**
	 * Add information message to a especifico client.
	 * 
	 * @param clientId
	 *            the client id
	 * @param msg
	 *            the information message
	 */
	public static void addInfoMessage(String clientId, String msg) {
		FacesContext.getCurrentInstance().addMessage(clientId,
				new FacesMessage(FacesMessage.SEVERITY_INFO, msg, msg));
	}

	/**
	 * Add error message.
	 * 
	 * @param msg
	 *            the error message
	 */
	public static void addErrorMessage(String msg) {
		addErrorMessage(null, msg);
	}

	/**
	 * Add error message to a especifico client.
	 * 
	 * @param clientId
	 *            the client id
	 * @param msg
	 *            the error message
	 */
	public static void addErrorMessage(String clientId, String msg) {
		FacesContext.getCurrentInstance().addMessage(clientId,
				new FacesMessage(FacesMessage.SEVERITY_ERROR, msg, msg));
	}

	public static HttpServletRequest getServletRequest() {
		return (HttpServletRequest) FacesContext.getCurrentInstance()
				.getExternalContext().getRequest();
	}

	/**
	 * Metodo que obtiene un atributo, segun su clave, de request
	 * 
	 * @param context
	 *            Contexto actual de Aplicacion
	 * @param key
	 *            clave del objeto que se extraera de request
	 * @return Object objecto, si existe, que se obtuvo de request
	 */
	public static Object getRequestMapValue(FacesContext context, String key) {
		return context.getExternalContext().getRequestMap().get(key);
	}

	/**
	 * Metodo que setea un atributo, clave y valor enviados
	 * 
	 * @param context
	 *            Contexto actual de Aplicacion
	 * @param key
	 *            clave del objeto que se seteara en request
	 * @param value
	 *            Objeto que se seteara en request
	 */
	@SuppressWarnings("unchecked")
	public static void setRequestMapValue(FacesContext context, String key,
			Object value) {
		context.getExternalContext().getRequestMap().put(key, value);
	}

	/**
	 * Metodo que setea un atributo, segun su clave, en request
	 * 
	 * @param context
	 *            Contexto actual de Aplicacion
	 * @param key
	 *            clave del objeto que se seteara en request
	 * @param value
	 *            objeto que se seteara en request
	 */
	public static void setObjSession(String key, Object value) {
		HttpSession session = (HttpSession) FacesContext.getCurrentInstance()
				.getExternalContext().getSession(false);
		session.setAttribute(key, value);
	}

	/**
	 * Metodo que obtiene un atributo de request segun la clave
	 * 
	 * @param context
	 *            Contexto actual de Aplicacion
	 * @param key
	 *            clave del objeto cargado en request
	 * @return Objet objeto que se obtuvo de request a travez de la clave
	 */
	public static Object getObjSession(String key) {
		HttpSession session = (HttpSession) FacesContext.getCurrentInstance()
				.getExternalContext().getSession(false);
		return session.getAttribute(key);
	}

	/**
	 * Metodo que setea un atributo, segun su clave, en request
	 * 
	 * @param context
	 *            Contexto actual de Aplicacion
	 * @param key
	 *            clave del objeto que se seteara en request
	 * @param value
	 *            objeto que se seteara en request
	 */
	public static void setObjRequest(String key, Object value) {
		HttpServletRequest request = (HttpServletRequest) FacesContext
				.getCurrentInstance().getExternalContext().getRequest();
		request.setAttribute(key, value);
	}

	/**
	 * Metodo que obtiene un atributo de request segun la clave
	 * 
	 * @param context
	 *            Contexto actual de Aplicacion
	 * @param key
	 *            clave del objeto cargado en request
	 * @return Objet objeto que se obtuvo de request a travez de la clave
	 */
	public static Object getObjRequest(String key) {
		HttpServletRequest request = (HttpServletRequest) FacesContext
				.getCurrentInstance().getExternalContext().getRequest();
		return request.getAttribute(key);
	}

	/**
	 * Metodo que remueve un atributo de la request segun la clave
	 * 
	 * @param context
	 *            Contexto actual de Aplicacion
	 * @param key
	 *            clave del atributo que sera removido de la request
	 */
	public static void removeObjRequest(FacesContext context, String key) {
		HttpServletRequest request = (HttpServletRequest) context
				.getExternalContext().getRequest();
		request.removeAttribute(key);
	}

	/**
	 * Metodo que agrega un componete JSF UI a la aplicacion
	 * 
	 * @param componentType
	 *            nombre del componente JSF UI que se creara
	 * @return objeto del tipo especificado, componente en la aplicacion
	 */
	public static Object crearComponente(String componentType) {
		return FacesContext.getCurrentInstance().getApplication()
				.createComponent(componentType);
	}

	/**
	 * Metodo que
	 * 
	 * @param facesContext
	 *            Contexto actual de Aplicacion
	 * @param message
	 */
	public static void generarErrorExcep(FacesContext facesContext,
			String message) {
		facesContext.addMessage(null, new FacesMessage(message, message));
		throw new ValidatorException(new FacesMessage(message));
	}

	/**
	 * Metodo que
	 * 
	 * @param facesContext
	 *            Contexto actual de Aplicacion
	 * @param message
	 */
	public static void generarMensaje(FacesContext facesContext, String message) {
		FacesMessage mensaje = new FacesMessage(message, message);
		mensaje.setSeverity(FacesMessage.SEVERITY_INFO);
		facesContext.addMessage(null, mensaje);
	}

	/**
	 * Metodo que
	 * 
	 * @return
	 */
	public static FacesContext getFacesContex() {
		FacesContext facesContext = FacesContext.getCurrentInstance();
		return facesContext;
	}

	/**
	 * Devuelve la ip del cliente que gener� el request.
	 * 
	 * @return la ip del cliente
	 */
	public static String getIPCliente() {
		return ((ServletRequest) FacesContext.getCurrentInstance()
				.getExternalContext().getRequest()).getRemoteAddr();
	}

	/**
	 * 
	 * */
	public static String getContextURL() {
		StringBuffer reqURL = ((HttpServletRequest) FacesContext
				.getCurrentInstance().getExternalContext().getRequest())
				.getRequestURL();
		String reqURI = ((HttpServletRequest) FacesContext.getCurrentInstance()
				.getExternalContext().getRequest()).getRequestURI();
		String base = reqURL.substring(0, reqURL.indexOf(reqURI));
		String context = ((HttpServletRequest) FacesContext
				.getCurrentInstance().getExternalContext().getRequest())
				.getContextPath();

		return base + context;
	}

	/**
	 * 
	 * */
	public static String getRequestQueryString() {
		return ((HttpServletRequest) FacesContext.getCurrentInstance()
				.getExternalContext().getRequest()).getQueryString();
	}

	/**
	 * Metodo que ejecuta al string enviado un trim(), quitando los espacios en
	 * blanco
	 * 
	 * @param value
	 *            valor al que si no es null, se ejecutara el metodo trim() de
	 *            java.util.String
	 * @return String cadena sin blancos o null
	 */
	public static String quitarBlanco(String value) {
		if (value != null) {
			return value.trim();
		}
		return value;
	}

	/**
	 * Crea una lista de {@link SelectItem} a partir de una lista de objetos
	 * para ser mostrada en un formulario. Se utiliza el m�todo toString del
	 * objeto tanto para el id del item, como para su valor.<br>
	 * <br>
	 * Si agregarDefault es true, el primer elemento de la lista se crea con los
	 * valores {@link Constants#DEFAULT_COMBO_ID} y
	 * {@link Constants#DEFAULT_COMBO_VALUE}.
	 * 
	 * @param list Lista de objetos
	 * @param agregarDefault Agregar el default (Seleccione...) como primer elemento
	 * @return Lista de {@link SelectItems}
	 * */
	public static <T> List<SelectItem> crearListaSelectItems(List<T> list,
			boolean agregarDefault) {
		List<SelectItem> items = new LinkedList<SelectItem>();

		if (agregarDefault) {
			items.add(new SelectItem(Constants.DEFAULT_COMBO_ID,
					Constants.DEFAULT_COMBO_VALUE));
		}

		for (T object : list) {
			SelectItem item = new SelectItem(object.toString(), object
					.toString());
			items.add(item);
		}

		return items;
	}

	/**
	 * Crea una lista de {@link SelectItem} a partir deuna de elementos
	 * {@link Audit} para ser mostrada en un formulario. El primer elemento de
	 * la lista se crea con los valores {@link Constants#DEFAULT_COMBO_ID} y
	 * {@link Constants#DEFAULT_COMBO_VALUE}. <br>
	 * <br>
	 * Es equivalente a crearListaItems(listaPersistentes, true).
	 * 
	 * @param Lista
	 *            de Items Audit
	 * @return Lista de Select Items
	 * @see UtilFaces#crearListaItems(List, boolean)
	 * @deprecated Use {@link #crearListaItemsConAuditEnKey(List, boolean)}
	 * */
	@Deprecated
	public static <T extends Auditor> List<SelectItem> crearListaItems(
			List<T> listaPersistentes) {
		return crearListaItems(listaPersistentes, true);
	}

	/**
	 * Crea una lista de {@link SelectItem} a partir deuna de elementos
	 * {@link Audit} para ser mostrada en un formulario. Si agregarDefault es
	 * true, el primer elemento de la lista se crea con los valores
	 * {@link Constants#DEFAULT_COMBO_ID} y
	 * {@link Constants#DEFAULT_COMBO_VALUE}.
	 * 
	 * @param Lista
	 *            de Items Audit
	 * @return Lista de {@link SelectItems}
	 * @deprecated Use {@link #crearListaItemsConAuditEnKey(List, boolean)}
	 * */
	@Deprecated
	public static <T extends Auditor> List<SelectItem> crearListaItems(
			List<T> listaAuditables, boolean agregarDefault) {
		List<SelectItem> items = new LinkedList<SelectItem>();

		if (agregarDefault) {
			items.add(new SelectItem(Constants.DEFAULT_COMBO_ID,
					Constants.DEFAULT_COMBO_VALUE));
		}

		for (T audit : listaAuditables) {
			SelectItem item = new SelectItem(audit.getId().toString(), audit
					.toString());
			items.add(item);
		}

		return items;
	}

	/**
	 * Crea una lista de {@link SelectItem} a partir deuna de elementos
	 * {@link Audit} para ser mostrada en un formulario. Utiliza al objeto como
	 * Key (en lugar de solo su id), por lo que debe haber registrado un
	 * converter para utilizar este m�todo.<br>
	 * <br>
	 * Si agregarDefault es true, el primer elemento de la lista se crea con los
	 * valores null y {@link Constants#DEFAULT_COMBO_VALUE}.
	 * 
	 * @param Lista
	 *            de Items Audit
	 * @return Lista de {@link SelectItems}
	 * */
	public static <T extends Auditor> List<SelectItem> crearListaItemsConAuditEnKey(
			List<T> listaAuditables, boolean agregarDefault) {
		List<SelectItem> items = new LinkedList<SelectItem>();

		if (agregarDefault) {
			items.add(new SelectItem(null, Constants.DEFAULT_COMBO_VALUE));
		}

		for (T audit : listaAuditables) {
			SelectItem item = new SelectItem(audit, audit.toString());
			items.add(item);
		}

		return items;
	}

	public static List<SelectItem> crearListaItemsDedicacion() {
		List<SelectItem> items = new LinkedList<SelectItem>();
		items.add(new SelectItem(Constants.DEFAULT_COMBO_ID,
				Constants.DEFAULT_COMBO_VALUE));
		int porcentaje = 100;
		while (porcentaje >= 10) {
			SelectItem item = new SelectItem(porcentaje
					+ Constants.SIMBOLO_PORCENTAJE, porcentaje
					+ Constants.SIMBOLO_PORCENTAJE);
			items.add(item);
			porcentaje -= 10;
		}
		return items;
	}

	/**
	 * Reinicia la vista actual
	 * */
	public static void refresh() {
		/*
		 * This causes the current View tree to be discarded and a fresh one
		 * created. The new components of course then have no submitted values,
		 * and so fetch their displayed values via their value-bindings.
		 */

		FacesContext context = FacesContext.getCurrentInstance();
		Application application = context.getApplication();
		ViewHandler viewHandler = application.getViewHandler();
		UIViewRoot viewRoot = viewHandler.createView(context, context
				.getViewRoot().getViewId());
		context.setViewRoot(viewRoot);
		context.renderResponse();// Optional
	}

	/**
	 * Redirecciona a la url especificada a trav�s del sendRedirect del
	 * {@link HttpServletResponse}
	 * 
	 * @param url
	 * @see HttpServletResponse#sendRedirect(String)
	 * */
	public static void sendRedirect(String url) {
		FacesContext context = FacesContext.getCurrentInstance();
		HttpServletResponse response = (HttpServletResponse) context
				.getExternalContext().getResponse();

		try {
			response.sendRedirect(url);
			context.responseComplete();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * @return true si el usuario logueado tiene el rol especificado
	 * */
	public static boolean isUserInRole(String role) {
		return getFacesContex().getExternalContext().isUserInRole(role);
	}
}
