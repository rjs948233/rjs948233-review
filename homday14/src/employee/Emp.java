package employee;

public class Emp {
//	1. 회사의 사원들의 정보를 HashMap에 저장한다
//	HashMap의 Key는 사원의 ID(String)
//	Value는 이름, 나이, 부서로 설정
//	조건1. 새로운 사원정보를 추가
//	001, 짱구, 5, "영업부"
//	002, 철수, 5, "개발부"
//	003, 유리, 5, "사업부"
//	조건2. 특정 ID의 사원 정보를 조회
//	조건3. 모든 사원의 정보를 출력
//	entrySet 메소드사용
//	조건4. 특정 ID의 사원 정보를 삭제
//	조건5. 모든 사원 정보를 삭제
//	clear 메소드 사용
	//필드
	String name;
	int age;
	String dept;
	
	//생성자
	public Emp() {
		super();
	}
	
	public Emp(String name, int age, String dept) {
		super();
		this.name = name;
		this.age = age;
		this.dept = dept;
	}
	//메소드 게터\
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public String getDept() {
		return dept;
	}
}
