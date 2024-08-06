package com.ktdsuniversity.edu.contacts;

import java.util.List;

public class ContactBook {

	private List<Personinfo> personinfo;

	/**
	 * 이름+별명 검색
	 * 
	 * @param name
	 */
	public void nameSearch(String name) {

		for (int i = 0; i < personinfo.size(); i++) {
			Personinfo person = personinfo.get(i);
			if (name == null) {
				System.out.println(i + " 이름: " + person.getName());
			}
			if (name.equals(person.getName())) {
				System.out.println(i + " 이름: " + person.getName() + "\n나이: " + person.getAge());
			} else {
				System.out.println("해당하는 사람이 없습니다.");
			}
		}
	}

	/*
	 * 연락처 검색
	 */
	public void phoneNumberSearch(String number) {

		for (int i = 0; i < personinfo.size(); i++) {
			Personinfo person = personinfo.get(i);
			if (number == null) {
				System.out.println(i + " 이름: " + person.getName() + ", 연락처: " + person.getPhoneNumber());
			}
			if (number.equals(person.getPhoneNumber())) {
				System.out.println(i + " 이름: " + person.getName() + "(" + person.getAge() + ")");
			} else {
				System.out.println("해당하는 연락처 정보가 없습니다.");
			}
		}
	}

	public void addressSearch(String address) {

		for (int i = 0; i < personinfo.size(); i++) {

		}

	}

}
