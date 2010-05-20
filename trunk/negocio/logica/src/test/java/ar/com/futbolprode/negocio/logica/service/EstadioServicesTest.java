/**
 * 
 */
package ar.com.futbolprode.negocio.logica.service;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

import ar.com.futbolprode.negocio.entidades.modelo.liga.Estadio;

/**
 * @author acabrera
 * 
 */
public class EstadioServicesTest extends AbstractTest {

	public void testSave() throws IOException {
		if (this.getEstadioService().getAll().size() <= CERO) {
			File archivoEstadios = new File(
					"./src/main/resources/ar/com/futbolprode/negocio/logica/file/estadios.txt");
			BufferedReader linea = new BufferedReader(new FileReader(
					archivoEstadios));
			String s;
			while ((s = linea.readLine()) != null) {
				StringTokenizer st = new StringTokenizer(s, "|");
				int i = CERO;
				Estadio estadio = new Estadio();
				while (st.hasMoreTokens()) {
					String campo = st.nextToken();

					switch (i) {
					case 1: {
						estadio.setNombre(campo);
						break;
					}
					case 2: {
						estadio.setDescripcion(campo);
						break;
					}
					
					}//switch
					i++;
				}//while st
				this.getEstadioService().save(estadio);
			}//while s

		}
	}
}
