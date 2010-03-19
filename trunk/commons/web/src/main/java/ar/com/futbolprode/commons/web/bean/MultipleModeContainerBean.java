package ar.com.futbolprode.commons.web.bean;



import java.util.HashSet;
import java.util.Set;

import ar.com.futbolprode.commons.web.bean.mode.BeanMode;



/**
 * Clase abstracta para la administraci�n de modos de funcionamiento de un bean.
 * Pensado para su utilizaci�n en backing beans de forms, donde los componentes
 * dependen de si se est� creando una nueva entidad o si se est� modificando una
 * existente.<br>
 * <br>
 * Se proveen 4 m�todos predefinidos, con sus correspondientes "getters" (
 * <code>isCreateMode(), isUpdateMode(), isDeleteMode(), isQueryMode()</code>).
 * Inicialmente los beans se setean en modo creaci�n.<br>
 * <br>
 * Internamente mantiene una colecci�n con los {@link BeanMode} del bean. Estos
 * modos son excluyentes (un bean no puede estar en mas de un modo a la vez,
 * implementado por <code>f.romero</code> inicialmente). Esta clase provee
 * tambi�n facilidades para agregar nuevos modos excluyentes, mediante el m�todo
 * {@link #addCustomModes()}.<br>
 * <br>
 * Se incluyen tambi�n m�todos para administrar los outcomes del bean (
 * {@link #defineOutcomes()}, {@link #outcomeSuccess()}, {@link #outcomeError()}
 * ). Si bien se debe implementar el m�todo {@link #defineOutcomes()}, la
 * utilizaci�n de estos m�todos es opcional, y en beans simples puede traer
 * confusiones para seguir la l�gica de navegaci�n.
 * 
 * @author f.gonzalez
 * */
public abstract class MultipleModeContainerBean extends ContainerBean {

	private BeanMode modoActual;

	protected Set<BeanMode> modes;

	// ESTADOS PREDEFINIDOS
	protected BeanMode updateMode;
	protected BeanMode createMode;
	protected BeanMode deleteMode;
	protected BeanMode queryMode;

	public MultipleModeContainerBean() {
		super();
		initModes();
	}

	private void initModes() {
		if(modes == null) {
			this.modes = new HashSet<BeanMode>();
	
			this.updateMode = new BeanMode("Update");
			this.createMode = new BeanMode("Create");
			this.deleteMode = new BeanMode("Delete");
			this.queryMode = new BeanMode("Query");
			
			addMode(createMode);
			addMode(deleteMode);
			addMode(updateMode);
			addMode(queryMode);
			
			// Seteo el modo inicial
			this.setCreateMode(true);
			this.addCustomModes();
			this.defineOutcomes();
		}		
	}

	/**
	 * Agregar aqu� los modos particulares de funcionamiento que pueda tener el
	 * bean, a la colecci�n de modos excluyentes, utilizando la funcion
	 * {@link #addMode}. S�lo se deben agregar los modos excluyentes entre s�.
	 * Este m�todo se llama durante la creaci�n del bean.
	 * 
	 * <pre>
	 * void addCustomModes() {
	 * 	addMode(customMode1);
	 * 	addMode(customMode2);
	 * }
	 * </pre>
	 * 
	 */
	protected void addCustomModes() {

	}

	/**
	 * En este m�todo se debe definir el outcome para cada modo del bean.
	 * */
	protected abstract void defineOutcomes();

	/**
	 * Agrega un {@link BeanMode} a la colecci�n interna de modos. Haciendo esto
	 * se garantiza que cuando este modo se setee en true todos los otros modos
	 * de la coleccion seran seteados a false.<br>
	 * <br>
	 * Si el modo no es excluyente no debe ser agregado al bean con este m�todo.
	 * S�lo se debe declarar como una propiedad m�s.
	 * */
	protected void addMode(BeanMode mode) {
		this.modes.add(mode);
	}

	protected void setExclusiveMode(BeanMode mode, boolean activo) {
		mode.setActivo(activo);

		if (activo) {
			if (modes == null) {
				initModes();
			}
			
			for (BeanMode beanMode : modes) {
				if (!beanMode.equals(mode)) {
					beanMode.setActivo(false);
				}
			}

			this.modoActual = mode;
		}
	}

	public void setUpdateMode(boolean updateMode) {
		setExclusiveMode(this.updateMode, updateMode);
	}

	public boolean isUpdateMode() {
		return updateMode.isActivo();
	}

	public void setDeleteMode(boolean deleteMode) {
		setExclusiveMode(this.deleteMode, deleteMode);
	}

	public boolean isDeleteMode() {
		return deleteMode.isActivo();
	}

	public void setCreateMode(boolean createMode) {
		setExclusiveMode(this.createMode, createMode);
	}

	public boolean isCreateMode() {
		return createMode.isActivo();
	}

	public void setQueryMode(boolean queryMode) {
		setExclusiveMode(this.queryMode, queryMode);
	}

	public boolean isQueryMode() {
		return queryMode.isActivo();
	}

	/**
	 * Devuelve el outcome de �xito del modo actual. Se deben definir los
	 * outcomes de cada modo mediante el m�todo
	 * {@link ContainerBean#defineOutcomes()} para poder utilizar esta funci�n.
	 * Devolver� null en caso de que no se haya definido ning�n outcome, o en
	 * caso de que ning�n modo se haya activado.
	 * */
	public String outcomeSuccess() {
		if (modoActual != null) {
			return modoActual.getOutcomeSuccess();
		} else {
			return null;
		}

	}

	/**
	 * Devuelve el outcome de error del modo actual. Se deben definir los
	 * outcomes de cada modo mediante el m�todo
	 * {@link ContainerBean#defineOutcomes()} para poder utilizar esta funci�n.
	 * Devolver� null en caso de que no se haya definido ning�n outcome, o en
	 * caso de que ning�n modo se haya activado.
	 * */
	public String outcomeError() {
		if (modoActual != null) {
			return modoActual.getOutcomeError();
		} else {
			return null;
		}
	}
}
