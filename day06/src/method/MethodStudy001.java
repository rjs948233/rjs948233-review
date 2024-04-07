package method;

public class MethodStudy001 {
	 //메소드 정의
	//1) 매개변수 x, 리턴값 x 메소드 정의
	// 이름을 출력하는 기능
	void printName() {
		System.out.println("1) 매개변수 x, 리턴값 x 메소드 정의");
		System.out.println("이름 : 류정식");
	}
	
	//2) 매개변수 o, 리턴값 x 메소드 정의
		// 정수 1개를 받아서 출력하는 기능
	void printNum(int num) {
		System.out.println("2) 매개변수 o, 리턴값 x 메소드 정의");
		System.out.println("정수 1개를 받아서 출력하는 기능의");
		System.out.println("num = "+num);
		
	}
	//3) 매개변수 x, 리턴값 o 메소드 정의
	// 이름을 반환하는 기능
	String getName() {
		System.out.println("3) 매개변수 x, 리턴값 o 메소드 정의");
		System.out.println("이름을 반환하는 기능");
		return "류정식";
	}
	
	//4) 매개변수 o, 리턴값 o 
	// 전달받은 정수를 x2한 값을 반환하는 메소드
	int twoNum(int num) {
		System.out.println("4) 매개변수 o, 리턴값 o");
		System.out.println("전달받은 정수를 x2한 값을 반환하는 메소드");
		return num*2;
	}
	public static void main(String[] args) {
		MethodStudy001 mst001=new MethodStudy001();
		
		mst001.printName();
		mst001.printNum(100);
		System.out.println(mst001.getName());
		System.out.println(mst001.twoNum(20));
		
	}
}
