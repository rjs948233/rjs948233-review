package classTest;

public class StudentStudy001Main {
	public static void main(String[] args) {
		StudentStudy001 st001=new StudentStudy001();
	    System.out.println(st001);
	    StudentStudy001 st002=new StudentStudy001();
	    System.out.println(st002);
	    
//	    st001.name = "류정식";
//	    st001.math = 90;
//	    st001.eng = 95;
//	    st001.kor = 96;
//	    public Student(String name, int math, int eng, int kor, double avg, char grade) {
	    
	    StudentStudy001 st003=new StudentStudy001("제임스",55,60,80);
	    System.out.println(st003.name);
	    System.out.println(st003.math);
	    System.out.println(st003.eng);
	    System.out.println(st003.kor);
	  
	    System.out.println(st003.getTotal());
	    System.out.println(st003.getAvg());
	    System.out.println(st003.toString());
	    
	    
	    st002.name = "김영선";
	    st002.math = 91;
	    st002.eng = 96;
	    st002.kor = 97;
	    
	    System.out.println(st002.name);
	    System.out.println(st002.math);
	    System.out.println(st002.eng);
	    System.out.println(st002.kor);
	    
	    System.out.println(st002.getTotal());
	    System.out.println(st002.getAvg());
	    st001.toString();
	    
	    StudentStudy001 st004=new StudentStudy001("소머즈",85,80,81);
	    System.out.println(st004.name);
	    System.out.println(st004.math);
	    System.out.println(st004.eng);
	    System.out.println(st004.kor);
	    
	    System.out.println(st004.getTotal());
	    System.out.println(st004.getAvg());
	    System.out.println(st004.toString());
	    
	    
 
   }
}
