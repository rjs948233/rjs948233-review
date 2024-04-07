package map;

import java.util.HashMap;
//카페메뉴
//   아메리카노 2000원
//   카페라떼 2500원
//   바닐라라떼 4000원
//   초코라떼 4000원
import java.util.Iterator;

//   HashMap에 저장하기
//   출력과 입력
//   1. 아메리카노
//   2. 카페라떼
//   3. 바닐라라떼
//   4. 초코라떼
//   번호를 선택하세요 : 2
//   카페라떼의 가격은 2500원 입니다
public class StudentHashStudy {
	public static void main(String[] args) {
		// 1) HashMap<String, Integer> menu 객체 생성
	    // 2) 사용자에게 선택할 메뉴 msg 변수 선언
	    // 3) 입력 클래스 import
	    // 4) msg 출력
	    // 5) 변수 생성 nextInt
	    // 7) switch~case
	    // 1~4 "메뉴 " + menu.get("키값")
	    // 8) 결과

	    // 7-2) 선택한 번호에 따라 메뉴를 출력
	    // memuName = "아메리카노";

	    // 8-2) memuName + "의 가격은" + memu.get(memuName)
		
	HashMap<String, Integer> menu=new HashMap<>();
	
	menu.put("아메리카노", 2000);
	menu.put("카페라떼", 2500);
	menu.put("바닐라라떼", 4000);
	menu.put("초코라떼", 4000);
	
	System.out.println("전체메뉴:");
	
	// 조회 .get(key)
    System.out.println("조회 .get(key) : "+menu.get("아메리카노"));
    
    // 길이 .size()
    System.out.println("길이 .size() : "+menu.size());
    
    // containsKey
    System.out.println("containsKey : "+menu.containsKey("바닐라라떼"));
    
    // containsValue
    System.out.println("containsValue : "+menu.containsValue(4000));
    
    //Iterater<E>   는 List 컬렉션에서 제공하는 인터페이스로 사전적인 의미로는 반복하다라는
    //뜻을 지니고 있음List 요소를 하나씩 순회하며 추출하는데사용 
    //E에는 순회할 데이터 타입을 지정하는데 보통순회할 컬렉션이 포함하는 데이터 타입과 동일
    //하게 지정함 반복자라고도 불리는  Iterator 객체는 선언된 컬렉샨 객체에서 가져와
    //사용함 메서드 boolean  hasNext 다음순회할 데이터유무확인 
    //메서드 E next() 다음 위치의 데이터로 이동하여 반환 
    Iterator<String> iter = menu.keySet().iterator();

    
   System.out.println("next" + iter.next());
   System.out.println("next" + iter.next());
   System.out.println("next" + iter.next());
   System.out.println("next" + iter.next());
   
   Iterator<String> iter2 = menu.keySet().iterator();
   
   System.out.println("next" + iter.hasNext());
   
   //while (iter.hasNext()) {
       System.out.println("iter2"+iter2.next());
    //}

	for (String menuName : menu.keySet()) {
		System.out.println(menuName + "가격은 "+menu.get(menuName)+"입니다");
	}
	
 }
	
}
