package list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class ArrayListTask {
	public static void main(String[] args) {
		// 1부터 20까지의 난수를 만들어서 ArrayList에 5개만 저장한다
		// nextInt(20) -> 0부터 19까지의 값
		// nextInt(20) + 1 -> 1부터 20까지의 값

		// 1. 중복되는 값은 없다
		// 2. 정렬한다

		// 1) 랜덤객체 생성
		// 2) ArrayList 객체 생성
		// 3) 정수형 변수 선언
		// 4) 반복문(for문){
		// 5) 정수형 변수 = 랜덤객체.nextInt(20) + 1
		// 6) 조건문(!list.contains(변수)){
		// 7) list.add(변수)
		// 8) continue;
		// 9) 변수--;

		Random r = new Random();
		ArrayList<Integer> list = new ArrayList<>();
		int tmp = 0;
		for (int i = 0; i < 5; i++) {
			tmp = r.nextInt(20) + 1;
//			System.out.println(i);
			if (!list.contains(tmp)) {
				list.add(tmp);
				continue;
			}
			i--;
		}
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);

//		while (list.size() < 5) {
//			int num = r.nextInt(20) + 1;
//			if (!list.contains(num)) {
//				list.add(num);
//			}
//		}
//
//		Collections.sort(list);
//		System.out.println(list);

	}
}
