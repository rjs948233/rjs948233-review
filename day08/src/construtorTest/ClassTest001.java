package construtorTest;

class A01{
	//메소드 매개변수x, 리턴값x
	void method() {
		System.out.println(this);
	}
}

public class ClassTest001 {
	public static void main(String[] args) {
		A01 a=new A01();
		System.out.println(a);
		a.method();
		A01 a1=new A01();
		System.out.println(a1);
		a1.method();
	}
}
