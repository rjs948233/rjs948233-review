package review1;

import java.util.ArrayList;

import review.UserVO;

public class UserService {
//  UserService 클래스를 선언한다.
//  - 회원정보를 저장할 List를 private으로 선언한다.
//  - 아이디 중복검사 메소드 정의
//  - 회원가입 메소드 정의
//  - 로그인 메소드 정의
   

	// 필드
	// 모든 회원정보를 저장하는 리스트(private ArrayList)
    //  - 회원정보를 저장할 List를 private으로 선언한다. 
	private ArrayList<UserVO> userList = new ArrayList<>();
	
 
    //  - 아이디 중복검사 메소드 정의
	 public boolean checkId(String id) {
	      // (for-each문) 모든 회원정보를 하나씩 가져와 변수에 담는다
	      // 조거문(if문) 변수에 담긴 id값과 매개변수로 전달한 id와 비교한다(equals)
	      for (UserVO user : userList) {
	         if (user.getId().equals(id)) {
	            return false;
	         }
	      }
	      return true;
	   }
  
    	
	void join(UserVO user,int id) {
		  if (user.getId().equals(id) ) {
			  System.out.println("중복가입 불가합니다");
		  }else {
			  userList.add(user);
		  }
	     // userList.contains(userList);
     }
}
