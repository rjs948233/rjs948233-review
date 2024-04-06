package method;

public class MethodTest03 {

	int addTen(int num) {
		int result = num+10;
		return result;
	}
	
	int addFive(int num1) {
		int result1 = num1+5;
		return result1;
	}
	public static void main(String[] args) {
		MethodTest03 mt=new MethodTest03();
		int res=mt.addTen(10);
		System.out.println(res);
		
		int res1=mt.addFive(20);
		System.out.println(res1);


	}
}

