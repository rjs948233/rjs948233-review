package lotto;
import java.util.*;
public class LottoMain {
  public static void main(String[] args) {
	   //로또 번호 생성 프로그램
	   //필드
	   int number;
	   int count = 0;
      int whileCount = 0;
	  
	  
      //1. 1~45까지의 숫자 중 6개의 서로 다른 숫자를 무작위로 선택하여 로또 번호 생성한다
      // HashSet<Integer>
	   HashSet<Integer> lotto = new HashSet<>();
	   //3. 사용자로부터 몇회차의 로또번호를 생성할지 입력받고 각 회차별로 생성된
	   //   로또번호를 출력한다
	   // 입력클래스, 입력메소드 nextInt(), 출력메시지
	  
	   // Random -> nextInt(45) + 1
	   //스캐너로 횟수를 입력받는다
      Random random = new Random();
      Scanner sc=new Scanner(System.in);
      System.out.println("횟수를 입력하세요");
     
      whileCount=sc.nextInt();
      //while 문으로 반복한다
      while(count < whileCount ) {   	 
         
   	   count++;
   	      	  
   	   for (int i=0;i<6;i++) {
   		   number= random.nextInt(45)+1;
   		   	  
   		   lotto.add(number);
   	   }
         
   	   //2. 출력될 때 오름차순으로 정렬하여 출력한다
   	   // Collections sort()
   	   ArrayList<Integer> result = new ArrayList<>(lotto);
   	   //소트한다
   	   Collections.sort(result);
   	   //출력한다
   	   System.out.println(result);
   	   //클리어한다
   	   for (int i=0;i<6;i++) {
   		   lotto.clear();
   	   }
   	     
      }
    
    
    
     //출력예시
//      로또 번호는 [1, 2, 3, 4, 5, 6] 입니다
  }
}
