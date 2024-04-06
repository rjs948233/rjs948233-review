package classTest;

public class Student1 {
	//필드
	int math;
	int eng;
	int kor;
	double avg;
	char grade;
	
	//메소드
	int getTotal() {
		return math+eng+kor;
	}

	double getAvg() {
		return getTotal() /3.0;
	}
}
