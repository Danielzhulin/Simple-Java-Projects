/**
 * Project: Lab2
 * File: Lab2.java
 * Date: Sep 22, 2018
 * Time: 1:27:36 PM
 */
package a01077579;

import a01077579.io.CustomerReader;
import a01077579.io.CustomerReport;

/**
 * The project main class
 * 
 * @author Daniel Zhu, A01077579
 *
 */
public class Lab2 {

	/**
	 * Constructor
	 */
	public Lab2() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		if (args == null || args.length == 0) {
			System.out.println("Usage: java -jar A01077579Lab2.jar <input string>");
			System.exit(-1);
		}
		// Construct a CustomerReader
		CustomerReader cr = new CustomerReader(args[0]);
		// Using the CustomerReader object as a parameter to print customer information
		CustomerReport.printCustomerReport(cr);
	}

}
