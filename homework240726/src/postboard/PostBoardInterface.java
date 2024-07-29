package postboard;

public interface PostBoardInterface {

	
	/**
	 * 게시글 작성
	 */
	public void createPost(Post post);
	
	public void printAllPost();
	
	public void printOnePost(int number);
	
	public void editPost(int number, String contents);
	
	public void deletePost(int number);
	
	public void countPost();
	
	public void comment(int number, Comment comment);
	
	
	

}
