package com.ktdsuniversity.edu.interfaceexam.animals;

import com.ktdsuniversity.edu.interfaceexam.animals.interfaces.Human;
import com.ktdsuniversity.edu.interfaceexam.animals.interfaces.Move;

/**
 * Person is a Human Human is a Move Human is a Eat
 * 
 * Person is a Human Person is a Move Person is a Eat
 */
public class Person implements Human {

	private String name;

	public Person(String name) {
		this.name = name;
	}

	@Override
	public void walk() {
		System.out.println(this.name + "이 두 발로 걷습니다. 속도: " + Move.SPEED);
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println(this.name + "이 두 발로 뜁니다. 속도: " + Move.RUN_SPEED);

	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println(this.name + "이 먹습니다.");

	}

	@Override
	public void work() {
		// TODO Auto-generated method stub
		System.out.println(this.name + "이 일을 합니다.");

	}

	@Override
	public void speak() {
		// TODO Auto-generated method stub
		System.out.println(this.name + "이 말을 합니다.");

	}

	@Override
	public void think() {
		// TODO Auto-generated method stub
		System.out.println(this.name + "이 생각을 합니다.");

	}

}
