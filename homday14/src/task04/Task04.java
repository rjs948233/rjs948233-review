package task04;

import task03.MyException;

public class Task04 {

     //사용자로부터 숫자를 입력받아, 입력받은 숫자가 3의 배수인 경우 "Fizz", 
	 //5의 배수인 경우 "Buzz", 
	 //3과 5의 공배수인 경우 "FizzBuzz",
	 //그 외의 경우에는 입력받은 숫자를 출력하는 프로그램을 작성하세요. 
	 //사용자가 문자열을 입력할 경우,
	 //"숫자가 아닌 문자열이 입력되었습니다"라는 예외 메시지를 출력하세요.

		//필드  
		
	    int number;
		String msg;
		//매개변수로 number
		//정수인지 체크 Integer.valueOf(number)!= null
		//정수이면  if문으로 3과5의공배수 여부확인
		// 아니며 3의배수확인
		//아니면 5의배수확인
		//아니면 숫자 출력
		//숫자가 아니면  exception 발생
		
		void trans(int  number) throws Ts04Exception{
			  //입력값이 정수아니면 실수 인지 체크 
			  if( Integer.valueOf(number) != null )
				  {
				    //3과 5의 공배수
				  	if((number % 3==0)&&(number % 5==0)) {
				  		System.out.println(number+"는 3과 5의 공배수 입니다. 결과는 FizzBuzz"); 
				  	//	3의 배수	
				  	}else if(number % 3==0) {
				  		System.out.println(number+"는 3의 배수 입니다. 결과는 Fizz");
				  	// 5의 배수	
				  	}else if(number % 5==0) {
				  		System.out.println(number+"는 5의 배수 입니다. 결과는 Buzz");
				  	}else{
				  		System.out.println(number+"는 3또는 5의 배수가 아닙니다");
				  	}
				  }else {
					  throw new Ts04Exception("숫자가 아닌 문자열이 입력되었습니다");
				  }
            	}//trans 메소드
}//클래스

