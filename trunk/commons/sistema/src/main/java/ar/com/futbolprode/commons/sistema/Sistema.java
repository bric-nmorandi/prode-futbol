/**
 * 
 */
package ar.com.futbolprode.commons.sistema;

/**
 * Contiene una definición de las properties mas importantes quenecesitamos para
 * obtener datos del sistema.
 * 
 * @author acabrera
 * @since 5 Dic,2009
 * @see System
 * 
 */
public class Sistema {

	private static final String S_O = "Sistema operativo";
	private static final String S_O_VERSION = "Version del sistema operativo";
	private static final String S_O_ARQUITECTURA = "Arquitectura del sistema operativo";
	private static final String J_R_T = "Java runtime";
	private static final String J_R_T_V = "Java runtime version";
	private static final String USUARIO = "Usuario";
	private static final String LENGUAJE = "Lenguaje";
	private static final String DOS_PUNTOS = ":";
	private static final String ENTER = "\n";

	public String getSistemaOperativo() {
		return System.getProperty("os.name").toString();
	}

	public String getSistemaOperativoVersion() {
		return System.getProperty("os.version").toString();
	}

	public String getArquitectura() {
		return System.getProperty("os.arch").toString();
	}

	public String getJavaRunTime() {
		return System.getProperty("java.runtime.version").toString();
	}

	public String getJavaRunTimeName() {
		return System.getProperty("java.runtime.name").toString();
	}

	public String getNombreUsuario() {
		return System.getProperty("user.name").toString();
	}

	public String getLenguaje() {
		return System.getProperty("user.language").toString();
	}

	@Override
	public String toString() {
		return S_O + DOS_PUNTOS + getSistemaOperativo() + ENTER + S_O_VERSION
				+ DOS_PUNTOS + getSistemaOperativoVersion() + ENTER
				+ S_O_ARQUITECTURA + DOS_PUNTOS + getArquitectura() + ENTER
				+ J_R_T + DOS_PUNTOS + getJavaRunTimeName() + ENTER + J_R_T_V
				+ DOS_PUNTOS + getJavaRunTime() + ENTER + USUARIO + DOS_PUNTOS
				+ getNombreUsuario() + ENTER + LENGUAJE + DOS_PUNTOS
				+ getLenguaje();
	}
}
