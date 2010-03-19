package ar.com.futbolprode.commons.web;



import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.sql.Blob;
import java.text.SimpleDateFormat;
import java.util.Collection;
import java.util.Date;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UtilJava {

	/**
	 * @return (col != null && col.size() > 0);
	 * */
	@SuppressWarnings("unchecked")
	public static boolean isNotEmpty(Collection col) {
		return (col != null && col.size() > 0);
	}

	/**
	 * @return string == null || string.equals(EMPTY_STRING);
	 * */
	public static boolean isEmpty(String string) {
		return string == null || string.trim().equals(Constants.EMPTY_STRING);
	}

	/**
	 * @return string == null || string.equals(DEFAULT_COMBO_ID);
	 * */
	public static boolean isDefaultId(String string) {
		return string == null || string.equals(Constants.DEFAULT_COMBO_ID);
	}

	public static boolean validarDate(String value) {
		Pattern pattern = Pattern
				.compile("^((?:0[1-9]|[12][0-9]|3[01])[/](0[1-9]|1[012])[/](19|20)\\d\\d)$");
		Matcher matcher = pattern.matcher(value);
		if (matcher.matches()) {
			String valores[] = value.split("/");
			int dia = Integer.parseInt(valores[0]);
			int mes = Integer.parseInt(valores[1]);
			int anio = Integer.parseInt(valores[2]);
			if (dia == 31 && (mes == 4 || mes == 6 || mes == 9 || mes == 11)) {
				return false; // 31st of a month with 30 days
			}
			if (dia >= 30 && mes == 2) {
				return false; // February 30th or 31st
			}
			if (mes == 2 && dia == 29
					&& !(anio % 4 == 0 && anio % 100 != 0 || anio % 400 == 0)) {
				return false; // February 29th outside a leap year
			} else {
				return true; // Valid date
			}
		}
		return false;
	}

	/**
	 * @return true si es un mail
	 * */
	public static boolean validarEmail(String email) {
		Pattern pattern = Pattern
				.compile("^[\\w._%+-]+@[\\w.-]+\\.[\\w]{2,6}$");
		Matcher matcher = pattern.matcher(email);
		return matcher.matches();
	}

	/**
	 * @return true si es un cuil
	 * */
	public static boolean validarCuil(String cuil) {
		Pattern pattern = Pattern.compile("^[\\d]{2}+-[\\d]{8}+-[\\d]{1}$");
		Matcher matcher = pattern.matcher(cuil);
		return matcher.matches();
	}

	/**
	 * @return true si es un dni
	 * */
	public static boolean validarDNI(String value) {
		Pattern pattern = Pattern.compile("^[0-9]{1,8}$");
		Matcher matcher = pattern.matcher(value);
		return matcher.matches();
	}

	/**
	 * @return true si es un long
	 * */
	public static boolean validarLong(String value) {
		Pattern pattern = Pattern.compile("^[0-9]*$");
		Matcher matcher = pattern.matcher(value);
		return matcher.matches();
	}

	/**
	 * @return true si es un double
	 * */
	public static boolean validarDouble(String value) {
		Pattern pattern = Pattern.compile("^([0-9]*)([\\,]{0,1})([0-9]{0,2})$");
		Matcher matcher = pattern.matcher(value);
		return matcher.matches();
	}

	/**
	 * @return true si es un telefono
	 * */
	public static boolean validarPhone(String value) {
		// Pattern pattern =
		// Pattern.compile("^[0-9 + \\- + \\, +\\t \\n \\x0B \\f \\r + 0-9]*$");
		Pattern pattern = Pattern
				.compile("^[\\( + 0-9 + \\)  + \\- + \\, +\\t \\n \\x0B \\f \\r + 0-9]*$");
		Matcher matcher = pattern.matcher(value);
		return matcher.matches();
	}

	public static boolean validarPassword(String value) {
		Pattern pattern = Pattern.compile("^[a-z][\\w\\d]+$");
		Matcher matcher = pattern.matcher(value);
		return matcher.matches();
	}

	public static boolean validarUsuario(String value) {
		Pattern pattern = Pattern.compile("^[\\w\\d]+$");
		Matcher matcher = pattern.matcher(value);
		return matcher.matches();
	}

	public static boolean validarNombre(String value) {
		Pattern pattern = Pattern.compile("^[a-z]+$");
		Matcher matcher = pattern.matcher(value);
		return matcher.matches();
	}

	public static boolean validarApellido(String value) {
		Pattern pattern = Pattern.compile("^[a-z']+$");
		Matcher matcher = pattern.matcher(value);
		return matcher.matches();
	}

	public static boolean validarFechasInicioFin(Date fechaInicio, Date fechaFin) {
		if (fechaInicio != null && fechaFin != null) {
			if (fechaInicio.after(fechaFin)) {
				return true;
			}
		}
		return false;
	}

	/**
	 * @return true si es un nombre de carpeta (de windows) v�lido
	 * */
	public static boolean validarNombreCarpeta(String value) {
		Pattern pattern = Pattern.compile("^[^\\\\/\\?\\*\"\\>\\<\\:\\|]*$");
		Matcher matcher = pattern.matcher(value);
		return matcher.matches();
	}
	
	/**
	 * Metodo para validar expresiones regulares
	 * @param expressionRegular String con el valor de la expresion regular
	 * @param value String con el valor a matchear en la expresion
	 * @return boolean true si se cumple la expresion regular
	 */
	public static boolean validarRegex(String expressionRegular, String value) {
		//System.out.println("Expresion regular : "+expressionRegular);
		//System.out.println("Valor a evaluar : "+value);
		Pattern pattern = Pattern.compile(expressionRegular);
		Matcher matcher = pattern.matcher(value);
		return matcher.matches();
	}

	/**
	 * 
	 * @param file
	 * @return
	 */
	public static Blob fileToBinary(File file) throws FileNotFoundException,
			IOException {
		byte[] binaryFile = null;
		FileInputStream stream = null;
		FileChannel channel = null;
		ByteBuffer buffer = null;

		stream = new FileInputStream(file);
		channel = stream.getChannel();
		binaryFile = new byte[(int) channel.size()];
		buffer = ByteBuffer.wrap(binaryFile);
		channel.read(buffer);

		return null;
	}
	
	/**
	 * @return String representando la fecha actual en formato "EEEE, d 'de' MMMM 'de' yyyy"
	 * */
	public static String fechaFormateada() {
		SimpleDateFormat formatter = new SimpleDateFormat("EEEE, d 'de' MMMM 'de' yyyy");
		return formatter.format(new Date()).toUpperCase();
	}
	
	/**
	 * @return String representando la fecha indicada en formato "EEEE, d 'de' MMMM 'de' yyyy"
	 * */
	public static String fechaFormateada(Date date) {
		SimpleDateFormat formatter = new SimpleDateFormat("EEEE, d 'de' MMMM 'de' yyyy");
		return formatter.format(date).toUpperCase();
	}
	
	/**
	 * Metodo que retorna la fecha representado como un String aplicando
	 * el locale ES
	 * @return String representando la fecha indicada en formato "EEEE, d 'de' MMMM 'de' yyyy"
	 * */
	public static String fechaFormateadaLocale(Date date) {
		Locale locale = new Locale("es", "ES");
		SimpleDateFormat formatter = new SimpleDateFormat("EEEE, d 'de' MMMM 'de' yyyy", locale);
		return formatter.format(date).toUpperCase();
	}
}
