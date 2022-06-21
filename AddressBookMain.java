package com.bridgelabz.addressbook;

import java.util.ArrayList;
import java.util.List;

public class AddressBookMain {
	
	List<Contact> listContact = new ArrayList<Contact>();

	public static void main(String[] args) {
		AddressBook addressBook = new AddressBook();
		addressBook.addNewContact();
		addressBook.addNewContact();
		addressBook.addNewContact();
		addressBook.addNewContact();
		System.out.println(addressBook.listContact);
	}

}
