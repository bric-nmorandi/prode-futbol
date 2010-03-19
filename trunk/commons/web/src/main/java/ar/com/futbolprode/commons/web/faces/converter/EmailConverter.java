package ar.com.futbolprode.commons.web.faces.converter;



import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.ConverterException;

import org.apache.commons.lang.StringUtils;

import ar.com.futbolprode.commons.web.Constants;
import ar.com.futbolprode.commons.web.UtilJava;



/**
 * Clase usada para convertir-validar un e-mail.
 */
public class EmailConverter  implements Converter{
    public EmailConverter() {
    }
    /**
     * @param facesContext  contexto desde el cual se llama al converter
     * @param uiComponent   componente de la vista de Faces
     * @param value valor String que pose el componente
     * @return String - retorna el objeto cargado si el String cumple con el formato de un e-mail
     * @throws ConverterException Si el proceso falla, se lanza la Exception con el mensaje "E-mail: valor incorrecto"
     */
    public Object getAsObject(FacesContext facesContext, 
                              UIComponent uiComponent, String value) {
        String  email = null;                        
        if(!StringUtils.isEmpty(value)){
            if (!UtilJava.validarEmail(value)){
                String messageText = "Ingrese un email v�lido"; //TODO bundle
                throw new ConverterException(new FacesMessage(messageText));
            }else {
                email = value;
            }
        }
        return email;  
    }
    
    /**
     * @param facesContext  contexto desde el cual se llama al converter
     * @param uiComponent   componente de la vista de Faces
     * @param value valor que sera convertido para asignarar al componente
     * @return String retorna el valor del objetos String, si no es null sino devuelve un String vacio ""
     */
    public String getAsString(FacesContext facesContext, 
                              UIComponent uiComponent, Object value) {
        if (value != null)
        return (String)value; 
        else return Constants.EMPTY_STRING; 
    }
}
