package task03;

public class ExceptMain {
	public static void main(String[] args) {
		Excep01 ex1 = new Excep01();
		
		//try~catch : alt + shift + z 단축키
		try {
			ex1.trans("1234"); //숫자
		} catch (MyException e) {
			System.out.println(e.getMessage());
		}	
	}
}
