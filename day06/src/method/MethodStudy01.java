package method;

public class MethodStudy01 {
	
	 public int addTen(int num) {
     	 System.out.println(" mt.addTen(30)수행"); 
		return  num + 10;
	}
	
	public static void main(String[] args) {
		
		MethodStudy01 mt= new MethodStudy01();
		System.out.println(" mt.addTen(30)결과는");
		System.out.println(mt.addTen(30));
	}
}
