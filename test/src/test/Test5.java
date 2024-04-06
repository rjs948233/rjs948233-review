package test;

import java.util.Scanner;

public class Test5 {

	public static void main(String[] args) {
		//사용자로부터 두 개의 정수를 입력받아, 두 수가 모두 양수인지 아닌지를 판별하여 출력하세요.
		 int num1=0,num2=0;
	     String res;
	     Scanner sc=new Scanner(System.in);
	     System.out.println("정수1입력:");
	     num1 = sc.nextInt();
	     System.out.println("정수2입력:");
	     num2 = sc.nextInt();
	     if (num1 > 0) {
	    	 System.out.printf("num1은 양수 입니다 num1= %d",num1);
	     }else {
	    	 System.out.printf("num1은 홀수 입니다 num1=%d",num1);
	     }
	     if (num2 > 0) {
	    	 System.out.printf("num2는 양수 입니다 num2= %d",num2);
	     }else {
	    	 System.out.printf("num2는 홀수 입니다 num2= %d",num2);
	     }
	     System.out.println("종료되었습니다!!!");
	}

}
