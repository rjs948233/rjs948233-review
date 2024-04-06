package classTest;

public class Student1Main {
	public static void main(String[] args) {
		Student st= new Student();
		st.eng=80;
		st.math=70;
		st.kor=90;
		System.out.println(st.getTotal());
		System.out.println(st.getAvg());
	}
}
