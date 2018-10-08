/**
 * Project: Lab4
 * File: ApplicationException.java
 * Date: Sep 29, 2018
 * Time: 8:25:24 PM
 */
package a01077579;

/**
 * @author Daniel Zhu, A01077579
 *
 */
public class ApplicationException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	public ApplicationException() {
	}

	/**
	 * @param message
	 *            message
	 */
	public ApplicationException(String message) {
		super(message);
	}

	/**
	 * @param cause
	 *            cause
	 */
	public ApplicationException(Throwable cause) {
		super(cause);
	}

	/**
	 * @param message
	 *            message
	 * @param cause
	 *            cause
	 */
	public ApplicationException(String message, Throwable cause) {
		super(message, cause);
	}

	/**
	 * @param message
	 *            message
	 * @param cause
	 *            cause
	 * @param enableSuppression
	 *            enableSuppression
	 * @param writableStackTrace
	 *            writeableStackTrace
	 */
	public ApplicationException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

}
