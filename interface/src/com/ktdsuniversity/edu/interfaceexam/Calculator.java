package com.ktdsuniversity.edu.interfaceexam;

/**
 * 인터페이스의 특징 - 메소드만 정의 - 추상 메소드 - 어떻게 동작하는지는 관심이 없다 - 인터페이스가 정해놓은 기능만 구현한다
 */
public interface Calculator {

	// public abstract int add(int a, int b); : abstract 생략 가능
	public int add(int a, int b);

	public int sub(int a, int b);

	public double div(int a, int b);

	public int mul(int a, int b);

}
