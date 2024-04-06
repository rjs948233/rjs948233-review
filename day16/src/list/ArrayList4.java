package list;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ArrayList4 {
//	 static ArrayList<Integer> list=new ArrayList<Integer>();

	
	public static void main(String[] args) {
	   ArrayList<Integer> list=new ArrayList<Integer>();	 
		//list 네 값을 대입
	    //배열과동일하게 for 문사용
	   
       	for(int i=0;i<20;i++) {
       			list.add(i*10);
       	}
       	
        // Collections 클래스 : 컬렉션 프레임워크와 관련된 여러 메소드를 가지고있다
        // 일부 알고리즘도 구현해놓았다
     	// static 메소드로 구현했기 때문에 객체를 만들 필요가 없다
       	//list sort 하고출력
       	Collections.sort(list);
       	System.out.println(list);
       	
     	//list 순서바꾸고 출력
       	Collections.reverse(list);
       	System.out.println(list);
       	
        int index=1;
       	while(index < 19) {
       
            System.out.println(index);
            System.out.println(list.get(index));
    	    index += 1;       
       
	    }   
    }
}


