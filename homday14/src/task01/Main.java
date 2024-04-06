package task01;

public class Main {

	public static void main(String[] args) {
		//Main 클래스
		//Burger, Pizza, Salad 클래스의 인스턴스 생성
		//각 음식의 속성을 설정
		//display() 메서드를 호출하여 각 음식의 정보를 출력
		//calculatePrice() 메서드를 호출하여 각 음식의 가격 출력
		
		Burger burger = new Burger("Burger",10000);
		burger.display();
		System.out.println(burger.getFoodName());
		System.out.println(burger.calculatePrice());
	
		Pizza  pizza = new Pizza("Pizza",50000);
		pizza.display();
		System.out.println(pizza.getFoodName());
		System.out.println(pizza.calculatePrice());
		
		Salad salad = new Salad("Salad",30000);
		salad.display();
		System.out.println(salad.getFoodName());
		System.out.println(salad.calculatePrice());
		
		

	}

}
