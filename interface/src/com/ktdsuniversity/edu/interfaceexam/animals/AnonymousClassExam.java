package com.ktdsuniversity.edu.interfaceexam.animals;

import com.ktdsuniversity.edu.interfaceexam.animals.interfaces.Eat;
import com.ktdsuniversity.edu.interfaceexam.animals.interfaces.Fly;
import com.ktdsuniversity.edu.interfaceexam.animals.interfaces.Move;

public class AnonymousClassExam {

	public static void main(String[] args) {

		Eat eat = new Bird("");

		Eat anonyEat = new Eat() {
			@Override
			public void eat() {
				System.out.println("냠냠");
			}
		};
		anonyEat.eat();

		Fly anonyFly = new Fly() {
			@Override
			public void fly() {
				System.out.println("훨훨 납니다.");
			}

		};
		anonyFly.fly();

		String anonyName = "익명"; // 생성자를 만들 수 없기때문에 바깥쪽에서 변수를 만들어서 할당
		Move anonyMove = new Move() {

			private String name = anonyName; // 익명클래스에 멤버변수를 넣을 수 있으나 생성자는 만들 수 없음. 클래스에 이름이 없기 때문에

			@Override
			public void run() {
				System.out.println(name + "이 뜁니다.");
			}

			@Override
			public void walk() {
				// TODO Auto-generated method stub

			}
		};
		anonyMove.run();
	}

}
