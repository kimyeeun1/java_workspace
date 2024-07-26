package com.ktdsuniversity.edu.interfaceexam.animals.interfaces;

import com.ktdsuniversity.edu.interfaceexam.animals.PrintAddress;

public class AnonymousAdderss {

	public static void main(String[] args) {

		String anonyName = "김";
		PrintAddress address = new PrintAddress(anonyName) {
			@Override
			public void creatAddressBook() {
				System.out.println("주소록 추가");
			}

			@Override
			public void modifyAddressBook() {
				System.out.println("");
			}

			@Override
			public void readAllAddressBook() {
				// TODO Auto-generated method stub
				super.readAllAddressBook();
			}
		};

	}

}
