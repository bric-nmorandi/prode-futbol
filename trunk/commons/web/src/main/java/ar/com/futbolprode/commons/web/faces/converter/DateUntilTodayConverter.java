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
 * Clase usada para convertir-validar una fecha que tiene que ser anterior o igual al dia de la fecha (se supone que es la fecha del siniestro).
 */
public class DateUntilTodayConverter implements Converter {
    private Date fechaNac = null;                        
    final SimpleDateFormat formatoDeFecha = new SimpleDateFormat("dd/MM/yyyy");
    //final DateFormat df = new SimpleDateFormat(formatDate);
    final String messageText = "Fecha de siniestro: requiere formato dd/mm/aaaa y un valor de fecha correcto";
   
    public void DateBirthConverter() {
    }

    /**
     * @param facesContext  contexto desde el cual se llama al converter
     * @param uiComponent   componente de la vista de Faces
     * @param value valor String que posee el componente (se ingreso por pantalla)
     * @return Date - retorna el objeto de tipo Date cargado si se cumplio la validacion
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
                    fechaNac = new Date();
                    fechaNac= formatter.parse(value);
                    if (!fechaNac.before(new Date())){
                        throw new ConverterException(new FacesMessage(messageText));
                    }
                } catch (ParseException e) {
                     throw new ConverterException(new FacesMessage(messageText));
                }
            }
        }
        return fechaNac;  
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
    
    public void setFechaNac(Date fechaNac) {
        this.fechaNac = fechaNac;
    }

    public Date getFechaNac() {
        return fechaNac;
    }
}
