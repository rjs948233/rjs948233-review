package test;

import java.util.Scanner;

public class TEST4 {

	public static void main(String[] args) {
//		// TODO Auto-generated method 사용자로부터 두 개의 정수를 입력받아,
//		두 수가 같은지 다른지를 판별하여 출력하세요.(삼항연산자, 조건문 각각 사용하기)
//
//사용자로부터 두 개의 정수를 입력받아, 두 수가 모두 양수인지 아닌지를 판별하여 출력하세요.
//
//사용자로부터 세 개의 정수를 입력받아, 세 수가 모두 짝수인지를 판별하여 출력하세요.
//
//사용자로부터 영어 소문자 알파벳을 입력받아 해당 알파벳이 모음(a, i, o, u, e)인지 자음인지 판별하여 출력하세요.

     int num1=0,num2=0;
   
     Scanner sc=new Scanner(System.in);
     System.out.println("정수1입력:");
     num1 = sc.nextInt();
     System.out.println("정수2입력:");
     num2 = sc.nextInt();
     
     if(num1==num2) {
    	 System.out.printf("두개의정수가 같습니다 정수1= %d 정수2= %d",num1,num2);
     }else {
    	 System.out.printf("두개의정수가 다릅니다 정수1= %d 정수2= %d",num1,num2);

	}
         
     String res1;
		
	 res1 = num1==num2 ? "두개의정수가 같습니다" :  "두개의정수가 같습니다" ;
	 System.out.printf(res1);
	}
	
}
