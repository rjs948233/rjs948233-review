package day12Review01;

public class Review {
	 void moveSpeed(Vehicle vehicle,int speed) {
		vehicle.move();
		vehicle.setSpeed(speed);
	    System.out.println(vehicle.getClass().getSimpleName()+vehicle.getSpeed()); 
	}
	public static void main(String[] args) {
		Review r=new Review();
		r.moveSpeed(new Car(),10);
		r.moveSpeed(new Motorcycle(),200);

	}

}
