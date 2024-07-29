package com.ktdsuniversity.edu.exceptions.custom;

public class Site {

	public static void main(String[] args) {
		MemberRegister register = new MemberRegister();
		Member member = new Member("id", null, "123");

		boolean registResult = false;
		try {
			registResult = register.regist(member);
		} catch (EmptyRegistInfoException erie) {
			System.out.println(erie.getMessage());
			erie.printStackTrace();

		}

		System.out.println(registResult);

	}
}
