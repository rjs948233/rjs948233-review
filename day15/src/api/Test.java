package api;

public class Test {
	public static void main(String[] args) {
		ApiTest2 at = new ApiTest2();
		System.out.println(at);
		
		//alt + shift + z : try~catch문 단축
		try {
			at.div(10, 0);
		} catch (ArithmeticException e) {
			// TODO Auto-generated catch block
//			e.printStackTrace();
//			System.out.println(e.toString());
			System.out.println("0으로 나눌수없습니다");
		}
		
		System.out.println("출력끝");
		
	}
}
