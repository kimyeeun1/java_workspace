package postboard;

public class Comment {
	
	private int number;
	private String comment;
	private String name;
	private String date;
	
	public Comment(String comment, String name, String date) {
		this.comment = comment;
		this.name = name;
		this.date = date;
	}
	
	public int getNumber() {
		return this.number;
	}

	public String getComment() {
		return this.comment;
	}

	public String getName() {
		return this.name;
	}

	public String getDate() {
		return this.date;
	}
	
	/**
	 * 댓글 번호 초기화
	 */
	public void commentNumber(int number) {
		this.number = number;
	}

}
