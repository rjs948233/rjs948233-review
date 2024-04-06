package fileTest;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileTest2 {
	public static void main(String[] args) {

		// workspace 폴더에 test18.txt 파일을 생성하고
		// a
		// b
		// c라는 문자를 넣기

		// 1. File클래스 경로 생성
		// 2. FileOutputStream 객체 생성
		// 3. 객체명.write('a');
		// 4. 객체명.write('b');
		// -> 예외처리

		File f = new File("../test18.txt");
		try {
			FileOutputStream fos = new FileOutputStream(f);
			fos.write('a');
			fos.write('\n');
			fos.write('b');
			fos.write('\n');
			fos.write('c');
			fos.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
