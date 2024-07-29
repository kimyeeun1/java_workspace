package com.ktdsuniversity.edu.exceptions;

public class TryCatchFinally {

	public static void main(String[] args) {
		try {
			Class.forName("SomeAClass");
		} catch (ClassNotFoundException cnfe) {
			// cnfe.printStackTrace();
			System.out.println("클래스를 찾을 수가 없습니다.");
		}
	}

}
