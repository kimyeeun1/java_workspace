package com.ktdsuniversity.edu.array;

public class Zoo {

	public static void main(String[] args) {

		Animal[] animalArray = new Animal[3];

		animalArray[0] = new Animal("고양이", "나비");
		animalArray[1] = new Animal("강아지", "초코");

		animalArray[0].printMyInformation();
		animalArray[1].printMyInformation();
		animalArray[2].printMyInformation();

	}

}
