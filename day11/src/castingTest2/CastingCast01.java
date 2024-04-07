package castingTest2;

public class CastingCast01 {
	static void printWalk(Person01 person01 ) {
		if( person01 instanceof Student01 ) {
			((Student01)person01).walk();
		}else if( person01 instanceof Employee01) {
			((Employee01)person01).walk();
		}else {
			System.out.println("걷기싫어");
		}
		
	}
	
	
	
	public static void main(String[] args) {
		// 객체화 작업
		Person01 p1=new Person01("짱구",5,"유치원생");
		Student01 p2=new Student01("김영선",20,"대학생","코리아학교");
		Employee01 p3=new Employee01("홍길동",40,"개발자","코리하회사");
		
		//메소드
		 p1.eat();
		 p2.eat();
		 p3.eat();
		 
		 System.out.println(p2);
			
			printWalk(p1);
			printWalk(p2);
			printWalk(p3);
		  
	}
}