package com.ktdsuniversity.edu.array;

public class Animal {

	private String type;

	private String name;

	public Animal(String type, String name) {
		this.type = type;
		this.name = name;
	}

	public void printMyInformation() {
		System.out.println("종: " + this.type);
		System.out.println("이름: " + this.name);
		System.out.println("==================");
	}

}
