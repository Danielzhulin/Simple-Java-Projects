/**
 * Project: Lab3
 * File: Lab3.java
 * Date: Sep 29, 2018
 * Time: 1:27:36 PM
 */
package a01077579;

import java.time.Instant;
import java.time.temporal.ChronoUnit;

import a01077579.io.CustomerReader;
import a01077579.io.CustomerReport;

/**
 * The project main class
 * 
 * @author Daniel Zhu, A01077579
 *
 */
public class Lab4 {

	/**
	 * Constructor
	 */
	public Lab4() {
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		if (args == null || args.length == 0) {
			System.out.println("Usage: java -jar A01077579Lab2.jar <input string>");
			System.exit(-1);
		}
		new Lab4().processCustomerData(args[0]);
		System.exit(0);
	}

	public void processCustomerData(String data) {

		Instant beginInstant = Instant.now();
		System.out.println(beginInstant);
		CustomerReader cr = null;
		try {
			// Construct a CustomerReader
			cr = new CustomerReader(data);
			// Using the CustomerReader object as a parameter to print customer information
			CustomerReport.printCustomerReport(cr);
		} catch (ApplicationException e) {
			// e.printStackTrace();
			System.out.println(e.getMessage());
			return;
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return;
		} finally {
			Instant endInstant = Instant.now();
			System.out.println(endInstant);
			System.out.println("Duration: " + ChronoUnit.MILLIS.between(beginInstant, endInstant) + " ms");
		}
	}

}
