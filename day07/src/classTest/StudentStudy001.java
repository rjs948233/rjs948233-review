package classTest;

public class StudentStudy001 {
	//필드
	String name;
	int math;
	int eng;
	int kor;
	double avg;
	char grade;
	
	//생성자
	public StudentStudy001() {
		super();
	}

	public StudentStudy001(String name, int math, int eng, int kor) {
		super();
		this.name = name;
		this.math = math;
		this.eng = eng;
		this.kor = kor;
	}
	//메소드
	//메소드
	//학생의 총합을 구하는 기능을 가진 메소드
	int getTotal() {
		int total;
		total = math+eng+kor;
		return total;
	}
	
	//평균을 구하는 기능을 가진 메소드
	//매개변수 x, 리턴값 o
	double getAvg() {
		double average;
		average = (double)getTotal()/3;
		return average;
	}
}
