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
 * Clase usada para convertir-validar una fecha.
 */
public class DateConverter implements Converter {
    private Date fecha = null;                        
    final SimpleDateFormat formatoDeFecha = new SimpleDateFormat("dd/MM/yyyy");
    final String messageText = "Fecha : requiere formato dd/mm/aaaa y un valor de fecha correcto";
    public DateConverter() {
    }
    /**
     * @param facesContext  contexto desde el cual se llama al converter
     * @param uiComponent   componente de la vista de Faces
     * @param value valor String que posee el componente (se ingreso por pantalla)
     * @return Date - retorna el objeto de tipo Date cargado si se cumplio la validacion (valores correctos para una fecha)
     * @throws ConverterException Si el proceso falla, se lanza la Exception
     */
    public Object getAsObject(FacesContext facesContext, UIComponent uiComponent, String value)         
                              throws ConverterException {
        if(!StringUtils.isEmpty(value)){
            if (!UtilJava.validarDate(value)){
                throw new ConverterException(new FacesMessage(messageText));
            }else {
               try {
                    DateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
                    fecha = new Date();
                    fecha= formatter.parse(value);
               } catch (ParseException e) {
                     throw new ConverterException(new FacesMessage(messageText));
                }
            }
        }
        return fecha;  
    }
    /**
     * @param facesContext  contexto desde el cual se llama al converter
     * @param uiComponent   componente de la vista de Faces
     * @param value valor que sera convertido para asignarar al componente
     * @return String retorna un String con el formato de fecha "dd/MM/yyyy", si cumple con las  validaciones
     * sino devuelve un string vacio ""
     */
    public String getAsString(FacesContext facesContext, 
                              UIComponent uiComponent, Object value) {
        if (value != null){
            SimpleDateFormat formatoDeFecha = new SimpleDateFormat("dd/MM/yyyy");
            return formatoDeFecha.format((Date)value);
        }
        else return Constants.EMPTY_STRING; 
    }
    
    public void setfecha(Date fecha) {
        this.fecha = fecha;
    }

    public Date getfecha() {
        return fecha;
    }
}
