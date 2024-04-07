package castingTest2;

public class Employee01 extends Person01{

	//필드
	String workSpace;

	
	//생성자
	
	/**
	 * @param name
	 * @param age
	 * @param job
	 * @param workSpace
	 */
	public Employee01(String name, int age, String job, String workSpace) {
		super(name, age, job);
		this.workSpace = workSpace;
	}


	//메소드
	@Override
	void eat() {
		System.out.println(this.name+"은/는  "+this.workSpace+"에서 밥을 먹는다" );
	}
	void walk() {
		System.out.println(this.name+"은/는  "+this.workSpace+"로 출근을 한다" );
	}
    
}
