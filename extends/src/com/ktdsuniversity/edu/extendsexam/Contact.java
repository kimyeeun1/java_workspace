package com.ktdsuniversity.edu.extendsexam;

public class Contact {

	private String name;
	private String phone;

	/**
	 * 사용자의 요청으로 주소 추가
	 */
	private String address;

	public Contact(String name, String phone) {
		this.name = name;
		this.phone = phone;
	}

	public Contact(String name, String phone, String address) {
		this.name = name;
		this.phone = phone;
		this.address = address;
	}

	public String getName() {
		return this.name;
	}

	public String getPhone() {
		return this.phone;
	}

	public String getAddress() {
		return this.address;
	}

	public void printContact() {
		System.out.println("이름: " + this.name + "\n" + "연락처: " + this.phone + "\n" + "주소: " + this.address);

	}

	public void phoneCall() {
		System.out.println("이름: " + this.name + "에게 전화를 겁니다.");
	}

}
