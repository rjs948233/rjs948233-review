package day12Review01;

public class Car extends Vehicle{
	private int speed;
	
	@Override
	void move() {
		System.out.println("Car가 이동합니다");
		
	}

	@Override
	void setSpeed(int speed) {
		this.speed = speed;
		System.out.println("스피드는 :"+this.speed);
		
	}

	@Override
	int getSpeed() {
		return this.speed;
	}
	

}