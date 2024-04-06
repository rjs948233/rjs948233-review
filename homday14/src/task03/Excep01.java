package task03;

public class Excep01 {
//	문자열을 입력받아, 입력받은 문자열을 정수로 변환하여 출력하는 프로그램을 작성하세요. 
//	만약 입력받은 문자열이 숫자가 아닐 경우, NumberFormatException 예외가 발생하게 되며
//	"숫자가 아닌 문자열이 입력되었습니다"라는 메시지를 출력할것

	//필드  
	String munja;
	
	//생성자  
	public Excep01() {
	super();
    }

	public Excep01(String munja) {
	super();
	this.munja = munja;
    }

	//메소드
    //	문자열을 입력받아, 입력받은 문자열을 정수로 변환하여 출력하는 프로그램을 작성하세요. 
    //	만약 입력받은 문자열이 숫자가 아닐 경우, NumberFormatException 예외가 발생하게 되며
    //	"숫자가 아닌 문자열이 입력되었습니다"라는 메시지를 출력할것
		void trans(String munja) throws MyException{
			 try {
				 Integer numInt2 = Integer.valueOf(munja);
				 System.out.println(numInt2);
			 }catch(NumberFormatException e) {
				 throw new MyException("숫자가 아닌 문자열이 입력되었습니다");
		     }
	}

}
