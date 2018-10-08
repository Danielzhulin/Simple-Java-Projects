/**
 * Project: Lab4
 * File: CustomerReport.java
 * Date: Sep 29, 2018
 * Time: 1:29:26 PM
 */
package a01077579.io;

import a01077579.DateTimeUtil;
import a01077579.data.Customer;
import a01077579.io.CustomerReader.CustomerIterator;

/**
 * Print customer report base on customer information
 * 
 * @author Daniel Zhu, A01077579
 *
 */
public class CustomerReport {

	/**
	 * Constructor
	 */
	public CustomerReport() {

	}

	public static void printCustomerReport(CustomerReader cr) {

		if (cr == null) {
			return;
		}
		System.out.println("Customer Report");
		System.out.println(
				"----------------------------------------------------------------------------------------------------------------------------------------------------");
		System.out.println(
				"  #. ID     First name   Last name    Street                    City         Postal Code  Phone           Email                    Join Date");
		System.out.println(
				"----------------------------------------------------------------------------------------------------------------------------------------------------");
		// sort the customers in by their Join date
		cr.sortCustomersByJoinDate();
		CustomerIterator customerIterator = cr.getCustomerIterator();
		while (customerIterator.hasNext()) {
			formattedRelport(customerIterator.getNext(), customerIterator.getIndex());
		}
	}

	/**
	 * Print formated report of a customer
	 * 
	 * @param customer
	 *            - the customer to print
	 * @param next
	 *            - the order of the customer in the original array
	 * @return
	 */
	private static void formattedRelport(Customer customer, int index) {
		if (customer == null) {
			return;
		}

		String s = String.format("  %d. %05d  %-13s%-13s%-26s%-13s%-13s%-16s%-25s%-30s", index, customer.getId(), customer.getFirstName(),
				customer.getLastName(), customer.getStreetName(), customer.getCity(), customer.getPostCode(), customer.getPhone(),
				customer.getEmail(), DateTimeUtil.getFormatedDateString(customer.getJoinDate()));

		System.out.println(s);

	}

}
