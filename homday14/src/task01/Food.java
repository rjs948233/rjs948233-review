package task01;

public abstract class Food {
		//추상클래스의 멤버 : 추상메소드, 일반메소드, 필드, 생성자
		//음식의 가격을 계산하여 반환
		abstract int calculatePrice();
		
		//추상클래스에서 구현되지 않은 음식이름을 반환하는 메소드
		abstract String getFoodName();
		
		//일반 메서드
		//"주문한 음식: [음식 이름], 가격: [음식 가격]" 음식정보 출력
		void display() 	{
			System.out.println("주문한 음식: [음식 이름], 가격: [음식 가격]" ) ;
		}
		
	}
