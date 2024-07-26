package com.ktdsuniversity.edu.game;

import java.util.Scanner;

public class KiGame {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		KiGameInfo kiGame = new KiGameInfo("기러기");

		System.out.println("시작 단어는 \"기러기\"입니다.");

		while (true) {

			String nextWord = keyboard.nextLine();

			kiGame.inputNextWord(nextWord);

			boolean isEnough = kiGame.isEnoughLength();
			if (!isEnough) {
				break;
			}
			boolean isLastLetter = kiGame.isLastLetter();
			if (!isLastLetter) {
				break;
			}
			kiGame.addCount();
			kiGame.changeCurrentWord();

		}

		kiGame.gameOver();
	}

}
