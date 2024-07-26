package com.ktdsuniversity.edu.game;

import java.util.Scanner;

public class NaGame {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		NaGameInfo naGame = new NaGameInfo("나");

		System.out.println("시작 단어는 \"나\" 입니다.");

		while (true) {
			String nextWord = keyboard.nextLine();

			naGame.inputNextWord(nextWord);

			boolean isEnough = naGame.isEnoughLength();
			if (!isEnough) {
				break;
			}

			boolean isStartLetter = naGame.isStartLetter();
			if (!isStartLetter) {
				break;
			}

			naGame.addCount();

			naGame.changeCurrentWord();

		}

		naGame.gameOver();
	}

}
