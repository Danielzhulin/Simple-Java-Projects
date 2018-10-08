/**
 * Project: Lab4
 * File: CompareByJoinedDate.java
 * Date: Oct 7, 2018
 * Time: 1:22:35 PM
 */
package a01077579.data.util;

import java.util.Comparator;

import a01077579.data.Customer;

/**
 * A Class for comparing two customers by their join date
 * 
 * @author Daniel Zhu, A01077579
 *
 */
public class CompareByJoinedDate implements Comparator<Customer> {

	/**
	 * 
	 */
	public CompareByJoinedDate() {
	}

	/*
	 * (non-Javadoc)
	 * @see java.util.Comparator#compare(java.lang.Object, java.lang.Object)
	 */
	@Override
	public int compare(Customer a, Customer b) {
		if (a == null || b == null || a.getJoinDate() == null || b.getJoinDate() == null) {
			return 0;
		}
		return a.getJoinDate().compareTo(b.getJoinDate());
	}

}
