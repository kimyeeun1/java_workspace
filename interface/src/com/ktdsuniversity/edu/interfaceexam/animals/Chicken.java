package com.ktdsuniversity.edu.interfaceexam.animals;

import com.ktdsuniversity.edu.interfaceexam.animals.interfaces.Bark;
import com.ktdsuniversity.edu.interfaceexam.animals.interfaces.Eat;
import com.ktdsuniversity.edu.interfaceexam.animals.interfaces.Fly;
import com.ktdsuniversity.edu.interfaceexam.animals.interfaces.Move;

/**
 * Bird interface: Move, Bark, Eat, Fly Bird is a Move Bird is a Bark Bird is a
 * Eat Bird is a Fly
 * 
 * Chicken extends Bird Chicken is a Bird Chicken is a Move Chicken is a Bark
 * Chicken is a Eat Chicken is a Fly
 */
public class Chicken extends Bird implements Move, Bark, Eat, Fly { // 상속과 구현을 함께할 때는 상속을 먼저 써야한다

	public Chicken(String name) {
		super(name);
	}

	@Override
	public void fly() {
		System.out.println(this.name + "이 3초간 퍼덕입니다");
	}

	@Override
	public void eat() {

		System.out.println(this.name + "이 먹습니다");
	}

	@Override
	public void bark() {

		System.out.println(this.name + "이 지저귑니다");
	}

	@Override
	public void walk() {

		System.out.println(this.name + "이 걷습니다");
	}

	@Override
	public void run() {
		System.out.println(this.name + "이 뜁니다");

	}

}
