package api;

import java.util.Random;

public class ApiTest1 {
	public static void main(String[] args) {

		// 내부 API
		// Random 클래스
		Random random = new Random();

		// nextInt(n) : n미만의 랜덤정수를 반환
//		int num = random.nextInt();
//		System.out.println(num);
		int num2 = random.nextInt(3);
		System.out.println(num2);

		// Math 클래스
		// ceil() 올림
		System.out.println(Math.ceil(9.1));

		// floor() 내림
		System.out.println(Math.floor(13.35));

		// round() 소수점 첫째자리에서 반올림
		System.out.println(Math.round(15.3));

	}
}
