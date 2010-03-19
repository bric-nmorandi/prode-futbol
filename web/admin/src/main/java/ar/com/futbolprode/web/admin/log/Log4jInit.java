/**
 * 
 */
package ar.com.futbolprode.web.admin.log;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.xml.DOMConfigurator;

/**
 * @author acabrera
 *
 */
public class Log4jInit extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public void init() {
		String file = getInitParameter("log4j-init-file");
//		InputStream is = getClass().getClassLoader().getResourceAsStream(file);
//		Properties properties = new Properties();
		
		if (file != null) {
//				PropertyConfigurator.configure(properties);
			DOMConfigurator.configure(file);
		}
	}

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
	}
}
