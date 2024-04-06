package methodOverloding;


public class ValueTest2 {
	public static void main(String[] args) {
		valueTest vt= new valueTest();
		System.out.println(vt);
	
		int num =1;
		int[] arr= {10};
		//변수 자체를 보냄(call by value)
		vt.add_value(num);
		System.out.println(num); 
	
		//베열 자체를 보냄(call by reference)
		System.out.println(arr[0]);
		vt.add_reference(arr);
		System.out.println(arr[0]);
		
}

  void add_value(int num) {
	  num += 100;
	  System.out.println(num);
  }
  	
  void add_reference(int[] arNum) {
	  arNum[0]  += 100;
	  System.out.println(arNum[0]);
  }
}
