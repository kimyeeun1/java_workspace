package com.ktdsuniversity.edu.generic;

/**
 * 
 * @param <TYPE> : 점수의 타입
 */
public class ScoreList<T> {

	/**
	 * 점수 배열
	 */
	private Object[] scoreArray;
	/**
	 * 점수 배열에 등록된 아이템의 개수 점수를 등록할 때마다 하나씩 증가한다
	 */
	private int size;

	public ScoreList() {
		this.scoreArray = new Object[2];

	}

	/**
	 * scoreArray 배열에 아이템을 추가한다 아이템이 추가될 때마다 size 값은 하나씩 증가해야한다
	 * 
	 * 만약, size의 값이 배열의 길이보다 크거나 같을 경우 scoreArray 배열의 길이는 두개씩 늘어나도록 한다
	 * 
	 * @param score 배열에 추가할 아이템
	 */
	public void add(T score) {
		if (this.size >= this.scoreArray.length) {
			// 배열의 길이를 늘려준다
			Object[] tempScoreArray = new Object[this.scoreArray.length + 2]; // tempScoreArray 새로운 변수 생성

			// 배열을 복사한다
			// this.scoreArray의 0번 인덱스부터 this.scoreArray.length까지
			// tempScoreArray의 0번 인덱스를 시작으로 복사를 해준다
			System.arraycopy(scoreArray, 0, tempScoreArray, 0, this.scoreArray.length);

			// 메모리를 교체한다
			this.scoreArray = tempScoreArray;
		}
		this.scoreArray[this.size++] = score;

	}

	public T get(int index) {
		if (index < 0 || index >= this.size) {
			throw new IndexOutOfBoundsException(index);
		}

		// this.scoreArray[index]의 결과는 Object이므로 T 타입으로 형변환 해야한다
		return (T) this.scoreArray[index];
	}

	/**
	 * scoreArray에 등록된 아이템의 개수를 반환
	 * 
	 * @return
	 */
	public int getSize() {
		return this.size;

	}

	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append("ScoreList[");
		for (Object score : this.scoreArray) {
			sb.append(score + ", ");
		}
		sb.append("]");
		return sb.toString();
	}
}
