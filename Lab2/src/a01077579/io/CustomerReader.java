/**
 * Project: Lab2
 * File: CustomerReader.java
 * Date: Sep 22, 2018
 * Time: 1:29:01 PM
 */
package a01077579.io;

import a01077579.data.Customer;
import a01077579.data.util.Validator;

/**
 * Class for reading input and construct the Customer objects
 * 
 * @author Daniel Zhu, A01077579
 *
 */
public class CustomerReader {
	/* Customer array */
	private Customer[] customers = null;
	/* Iterator for customers */
	private CustomerIterator customerIterator = null;

	/**
	 * Constructor
	 */
	public CustomerReader(String customerInfos) {
		customerInfoPaser(customerInfos);
		customerIterator = new CustomerIterator(customers.length);

	}

	/**
	 * @return the customerIterator
	 */
	public CustomerIterator getCustomerIterator() {
		return customerIterator;
	}

	/**
	 * Parse customer information strings and create customer objects based on the information
	 * 
	 * @param customerInfos
	 */
	private void customerInfoPaser(String customerInfos) {

		String[] customerItems;

		/* delimiter */
		String delimiter = ":";
		// System.out.println("string = " + customerInfos);
		// System.out.println("delimiter = " + delimiter);
		/* given string will be split by the argument delimiter provided. */
		customerItems = customerInfos.split(delimiter);
		if (customerItems == null) {
			return;
		}
		customers = new Customer[customerItems.length];
		Customer customer = null;
		for (int i = 0; i < customerItems.length; i++) {
			String[] items;
			String customerItem = customerItems[i];
			// System.out.println(customerItems[i]);
			String delimiter2 = "\\|";
			// System.out.println("string = " + customerItem);
			// System.out.println("delimiter = " + delimiter2);
			/* given string will be split by the argument delimiter provided. */
			items = customerItem.split(delimiter2);
			long id = Long.parseLong(items[0]);

			customer = new Customer.Builder(id, items[6]).firstName(items[1]).lastName(items[2]).streetName(items[3]).city(items[4])
					.postCode(items[5]).email(getEmail(items[7])).joinDate(items[8]).build();
			// System.out.println(customer);

			customers[i] = customer;
		}

	}

	/**
	 * Get the email string
	 * 
	 * @param emailString
	 *            - the source email string
	 *            -
	 * @return
	 */
	private String getEmail(String emailString) {
		return Validator.validateEmail(emailString) ? emailString : "N/A";
	}

	/**
	 * Inner class as an Iterator for customer array
	 * 
	 * @author Daniel Zhu, A01077579
	 *
	 */
	public class CustomerIterator {
		private int index;
		private int customerNum;

		public int getIndex() {
			return index;
		}

		public CustomerIterator(int num) {
			customerNum = num;
		}

		public boolean hasNext() {
			return index <= customerNum - 1;
		}

		public Customer getNext() {
			return hasNext() ? customers[index++] : null;
		}
	}

}
