package castingTest2;

public class Student01 extends Person01 {
	//필드
	String schoolName;

	//생성자
	/**
	 * @param name
	 * @param age
	 * @param job
	 * @param schoolName
	 */
	public Student01(String name, int age, String job, String schoolName) {
		super(name, age, job);
		this.schoolName = schoolName;
	}

	//메소드
	@Override
	void eat() {
		System.out.println(this.name+"은/는  "+this.schoolName+"에서 밥을 먹는다" );
	}
	void walk() {
		System.out.println(this.name+"은/는  "+this.schoolName+"로 등교 한다" );
	}

	

	

}
