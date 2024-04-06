package classTest02;

public class MarvelHero1 {
	//필드
	String name;
	String superPower;
	int age;
	
	//생성자
	public MarvelHero1() {
		super();
	}

	
	public MarvelHero1(String name, String superPower, int age) {
		super();
		this.name = name;
		this.superPower = superPower;
		this.age = age;
	}


	//메소드
	void heroInfo() {
		System.out.println("마블 히어로 이름: "+name);
		System.out.println("슈퍼파워: "+ superPower);
		System.out.println("나이: "+age);
	}
	

	//히어로 액션 메소드
	void performAction() {
		System.out.println(name + "가 슈퍼파워를 사용합니다");
	}

}
