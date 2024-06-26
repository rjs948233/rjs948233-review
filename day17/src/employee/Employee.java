package employee;

public class Employee {
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
	String Department;
	//생성자
	
	//메소드 게터\
	public String getName() {
		return name;
	}
	public Employee(String name, int age, String department) {
		super();
		this.name = name;
		this.age = age;
		Department = department;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getDepartment() {
		return Department;
	}
	public void setDepartment(String department) {
		Department = department;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
