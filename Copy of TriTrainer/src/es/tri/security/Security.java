package es.tri.security;

import java.security.MessageDigest;

public class Security {
	 /***
	
	     * Comprueba si una contraseña es valida
	
	     * @param clave 
	
	     * 
	
	     * @return hash encriptado
	
	     */

	public static Boolean esCorrecta(String clave, String Digest) {

		byte[] digest = null;
		byte[] buffer = clave.getBytes();

		try {
			MessageDigest messageDigest = MessageDigest.getInstance("MD5");
			messageDigest.reset();
			messageDigest.update(buffer);
			digest = messageDigest.digest();
			clave = toHexadecimal(digest);
		} catch (Exception e) {
			System.out.println("Error creando Digest");

		}
		if ((Digest).equals(clave))
			return true;
		else
			return false;

	}

	private static String toHexadecimal(byte[] digest) {
		String hash = "";
		for (byte aux : digest) {
			int b = aux & 0xff;
			if (Integer.toHexString(b).length() == 1)
				hash += "0";
			hash += Integer.toHexString(b);
		}
		return hash;
	}
	
	public static String encriptar(String clave) {

		byte[] digest = null;
		byte[] buffer = clave.getBytes();

		try {
			MessageDigest messageDigest = MessageDigest.getInstance("MD5");
			messageDigest.reset();
			messageDigest.update(buffer);
			digest = messageDigest.digest();
		
		} catch (Exception e) {
			System.out.println("Error creando Digest");

		}
		return	toHexadecimal(digest);

	}

}
