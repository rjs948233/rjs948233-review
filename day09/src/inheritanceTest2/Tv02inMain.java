package inheritanceTest2;

public class Tv02inMain {
	public static void main(String[] args) {
		Tv01in t01=new Tv01in();
		Tv02in t02in = new Tv02in();
		SmartTv02 st02=new  SmartTv02();
		
		System.out.println(t01);
	
		System.out.println(t02in);
		
		t01.chUp();
		t02in.volUp();
		t02in.volUp();
		
		st02.netflix();

	}
	
	
}
