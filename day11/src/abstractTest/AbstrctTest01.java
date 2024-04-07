package abstractTest;

public class AbstrctTest01 {
	public static void main(String[] args) {
		ClassA01 a01=new ClassB01();
		ClassB01 b01=new ClassB01();
		
		System.out.println(a01);
		System.out.println(b01);
		
		a01.method1();
		a01.method2();
		b01.method1();
		b01.method2();
	}
}
