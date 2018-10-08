/**
 * Project: Lab3
 * File: CustomerReader.java
 * Date: Sep 29, 2018
 * Time: 1:29:01 PM
 */
package a01077579.io;

import java.util.Arrays;

import a01077579.ApplicationException;
import a01077579.DateTimeUtil;
import a01077579.data.Customer;
import a01077579.data.util.Validator;

/**
 * Class for reading input and construct the Customer objects
 * 
 * @author Daniel Zhu, A01077579
 *
 */
public class CustomerReader {
	/* Customer delimiter */
	private final String CUSTOMER_DELIMITER_FLAG = ":";
	/* Customer Item delimiter */
	private final String CUSTOMER_ITEM_DELIMITER_FLAG = "\\|";
	/* Customer array */
	private Customer[] customers = null;
	/* Iterator for customers */
	private CustomerIterator customerIterator = null;

	/**
	 * Constructor
	 * 
	 * @throws ApplicationException
	 */
	public CustomerReader(String customerInfos) throws ApplicationException {
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
	 * @throws ApplicationException
	 */
	private void customerInfoPaser(String customerInfos) throws ApplicationException {

		final int customerElementNum = 9;

		String[] customerItems;

		// System.out.println("string = " + customerInfos);
		// System.out.println("delimiter = " + delimiter);
		/* given string will be split by the argument delimiter provided. */
		customerItems = customerInfos.split(CUSTOMER_DELIMITER_FLAG);
		if (customerItems == null) {
			return;
		}

		customers = new Customer[customerItems.length];
		Customer customer = null;
		for (int i = 0; i < customerItems.length; i++) {
			String[] items;
			String customerItem = customerItems[i];
			// System.out.println(customerItems[i]);
			// System.out.println("string = " + customerItem);
			// System.out.println("delimiter = " + delimiter2);
			/* given string will be split by the argument delimiter provided. */
			items = customerItem.split(CUSTOMER_ITEM_DELIMITER_FLAG);

			if (items.length < customerElementNum) {
				throw new ApplicationException("Not enough elements provided: " + "Expected " + customerElementNum + " elements but got "
						+ items.length + ":" + Arrays.toString(items));
			}

			long id = Long.parseLong(items[0]);

			customer = new Customer.Builder(id, items[6]).firstName(items[1]).lastName(items[2]).streetName(items[3]).city(items[4])
					.postCode(items[5]).email(getEmail(items[7])).joinDate(DateTimeUtil.getJoinDate(items[8].trim())).build();
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
	 * @throws ApplicationException
	 */
	private String getEmail(String emailString) throws ApplicationException {
		if (!Validator.validateEmail(emailString)) {
			throw new ApplicationException("\'" + emailString + "\'" + " is an invalid email address.");
		}
		return emailString;
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
