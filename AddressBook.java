package com.bridgelabz.addressbook;

import java.util.ArrayList;
import java.util.List;

public class AddressBook {
	List<Contact> listContact = new ArrayList<Contact>();

	public void addNewContact() {
		Contact contact = new Contact("Faisal", "Ahmad", "526894", "6655443322");
		Contact contact1 = new Contact("Jay", "Kumar", "926894", "8855443322");
		Contact contact2 = new Contact("Ravi", "Rao", "526898", "6655443355");
		Contact contact3 = new Contact("Kishan", "Yadav", "326896", "1255443389");
		listContact.add(contact);
		listContact.add(contact1);
		listContact.add(contact2);
		listContact.add(contact3);
	}

}
