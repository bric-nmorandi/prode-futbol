package ar.com.futbolprode.commons.web;



import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Date;

/**
 * @author f.gonzalez
 * */
public class MD5 {

	private static MessageDigest md;
	
	private static void init() throws NoSuchAlgorithmException {
		md = MessageDigest.getInstance("MD5");
	}
	
	/**
	 * Devuelve el MD5 correspondiente al String.
	 * */
	public static String md5(String cadena) {
		if(md == null)
			try {
				init();
			} catch (NoSuchAlgorithmException e) {
				throw new RuntimeException(e);
			}
		
		md.update(cadena.getBytes());
		return hex(md.digest());		
	}
	
	private static String hex(byte[] array) {
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < array.length; ++i) {
			sb.append(Integer.toHexString((array[i] & 0xFF) | 0x100).substring(
					1, 3));
		}
		return sb.toString();
	}
	
	public static String random() {	
		String seed = Double.toString(Math.random()) + (new Date()).toString();
		return md5(seed);
	}
}
