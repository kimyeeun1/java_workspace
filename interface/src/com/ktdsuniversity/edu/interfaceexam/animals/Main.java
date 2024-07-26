package com.ktdsuniversity.edu.interfaceexam.animals;

import com.ktdsuniversity.edu.interfaceexam.animals.interfaces.Bark;
import com.ktdsuniversity.edu.interfaceexam.animals.interfaces.Eat;
import com.ktdsuniversity.edu.interfaceexam.animals.interfaces.Fly;
import com.ktdsuniversity.edu.interfaceexam.animals.interfaces.Move;

public class Main {

	public static void flying(Fly fly) {
		fly.fly();

	}

	public static void moving(Move move) {
		move.walk();
		move.run();
	}

	public static void eating(Eat eat) {
		eat.eat();
	}

	public static void barking(Bark bark) {
		bark.bark();
	}

	// 상속: IS A ==> Sub Class is a Super Class
	// 인터페이스 구현: IS A ==> Instance of a Interface\
	// Dog == > Move, Eat, Bark

	public static void main(String[] args) {
		Dog poppy = new Dog("뽀삐");
		poppy.walk();
		poppy.run();
		poppy.eat();
		poppy.bark();

		/*
		 * Eat eat = poppy; eat.eat();
		 * 
		 * Move move = poppy; move.walk(); move.run();
		 * 
		 * Bark bark = poppy; bark.bark();
		 */

		eating(poppy);
		barking(poppy);
		moving(poppy);

		Bird 비둘기 = new Bird("구구");
		비둘기.run();
		비둘기.walk();
		비둘기.eat();
		비둘기.bark();
		비둘기.fly();

		eating(비둘기);
		barking(비둘기);
		moving(비둘기);
		flying(비둘기);

		Chicken 닭 = new Chicken("꼬꼬");
		닭.run();
		닭.walk();
		닭.eat();
		닭.bark();
		닭.fly();

		eating(닭);
		barking(닭);
		moving(닭);
		flying(닭);

		Duck duck = new Duck("덕덕");
		duck.fly();

		Person person = new Person("김");
		person.eat();
		person.run();
		person.speak();
		person.think();

		moving(person);
		eating(person);

	}

}
