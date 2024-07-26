package com.ktdsuniversity.edu.interfaceexam.animals;

public class MainAddress {

	public static void addressBook(PrintAddress address) {

		address.creatAddressBook();
		address.deletAddressBook();
		address.modifyAddressBook();
		address.readAllAddressBook();
		address.readOneAddressBook();

	}

	public static void main(String[] args) {
		PrintAddress address = new PrintAddress("김");

		address.creatAddressBook();
		address.deletAddressBook();
		address.modifyAddressBook();
		address.readAllAddressBook();
		address.readOneAddressBook();

	}

}
