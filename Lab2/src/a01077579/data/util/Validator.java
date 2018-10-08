/**
 * Project: Lab2
 * File: Validator.java
 * Date: Sep 22, 2018
 * Time: 1:49:22 PM
 */
package a01077579.data.util;

import java.util.regex.Pattern;

/**
 * A class for validation
 * To tell if a string is an email string
 * 
 * @author Daniel Zhu, A01077579
 *
 */
public class Validator {

	/**
	 * Constructor
	 */
	public Validator() {
		// TODO Auto-generated constructor stub
	}

	public static boolean validateEmail(String email) {
		if (email == null) {
			return false;
		}
		// boolean b = Pattern.compile("^(.+)@(.+)$").matcher(email).matches();
		return Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE).matcher(email).matches();
	}
}
