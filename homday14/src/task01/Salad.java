package task01;

public class Salad extends Food {
	String name;
	int price;
	
	public Salad(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}

	@Override
	int calculatePrice() {
		// TODO Auto-generated method stub
		return 30000;
	}

	@Override
	String getFoodName() {
		// TODO Auto-generated method stub
		return "Salad";
	}
	    
	@Override
	void display() {
		// TODO Auto-generated method stub
		System.out.println("주문한 음식: "+name+"], 가격: [ " +price+" ]" ) ;
	}
}
