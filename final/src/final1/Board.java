//package final1;
//
//public class Main {
//   Post 클래스
//   - 모든 필드는 private으로 설정한다
//   id: 게시물의 고유 식별자 (정수)
//   title: 게시물의 제목 (문자열)
//   content: 게시물의 내용 (문자열)
//
//   Board 클래스
//   - 메소드(매개변수와 리턴값의 유무는 본인의 로직으로 판단)
//   addPost: 제목과 내용을 받아 새로운 게시물을 게시판에 추가
//   deletePost: 주어진 ID에 해당하는 게시물을 게시판에서 삭제
//      해당 ID가 게시판에 없을 경우 IllegalArgumentException을 던진다
//   getAllPosts(): 모든 게시물을 리스트로 반환
//
//   Main 클래스
//   - 사용자가 메뉴를 통해 게시물을 작성, 삭제, 조회할 수 있어야 한다
   

package final1;

import java.util.ArrayList;
import java.util.List;

public class Board {
	//컬렉션 프레임워크
	//컬렉션 리스트도 필드에 추가
	//변수아닌 리스트로 필드에 추가 하는게 신세계
	
	private List<Post> posts;
	private int nextId;

	// 생성자
	//리스트와 일련번호 초기화
	public Board() {
		super();
		this.posts = new ArrayList<>();
		this.nextId = 1;
	}

	//제목, 내용 받아서 게시판 등록 메소드
	//메소드에서 생성자와 리스트 메소드도 같이 사용 
	//이런거 많이 공부하고 직접 해봐야 할듯
	public void addPost(String title, String content) {
		Post post = new Post(nextId++, title, content);
		posts.add(post);
		System.out.println("1");
	}

	// 삭제메소드
	//for 문으로 리스함수이용    key 를 가져와서 remove로 초기화 
	public void deletePost(int id) throws IllegalArgumentException {
		boolean removed = false;
		for (int i = 0; i < posts.size(); i++) {
			if (posts.get(i).getId() == id) {
				posts.remove(i);
				removed = true;
				break;
			}
		}
		if (!removed) {
			throw new IllegalArgumentException("해당 ID값이없습니다");
		}

	}

	// 전체조회 메소드
	//리턴값드로 리스트 전체객체를 생성하고  던져 주는 수도 있음에 감탄 
	//private List<Post> posts;여에서 필드로 지정한posts객체를 
	//리스트형으로 리턴 
	//
	public List<Post> getAllPosts() {
		return new ArrayList<>(posts);
	}

}
