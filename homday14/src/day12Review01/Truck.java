package day12Review01;

public class Truck extends Vehicle{
	private int speed;
	@Override
	void move() {
		System.out.println("Truck이 이동합니다");
		
	}

	@Override
	void setSpeed(int speed) {
		this.speed = speed;
		
	}

	@Override
	int getSpeed() {
		return this.speed;
	}
	
}