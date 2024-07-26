package com.ktdsuniversity.edu.game;

public class NaGameInfo {

	public final int WORD_LENGTH = 2;
	public final String FIRST_WORD = "나";

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
	 * 첫번째 글자
	 */
	private String firstLetter;

	/**
	 * 게임이 이어나간 횟수
	 */
	private int gameCount;

	/**
	 * 다음 단어의 길이
	 */
	private int nextWordLength;

	/**
	 * 현재 단어를 초기화 해주고 첫 글자 추출하여 초기화 하는 메소드
	 * 
	 * @param currentWord
	 */
	public NaGameInfo(String currentWord) {
		this.usedWords = new StringBuffer();

		this.currentWord = currentWord.trim();
		this.firstLetter = this.currentWord.substring(this.currentWord.length());
		this.usedWords.append(currentWord);
	}

	/**
	 * 다음 단어를 초기화 해주고 다음 단어의 길이를 추출하여 초기화하는 메소드
	 * 
	 * @param nextWord
	 */
	public void inputNextWord(String nextWord) {
		this.nextWord = nextWord.trim();
		this.nextWordLength = this.nextWord.length();
	}

	/**
	 * 다음 단어 길이가 2 이상인지 확인하는 메소드
	 * 
	 * @return
	 */
	public boolean isEnoughLength() {
		return this.nextWordLength >= this.WORD_LENGTH;
	}

	/**
	 * 다음 단어의 첫 글자가 "나"인지 확인하는 메소드
	 * 
	 * @return
	 */
	public boolean isStartLetter() {
		return this.nextWord.startsWith(FIRST_WORD);
	}

	/**
	 * 게임이 이어간 횟수 구하는 메소드
	 */
	public void addCount() {
		this.gameCount++;
	}

	public void changeCurrentWord() {
		this.currentWord = this.nextWord;
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
