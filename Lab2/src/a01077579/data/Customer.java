/**
 * Project: Lab2
 * File: Customer.java
 * Date: Sep 22, 2018
 * Time: 1:28:16 PM
 */
package a01077579.data;

/**
 * Class Customer
 * 
 * @author Daniel Zhu, A01077579
 *
 */
public class Customer {
	private long id;
	private String firstName;
	private String lastName;
	private String streetName;
	private String city;
	private String postCode;
	private String phone;
	private String email;
	private String joinDate;

	/**
	 * @return the id
	 */
	public long getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(long id) {
		this.id = id;
	}

	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * @param firstName
	 *            the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * @param lastName
	 *            the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * @return the streetName
	 */
	public String getStreetName() {
		return streetName;
	}

	/**
	 * @param streetName
	 *            the streetName to set
	 */
	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}

	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}

	/**
	 * @param city
	 *            the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}

	/**
	 * @return the postCode
	 */
	public String getPostCode() {
		return postCode;
	}

	/**
	 * @param postCode
	 *            the postCode to set
	 */
	public void setPostCode(String postCode) {
		this.postCode = postCode;
	}

	/**
	 * @return the phone
	 */
	public String getPhone() {
		return phone;
	}

	/**
	 * @param phone
	 *            the phone to set
	 */
	public void setPhone(String phone) {
		this.phone = phone;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email
	 *            the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return the joinDate
	 */
	public String getJoinDate() {
		return joinDate;
	}

	/**
	 * @param joinDate
	 *            the joinDate to set
	 */
	public void setJoinDate(String joinDate) {
		this.joinDate = joinDate;
	}

	/**
	 * Inner class to build Customer instance
	 * 
	 * @author Daniel Zhu, A01077579
	 *
	 */
	public static class Builder {
		private long id;
		private String firstName;
		private String lastName;
		private String streetName;
		private String city;
		private String postCode;
		private String phone;
		private String email;
		private String joinDate;

		/**
		 * @param id
		 * @param phone
		 */
		public Builder(long id, String phone) {
			super();
			this.id = id;
			this.phone = phone;
		}

		public Builder firstName(String val) {
			firstName = val;
			return this;
		}

		public Builder lastName(String val) {
			lastName = val;
			return this;
		}

		public Builder streetName(String val) {
			streetName = val;
			return this;
		}

		public Builder city(String val) {
			city = val;
			return this;
		}

		public Builder postCode(String val) {
			postCode = val;
			return this;
		}

		public Builder email(String val) {
			email = val;
			return this;
		}

		public Builder joinDate(String val) {
			joinDate = val;
			return this;
		}

		public Customer build() {
			return new Customer(this);
		}
	}

	/**
	 * @param builder
	 */
	private Customer(Builder builder) {
		id = builder.id;
		firstName = builder.firstName;
		lastName = builder.lastName;
		streetName = builder.streetName;
		city = builder.city;
		postCode = builder.postCode;
		phone = builder.phone;
		email = builder.email;
		joinDate = builder.joinDate;
	}

	/*
	 * (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Customer [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", streetName=" + streetName + ", city=" + city
				+ ", postCode=" + postCode + ", phone=" + phone + ", email=" + email + ", joinDate=" + joinDate + "]";
	}

}
