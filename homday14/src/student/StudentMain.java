package student;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class StudentMain {

	public static void main(String[] args) {
		//컬렉션 프레임워크 이용(점수 저장)
		int count,total,score,score1,studentNum,maxScore=0,minScore=9999;
		double avg=0.0;
		
		//스캐너를 이용 값을 학생수를 입력받는다
		Scanner sc=new Scanner(System.in);
		System.out.print("학생수를 입력: ");
		studentNum = sc.nextInt();
		
		//HashMap를이용
		HashMap<Integer, Integer> data = new HashMap<>();
		//HashMap를이용
		count=0;
		
		//1. 사용자로부터 학생 수와 학생 점수 입력받기
		int	incount = 0;
		while(true) {
			System.out.print("점수를 입력: ");
			System.out.print("입력을 멈추려면 9999를 입력하세요 ");
			score=sc.nextInt();
			
		//입력값이 9999면 입력을 멈춘다
		  
			if(score==9999) {
				break;
			}else {	
				incount +=1;
				data.put(incount, score);
			
			}
		}
		
	    count = 1;
	    total=0;
	    //while loop를이용 total을구한다
	  	while(data.get(count)!=null ) {
           score1=data.get(count);
	       total += score1;
	       
	       //maxScore를 구한다
		  	if(maxScore <= score1) {
		  		maxScore = score1;
		  	}
		  	
		    //maxScore를 구한다
		  	if(minScore >= score1) {
		  		minScore = score1;
		  	}
			count +=1;
		  }
	  	
		  //2. 입력받은 점수를 이용해서 평균점수 계산하기  
		  System.out.println("평균점수 : "+ total/count);
   		  //3. 입력받은 점수 중 최고점수 계산하기
		  System.out.println("최고점수 : "+ maxScore);
		  //4. 입력받은 점수 중 최저점수 계산하기  
		  System.out.println("최저점수 : "+ minScore);
			}
		}


	


