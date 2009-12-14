/**
 * 
 */
package ar.com.futbolprode.commons.sistema.util;

import ar.com.futbolprode.commons.sistema.Sistema;

/**
 * Manipular información correspondiente al sistema con el cual se esta
 * trabajando
 * 
 * @author acabrera
 * @since 5 Dic,2009
 * @see Sistema
 * @see System
 */
public final class SistemaInfo {

	final static Sistema getInformacionSistema() {
		return new Sistema();
	}

	/**
	 * método principal
	 * 
	 * @param args
	 *            parámetro de entrada
	 */
	public static void main(String[] args) {
		if (args.length > 0) {
			if (args[0].equalsIgnoreCase("-f")) {
				if (args.length > 1)
					System.out.println(args[1]);
			}
		}
		System.out.println(SistemaInfo.getInformacionSistema());
	}

}
