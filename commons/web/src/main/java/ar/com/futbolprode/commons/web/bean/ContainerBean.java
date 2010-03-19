package ar.com.futbolprode.commons.web.bean;



import java.util.HashMap;
import java.util.Map;
import java.util.ResourceBundle;

import javax.faces.application.FacesMessage;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import javax.servlet.ServletContext;

import org.springframework.context.ApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import ar.com.futbolprode.commons.hibernate.dao.MaestroDao;
import ar.com.futbolprode.commons.web.faces.UtilFaces;



/**
 * Clase abstracta de administracion generica de beans del contexto. Guarda los
 * beans definidos en el contexto en mapas para facilitar su acceso mediante los
 * metodos {@link getDao}, {@link getService} y {@link getFacade}. <br>
 * <br>
 * Provee ademas el m�todo {@link generarError}, para agregar mensajes de error
 * al contexto de la aplicacion. Se debe implementar el m�todo getBundle,
 * devolviendo el {@link ResourceBundle} para la busqueda de mensajes.<br>
 * <br>
 * El reconocimiento de los beans de servicio y fachada se hace mediante el
 * nombre de la clase. Deben terminar en "Service" y "Facade" respectivamente.
 * En el caso de los DAOs, se hace por herencia de la clase {@link MaestroDao}.
 * 
 * @author f.gonzalez
 * @version 0.3
 * */
public abstract class ContainerBean {

	FacesContext context;

	@SuppressWarnings("unchecked")
	protected Map requestMap;

	protected ServletContext contextx;

	protected ApplicationContext applicationContext;

	@SuppressWarnings("unchecked")
	private static HashMap<String, MaestroDao> daoMap;
	private static HashMap<String, Object> serviceMap; // FIXME
	private static HashMap<String, Object> facadeMap; // FIXME

	private static boolean cargados = false;

	@SuppressWarnings("unchecked")
	public ContainerBean() {
		// al crear el bean pongo una referencia en sesion para poder
		// refernciarlo gen�ricmante en un include que es usado por varios
		// diferentes forms con diferentes subtipos de AdministrarBean

		ExternalContext externalContext = FacesContext.getCurrentInstance()
				.getExternalContext();
		externalContext.getSessionMap().put("currentAdministrarBean", this); // FIXME
		// hardcode

		// Inicializo servicios
		this.contextx = (ServletContext) FacesContext.getCurrentInstance()
				.getExternalContext().getContext();
		this.applicationContext = WebApplicationContextUtils
				.getRequiredWebApplicationContext(this.contextx);

		// Seteo los servicios que vamos a utilizar
		if (!cargados) {
			this.cargarBeans();
			cargados = true;
		}

		this.init();
	}

	/**
	 * M�todo llamado durante la creaci�n del bean. Sobreescribir para agregar
	 * inicialziaciones particulares.
	 * */
	protected void init() {

	}

	/**
	 * Guarda las instancias de los beans en mapas. TODO hace falta todo esto?
	 * */
	@SuppressWarnings("unchecked")
	private void cargarBeans() {
		String[] nombresBeans = this.applicationContext
				.getBeanDefinitionNames();

		daoMap = new HashMap<String, MaestroDao>();
		serviceMap = new HashMap<String, Object>();
		facadeMap = new HashMap<String, Object>();

		for (String nombre : nombresBeans) {
			if (this.applicationContext.containsBean(nombre)
					&& (nombre.endsWith("Dao") || nombre.endsWith("Service") || nombre
							.endsWith("Facade"))) {
				try {
					Object beanInst = this.applicationContext.getBean(nombre);

					if (beanInst instanceof MaestroDao) {
						daoMap.put(nombre, (MaestroDao) beanInst);
					} else if (nombre.endsWith("Service")) {
						serviceMap.put(nombre, beanInst);
					} else if (nombre.endsWith("Facade")) {
						facadeMap.put(nombre, beanInst);
					}
				} catch (Exception e) {
					/* El bean no pudo ser instanciado */
					e.printStackTrace();
				}
			}
		}
	}

	/**
	 * Devuelve el {@link MaestroDao} cuyo bean tiene como id (en el contexto de
	 * Spring) la cadena indicada.
	 * */
	@SuppressWarnings("unchecked")
	public MaestroDao getDao(String dao) {
		return daoMap.get(dao);
	}

	/**
	 * Devuelve el bean de servicio que tiene como id (en el contexto de Spring)
	 * la cadena indicada.
	 * */
	public Object getService(String service) {
		return serviceMap.get(service);
	}

	/**
	 * Devuelve el bean de fachada que tiene como id (en el contexto de Spring)
	 * la cadena indicada.
	 * */
	@Deprecated
	public Object getFacade(String facade) {
		return facadeMap.get(facade);
	}

	/**
	 * Devuelve el bean que tiene como id (en el contexto de Spring) la cadena
	 * indicada.
	 * */
	public Object getBean(String bean) {
		return this.applicationContext.getBean(bean);
	}

	/**
	 * Devuelve el bundle correspondiente al archivo de mensajes de la
	 * aplicacion.
	 * */
	public abstract ResourceBundle getBundle();

	/**
	 * Agrega un mensaje de error al contexto de la aplicacion.
	 * 
	 * @param facesContext
	 *            Contexto actual de Aplicacion
	 * @param message
	 */
	public boolean generarError(FacesContext facesContext, String message) {
		// obtener string del key

		FacesMessage mensaje = new FacesMessage(getBundle().getString(message),
				getBundle().getString(message));
		mensaje.setSeverity(FacesMessage.SEVERITY_ERROR);
		facesContext.addMessage(null, mensaje);
		return true;
	}

	/**
	 * Agrega un mensaje de error al contexto de la aplicacion.
	 * 
	 * @param message
	 */
	public boolean generarError(String message) {
		return generarError(UtilFaces.getFacesContex(), message);
	}
	
}
