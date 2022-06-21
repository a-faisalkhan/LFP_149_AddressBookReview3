package com.bridgelabz.addressbook;

public class Contact {
	
	String firstName;
	String lastName;
	String pinCode;
	String mobileNumber;
	
	public Contact(String firstName, String lastName, String pinCode, String mobileNumber) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.pinCode = pinCode;
		this.mobileNumber = mobileNumber;
	}

	@Override
	public String toString() {
		return "Contact [firstName=" + firstName + ", lastName=" + lastName + ", pinCode=" + pinCode + ", mobileNumber="
				+ mobileNumber + "]";
	}
	

}
