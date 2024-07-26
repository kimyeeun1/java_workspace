package com.ktdsuniversity.edu.interfaceexam.animals;

import com.ktdsuniversity.edu.interfaceexam.animals.interfaces.AddressBook;

public class PrintAddress implements AddressBook {

	private String name;

	public PrintAddress(String name) {
		this.name = name;
	}

	@Override
	public void readAllAddressBook() {
		System.out.println(this.name + "의 주소록을 모두 출력합니다.");
	}

	@Override
	public void readOneAddressBook() {
		System.out.println(this.name + "의 주소록을 출력합니다.");

	}

	@Override
	public void creatAddressBook() {

		System.out.println(this.name + "의 주소록을 추가합니다.");
	}

	@Override
	public void modifyAddressBook() {

		System.out.println(this.name + "의 주소록을 수정합니다.");
	}

	@Override
	public void deletAddressBook() {

		System.out.println(this.name + "의 주소록을 삭제합니다.");
	}

}
