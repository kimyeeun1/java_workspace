package postboard;

public class Main {



	public static void main(String[] args) {
		PostBoard postBoard = new PostBoard(1000);
		
		Post postOne = new Post("1번 게시글", "김자바", "2024-07-26","1번 게시글 내용");
		postBoard.createPost(postOne);
		
		Comment comment = new Comment("1번 댓글", "김자바", "2024-07-26");
		postBoard.comment(1, comment);
		
		Post postTwo = new Post("2번 게시글", "이자바", "2024-07-26","2번 게시글 내용");
		postBoard.createPost(postTwo);
		
		postBoard.printAllPost();
		
		postBoard.printOnePost(2);
		
		postBoard.editPost(1, "졸려");
		
		postBoard.printOnePost(1);
		
		postBoard.deletePost(1);
		
		postBoard.printAllPost();
		
		postBoard.countPost();
		
	}
}
