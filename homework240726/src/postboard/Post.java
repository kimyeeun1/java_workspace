package postboard;

public class Post {
	
	private int number;
	private String title;
	private String name;
	private String date;
	private int views;
	private String contents;
	private Comment[] comment;
	private boolean delete;

	
	public Post(String title, String name, String date, String contents) {
		this.title = title;
		this.name = name;
		this.date = date;
		this.views = 0;
		this.contents = contents;
		this.comment = new Comment[10];
		this.delete = false;
	}
	
	public int getNumber() {
		return number;
	}

	public String getTitle() {
		return title;
	}

	public String getName() {
		return name;
	}

	public String getDate() {
		return date;
	}

	public int getViews() {
		return views;
	}

	public String getContents() {
		return contents;
	}

	public Comment[] getComment() {
		return comment;
	}

	public boolean isDelete() {
		return delete;
	}
	
	/**
	 * 게시글 번호 초기화
	 * @param number
	 */
	public void postNumber(int number) {
		this.number = number;
	}
	
	/**
	 * 댓글 갯수
	 * @return
	 */
	public int commentCount() {
		int count = 0;
		for (int i = 0; i < comment.length; i++) {			
			if (comment[i] != null) {
				count++;
			}
			else {
				break;
			}
		}
		return count;
	}
	
	/**
	 * 조회수 증가
	 */
	public void addViews() {
		this.views++;
	}
	
	/**
	 * 내용 수정
	 * @param contents
	 */
	public void editContents(String contents) {
		this.contents = contents;
	}
	
	/**
	 * 게시글 삭제
	 */
	public void deletePost() {
		this.delete = true;
	}
	
	/**
	 * 댓글 추가
	 * @param comment
	 */
	public void addComments(Comment comment) {
		for (int i = 0; i < this.comment.length; i++) {
			if(this.comment[i] == null) {
				this.comment[i] = comment;				
				this.comment[i].commentNumber(i);
				return;
			}
		}
	}


}
