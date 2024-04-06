package task01;

public class Burger extends Food{
	 String name;
	 int price;
	 
	public Burger(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}

	@Override
	int calculatePrice() {
		// TODO Auto-generated method stub
		return 15000;
	}

	@Override
	String getFoodName() {
		// TODO Auto-generated method stub
		return "Burger";
	}

	@Override
	void display() {
		System.out.println("주문한 음식: "+name+"], 가격: [ " +price+" ]" ) ;
	}

	
}
