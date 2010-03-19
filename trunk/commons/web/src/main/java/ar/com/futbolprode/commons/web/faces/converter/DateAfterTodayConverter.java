package ar.com.futbolprode.commons.web.faces.converter;



import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.ConverterException;

import org.apache.commons.lang.StringUtils;

import ar.com.futbolprode.commons.web.Constants;
import ar.com.futbolprode.commons.web.UtilJava;



/**
 * Clase usada para convertir-validar una fecha que tiene que ser posterior o
 * igual al dia de la fecha.
 */
public class DateAfterTodayConverter implements Converter {

	final SimpleDateFormat formatoDeFecha = new SimpleDateFormat("dd/MM/yyyy");
	final String messageText = "Fecha limite: requiere formato dd/mm/aaaa y un valor posterior a la fecha de hoy.";

	public DateAfterTodayConverter() {
	}

	/**
	 * @param facesContext
	 *            contexto desde el cual se llama al converter
	 * @param uiComponent
	 *            componente de la vista de Faces
	 * @param value
	 *            valor String que posee el componente (se ingreso por pantalla)
	 * @return Date - retorna el objeto cargado si se cumplio la validacion, si
	 *         la fecha ingresada es posterior o igual al dia de hoy.
	 * @throws ConverterException
	 *             Si el proceso falla, se lanza la Exception
	 */
	public Object getAsObject(FacesContext facesContext,
			UIComponent uiComponent, String value) throws ConverterException {
		Date fechaVto = null;
		if (!StringUtils.isEmpty(value)) {
			if (!UtilJava.validarDate(value)) {
				throw new ConverterException(new FacesMessage(messageText));
			} else {
				try {
					DateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
					SimpleDateFormat Formato = new SimpleDateFormat(
							"dd/MM/yyyy");
					String hoyS = Formato.format(new Date());
					Date hoy = new Date();
					hoy = formatter.parse(hoyS);
					fechaVto = new Date();
					fechaVto = formatter.parse(value);
					if (!fechaVto.after(new Date())
							&& (fechaVto.compareTo(hoy) != 0)) {
						throw new ConverterException(new FacesMessage(
								messageText));
					}

				} catch (ParseException e) {
					throw new ConverterException(new FacesMessage(messageText));
				}
			}
		}
		return fechaVto;
	}

	/**
	 * @param facesContext
	 *            contexto desde el cual se llama al converter
	 * @param uiComponent
	 *            componente de la vista de Faces
	 * @param value
	 *            valor que sera convertido para asignarar al componente
	 * @return String retorna un String con el formato de la fecha dd/MM/yyyy,
	 *         si cumple con las validaciones sino devuelve un string vacio "".
	 */
	public String getAsString(FacesContext facesContext,
			UIComponent uiComponent, Object value) {
		if (value != null) {
			SimpleDateFormat formatoDeFecha = new SimpleDateFormat("dd/MM/yyyy");
			return formatoDeFecha.format((Date) value);
		} else
			return Constants.EMPTY_STRING;
	}
}
