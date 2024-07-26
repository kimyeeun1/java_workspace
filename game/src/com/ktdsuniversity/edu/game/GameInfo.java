package com.ktdsuniversity.edu.game;

public class GameInfo {

	public final int WORD_LENGTH = 3;

	/**
	 * 이어나간 단어들을 기록
	 */
	private StringBuffer usedWords;

	/**
	 * 현재(제시)단어
	 */
	private String currentWord;

	/**
	 * 다음 단어
	 */
	private String nextWord;

	/**
	 * 마지막 글자
	 */
	private String lastLetter;

	/**
	 * 게임이 이어나간 횟수
	 */
	private int gameCount;

	/**
	 * 다음 단어의 길이
	 */
	private int nextWordLength;

	public GameInfo(String currentWord) {
		this.usedWords = new StringBuffer();

		this.currentWord = currentWord;
		this.lastLetter = this.currentWord.substring(this.currentWord.length() - 1);
		this.usedWords.append(currentWord);
	}

	public void inputNextWord(String nextWord) {
		this.nextWord = nextWord;
		this.nextWordLength = this.nextWord.length();
	}

	public boolean isEnoughLength() {
		return this.nextWordLength >= this.WORD_LENGTH;
	}

	public boolean isStartLetter() {
		return this.nextWord.startsWith(this.lastLetter);
	}

	public void addCount() {
		this.gameCount++;
	}

	public void changeCurrentWord() {
		this.currentWord = this.nextWord;
		this.lastLetter = this.currentWord.substring(this.currentWord.length() - 1);
		this.usedWords.append("\n");
		this.usedWords.append(currentWord);
	}

	public void gameOver() {
		System.out.println("게임이 종료되었습니다.");
		System.out.println("이어나간 단어의 수는 " + this.gameCount + "번 입니다.");

		String words = this.usedWords.toString();
		System.out.println("이어나간 단어들 입니다.");
		System.out.println(words);
	}

}
