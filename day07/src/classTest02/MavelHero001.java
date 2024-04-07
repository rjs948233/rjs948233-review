package classTest02;

public class MavelHero001 {
	//필드
	String name;
	String superpower;
	int age;
	//생성자
	public MavelHero001() {
		super();
	}
	public MavelHero001(String name, String superpower, int age) {
		super();
		this.name = name;
		this.superpower = superpower;
		this.age = age;
	}
		
	//메소드
	//히어로 정보 출력
    void heroInfo() {
    	System.out.println("이름 : "+name);
    	System.out.println("슈퍼파워 : "+superpower);
    	System.out.println("나이 : "+age);
    }
	
    //히어로 액션 메소드
    void performAction() {
    	System.out.println(name+"이 슈퍼파월를 사용합니다");
    }
}
