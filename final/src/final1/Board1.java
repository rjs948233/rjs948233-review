package final1;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Board1 {
	//맵객체도 필드로 지정 해쉬맵이아는  맵을사용
	//맵과해쉬맵의차아 
	//맵은 리스트나셋과다르게 Map인터페이스가 존재
	//Map은 HashMap  TreeMap  LinkedHash Map이 있음
	//HashMap은 해싱을통해 key의중복여부를 판단
	//아래처럼 한번에 생성하지 않고 생성자에서 생성
	//private Map<Integer, Post> posts=new Post();
	//객체생성을 하는것은 여러가지경우가 많으니 생성자에서 생성하는게 맞을것 같음
	private Map<Integer, Post> posts;
	//키값을위한 변수선언
	private int nextId;
	
    //기본생성자
	//여기서 맵도 초기화 함
	//키값은 초기값 1로 초기화
	public Board1() {
		super();
		//생성자안에 필드에서 선언한 맵도 같이 초기화 
		//맵선언과 생성을 분리해서 생성자에서 맵을 생성
		this.posts = posts;
		this.nextId = 1;
	}

	// 등록 메소드
	//맵을 이용하는경우
	public void addPost(String title, String content) {
		//Post클래스의 생성자를 이용해서 객체생성
		//맵선언과 생성을 분리해서 생성자에서 맵을 생성
		//private Map<Integer, Post> posts=private Map<Integer, Post> posts
		Post post = new Post(nextId++, title, content);
		//맵에 저장 키값과 생성자로 만든 객체를 맵에 저장
		//맵에는 키와 객체가 들어가 있음
		//맵에 키와 객체를 저장하면 끝
		posts.put(post.getId(), post);
		System.out.println("게시물 작성완료");

	}

	// 삭제 메소드
	//맵의 키인 id를 매개변수로 받아서 맵에 있나 확인후 
	public void deletePost(int id) throws IllegalArgumentException {
		if (!posts.containsKey(id)) {
			throw new IllegalArgumentException("해당 id값이 없습니다");
		}
		posts.remove(id);
	}

	// 조회 메소드
	public List<Post> getAllPosts() {
		return new ArrayList<>(posts.values());
	}

}
