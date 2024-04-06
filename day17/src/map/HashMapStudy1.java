package map;

import java.util.HashMap;

public class HashMapStudy1 {
	public static void main(String[] args) {
		//HashMap은 해싱을통해 key의 중복여부 판단
		//HashMap은 Map인터페이스를 상속했으므로 키의 중복은허용하지 않음
		//만약에 중복된키가들어오면 기존의 데이터 업에이트
		
		HashMap<String, Integer>  map=new HashMap<>();
		
		//HashMap에 데이터 추가
		//map.put(null, null) 메소드 사용
		
		//HashMap<String, Integer> 이렇게 선언외어서 
		//키 자료형인 스트링돠 인티저앤 1를 매개변수에 입력
		
		System.out.println(map.put("A",1));
		System.out.println(map.put("B",2));
		System.out.println(map.put("C",3));
		System.out.println(map.put("D",4));
		
		System.out.println();
		
	}
	
}
