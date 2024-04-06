package employee;

import java.util.HashMap;

public class EmployeeMain {
	public static void main(String[] args) {
//		1. 회사의 사원들의 정보를 HashMap에 저장한다
//		HashMap의 Key는 사원의 ID(String)
//		Value는 이름, 나이, 부서로 설정
//		조건1. 새로운 사원정보를 추가
//		001, 짱구, 5, "영업부"
//		002, 철수, 5, "개발부"
//		003, 유리, 5, "사업부"
//		조건2. 특정 ID의 사원 정보를 조회
//		조건3. 모든 사원의 정보를 출력
//		entrySet 메소드사용
//		조건4. 특정 ID의 사원 정보를 삭제
//		조건5. 모든 사원 정보를 삭제
//		clear 메소드 사용
		
		//1. 회사의 사원들의 정보를 HashMap에 저장한다
		//  Emp 객체생성
		 Employee emp;
		 emp=new Employee("짱구",5,"영업부");
		 emp=new Employee("짱구",5,"영업부");
		 emp=new Employee("짱구",5,"영업부");
		 
		 HashMap<String, String> name = new HashMap<>();
		 name.put("001", "짱구");
		 name.put("002", "철수");
		 name.put("003", "유리");
		// System.out.println(name); 
		 
		// age해쉬맵에 나이저장 
		 HashMap<String, Integer> age = new HashMap<>();
		 age.put("001", 5);
		 age.put("002", 5);
		 age.put("003", 5);
		 //System.out.println(age);  
		 
		// dept해쉬맵에 부서저장 
		 HashMap<String, String> dept = new HashMap<>();
		 dept.put("001", "영업부");
		 dept.put("002", "개발부");
		 dept.put("003", "사업부"); 
		  
        //	조건2. 특정 ID의 사원 정보를 조회
		 System.out.println("====특정 ID의 사원 정보를 조회===");
		 String employeeId;
		 employeeId="001";
		 
		 //get(employeeId)이용해서 이름,나이,부서를 가져다 출력한다
		 System.out.println(employeeId+", "+name.get(employeeId)+", "
		 	+ ""+age.get(employeeId)+", "+dept.get(employeeId));

		//	조건3. 모든 사원의 정보를 출력
		//for each 를 이용해서 이름,나이,부서를 가져다 출력한다
		//id는 keySet()메소드를 이용
		 System.out.println("====모든 사원의 정보를 출력===");    
		 for (String id : name.keySet()) {
			 System.out.println(id+", "+name.get(id)+","
			 		+ " "+age.get(id)+", "+dept.get(id));
		 }	 
	    //  name.clear();
		//조건4. 특정 ID의 사원 정보를 삭제
		//remove 메소드사용
	    System.out.println("====특정 ID의 사원 정보를 삭제===");  
	    name.remove("001");
	    System.out.println(name.entrySet());
	    
	    //조건5. 모든 사원 정보를 삭제
        //clear 메소드 사용
	    System.out.println("====모든 사원 정보를 삭제===");
	    name.clear();
	    System.out.println(name.entrySet());
	}
}



