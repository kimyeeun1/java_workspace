package postboard;

public class PostBoard implements PostBoardInterface{
	
	private Post[] posts;

	public PostBoard(int index) {
		posts = new Post[index];
	}
	
	
	/**
	 * 게시글 작성
	 */
	@Override
	public void createPost(Post post) {
		for(int i = 1; i < posts.length; i++) {
			if(posts[i] == null) {
				if(post.getTitle() != null && post.getTitle().length() < 30) {
					if(post.getName() != null) {
						posts[i] = post;
						posts[i].postNumber(i);
						return;
					}
					else {
						System.out.println("작성자를 기재하세요.");
					}
				}
				else {
					System.out.println("제목은 공백이거나 30글자가 초과를 하면 안됩니다.");
			}
		}
	
	}
}
	
	/**
	 * 모든 게시글 출력
	 */
	@Override
	public void printAllPost() {
		for(int i = 1; i < posts.length; i++) {
			if(posts[i] != null) {
				if(!posts[i].isDelete()) {					
					System.out.println(posts[i].getTitle() + "[" + posts[i].commentCount() + "]");
				}
				else {					
					System.out.println("삭제된 게시글 입니다.");
				}
			}
			else {
				return;
			}
		}
	
	}
	
	/**
	 * 게시글 번호로 게시글 정보 출력
	 */
	@Override
	public void printOnePost(int number) {
		for(int i = 1; i < posts.length; i++) {
			if( posts[i].getNumber() == number) {
				if(!posts[i].isDelete()) {
					posts[i].addViews();
					System.out.println(posts[i].getNumber() + "번 " + "제목: " + posts[i].getTitle());
					System.out.println("작성자: " + posts[i].getName());
					System.out.println("작성일: " + posts[i].getDate());
					System.out.println("조회수: " + posts[i].getViews());
					System.out.println("내용: " + posts[i].getContents());
					System.out.println("[댓글]");
					
					for(int j = 1; j < posts[i].commentCount(); j++) {
						Comment comment = posts[i].getComment()[j];
						if(comment != null) {							
							System.out.println(comment.getComment() + "\n작성자: " + comment.getName() + "\n작성일: " + comment.getDate());
						}
						return;
					}
					return;
				}
				else {
					System.out.println("삭제된 게시글 입니다.");
				}
			}
	
		}
		return;
	}
	
	/**
	 * 게시글 수정
	 */
	@Override
	public void editPost(int number, String contents) {
		for(int i = 1; i < posts.length; i++) {
			if(posts[i].getNumber() == number) {
				if(!posts[i].isDelete()) {
					posts[i].editContents(contents);
					System.out.println("게시글이 수정 되었습니다.");
				}
				else {
					System.out.println("삭제된 게시글 입니다.");
				}
				return;
			}
		}
		return;
	}
	
	/**
	 * 게시글 삭제
	 */
	public void deletePost(int number) {
		for(int i = 1; i < posts.length; i++) {
			if(posts[i].getNumber() == number) {
				if(!posts[i].isDelete()) {
					posts[i].deletePost();
					System.out.println("게시글이 삭제 되었습니다.");
					return;
				}
			}
		}
	
	}
	
	/**
	 * 전체 게시글 수
	 */
	@Override
	public void countPost() {
		int count = 0;
		for (int i = 1; i < posts.length; i++) {
			if(posts[i] != null && !posts[i].isDelete()) {
				count++;				
			}
		}
		System.out.println("전체 게시글 수는 " + count + "개 입니다.");
	}
	
	
	/**
	 * 댓글 추가
	 */
	public void comment(int number, Comment comment) {
		for(int i = 1; i < posts.length; i++) {
			if(posts[i].getNumber() == number) {
				if(!posts[i].isDelete()) {
					if(posts[i].commentCount() < 10) {
						posts[i].addComments(comment);
						System.out.println("댓글이 추가 되었습니다.");
						return;
					}
					else {
						System.out.println("댓글을 더 이상 등록할 수 없습니다.");						
					}
				}
				else {					
					System.out.println("삭제된 게시글 입니다.");
				}
				return;
			}
		
		}
	
		
	}
	
	
}
