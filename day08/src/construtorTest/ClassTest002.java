package construtorTest;

class C{
	//필드
	int num;
	
	//생성자
	public C() {
		super();
	}
	
	public C(int num) {
		super();
		this.num = num;
	}
	

	//메소드
	void printNum(int num) {
		System.out.println("매개변수 num : "+ num);
		System.out.println("필드 num : "+ this.num);
		System.out.println("참조값 : "+ this);
	}

}
public class ClassTest002 {
	public static void main(String[] args) {
		C c1=new C();
		System.out.println(c1);
		c1.printNum(10);
		System.out.println(c1.num);
		
		C c2= new  C();
		c2.num=100;
		c2.printNum(5);
		System.out.println(c2);
		
	}

}
