package task01;

public class Pizza extends Food{
	String name;
	int price;
	
	public Pizza(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}

	@Override
	int calculatePrice() {
		// TODO Auto-generated method stub
		return 50000;
	}

	@Override
	String getFoodName() {
		// TODO Auto-generated method stub
		return "Pizza";
	}

	@Override
	void display() {
		System.out.println("주문한 음식: "+name+"], 가격: [ " +price+" ]" ) ;
	}

}
