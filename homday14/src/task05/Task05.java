package task05;

import java.util.Scanner;

public class Task05 {

	public static void main(String[] args) {
//		학생 점수 관리 프로그램
//		사용자로부터 5명의 학생이름과 점수를 입력받고, 학생의 점수를 wrapper 클래스의 객체로 저장한다
//		최고 점수를 가진 학생의 이름과 점수를 출력한다.
//		평균점수를 계산하여 출력한다.

		//스캐너로 점수를 입력받는다 
		//입력된 점수를  wrapper  클래스객체체 저장한다
	
		    String name;
		    int score;
		    Object[] ar = new Object[5];
			Scanner sc=new Scanner(System.in);
			for(int i=0;i<5;i++) {
				System.out.println("학생이름:");
				name=sc.next();
				
				System.out.println("학생점수:");
				score = sc.nextInt();
				ar[i] = new Object[] { name, score };
			}//for
			
			for(int i=0;i<5;i++) {
				System.out.println(ar[i]);
//				score = sc.nextInt();
//				ar[i] = new Object[] { name, score };
			}//for
		}//main
	}//class


