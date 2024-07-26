package com.ktdsuniversity.edu.game;

import java.util.Scanner;

public class Game {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		GameInfo gameInfo = new GameInfo("자전거");

		System.out.println("시작 단어는 \"자전거\"입니다.");

		while (true) {

			String nextWord = keyboard.nextLine();

			gameInfo.inputNextWord(nextWord);

			boolean isEnough = gameInfo.isEnoughLength();
			if (!isEnough) {
				break;
			}
			boolean isStartLetter = gameInfo.isStartLetter();
			if (!isStartLetter) {
				break;
			}
			gameInfo.addCount();

			gameInfo.changeCurrentWord();

		}

		gameInfo.gameOver();
	}

}
