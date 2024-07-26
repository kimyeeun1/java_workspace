package com.ktdsuniversity.edu.interfaceexam.animals.interfaces;

public interface Fly {

	/**
	 * Default Abstract Method Default method ==> 추상 메소드가 기본적으로 하는 일을 미리 만들어 놓은 것
	 */

	public default void fly() {
		// 변수를 사용할 수 없음
		System.out.println("날아 다닙니다.");
	}

}
