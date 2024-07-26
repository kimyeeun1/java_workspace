package com.ktdsuniversity.edu.interfaceexam.animals.interfaces;

public interface Move {

	/*
	 * 인터페이스에서 쓰는 변수는 기본적으로 상수
	 */
	public static final int SPEED = 10;
	public int RUN_SPEED = 20;

	public void walk();

	public void run();

}
