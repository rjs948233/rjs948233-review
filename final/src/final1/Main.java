package final1;

import java.util.List;

public class Main {

//	Post 클래스
//	- 모든 필드는 private으로 설정한다
//	id: 게시물의 고유 식별자 (정수)
//	title: 게시물의 제목 (문자열)
//	content: 게시물의 내용 (문자열)

//	Board 클래스
//	- 메소드(매개변수와 리턴값의 유무는 본인의 로직으로 판단)
//	addPost: 제목과 내용을 받아 새로운 게시물을 게시판에 추가
//	deletePost: 주어진 ID에 해당하는 게시물을 게시판에서 삭제
//		해당 ID가 게시판에 없을 경우 IllegalArgumentException을 던진다
//	getAllPosts(): 모든 게시물을 리스트로 반환

//	Main 클래스
//	- 사용자가 메뉴를 통해 게시물을 작성, 삭제, 조회할 수 있어야 한다
	
	public static void main(String[] args) {

		//메인에서 게시판을 하나씩 만들어 줌
		//이렇게 쉽게처리 할걸~~~
		//이부분 어렵게 하느라 고생했음
		//Board 객체생성 --> 만들었던 Board클래스를   new로 생성자 호출하면 끝
		
		Board board = new Board();
		//board참조변수를 이용해서 객체생성
		//생성자이용해서 객체를 생상
		//키값은 addPost메소드에서 하나씩증가 하므로 매개변수로 제목과 내용만 전달

		board.addPost("제목 1", "내용 1");
		board.addPost("제목 2", "내용 2");
		board.addPost("제목 3", "내용 3");
		System.out.println("게시물 작성완료");
		
        //List<Post>형 으로 Board클래스에서 만든 getAllPosts메소드 이용
		//참조변수 a를 이용 리스트 내용출력
		
		List<Post> a = board.getAllPosts();
		for (Post post : a) {
			System.out.println(post.getId());
			System.out.println(post.getTitle());
			System.out.println(post.getContent());
		}

	}

}
