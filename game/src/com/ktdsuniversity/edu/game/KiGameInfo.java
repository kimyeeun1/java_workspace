package com.ktdsuniversity.edu.game;

public class KiGameInfo {

	public final int WORD_LENGTH = 2;
	public final String LAST_WORD = "기";

	private StringBuffer usedwords;

	private String currentWord;

	private String nextWord;

	private String lastLetter;

	private int gameCount;

	private int nextWordLength;

	public KiGameInfo(String currentWord) {
		this.usedwords = new StringBuffer();

		this.currentWord = currentWord.trim();
		this.lastLetter = this.currentWord.substring(this.currentWord.length() - 1);
		this.usedwords.append(currentWord);
	}

	public void inputNextWord(String nextWord) {
		this.nextWord = nextWord.trim();
		this.nextWordLength = this.nextWord.length();
	}

	public boolean isEnoughLength() {
		return this.nextWordLength >= this.WORD_LENGTH;
	}

	public boolean isLastLetter() {
		return this.nextWord.endsWith(LAST_WORD);
	}

	public void addCount() {
		this.gameCount++;
	}

	public void changeCurrentWord() {
		this.currentWord = this.nextWord;
		this.usedwords.append("\n");
		this.usedwords.append(currentWord);
	}

	public void gameOver() {
		System.out.println("게임이 종료되었습니다.");
		System.out.println("이어나간 단어의 수는 " + this.gameCount + "번 입니다.");

		String words = this.usedwords.toString();
		System.out.println("이어나간 단어들 입니다.");
		System.out.println(words);
	}

}
