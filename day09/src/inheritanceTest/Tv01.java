package inheritanceTest;

public class Tv01 {
	//필드
	int ch;
	int vol;
	boolean power;
	
	//생성자
	
	//메소드
    //채널
	void chUp() {
		System.out.println("현재 채널 : "+ch);
		System.out.println("채널을 올립니다 : "+ ++ch);
	}
	void chDown() {
		System.out.println("현재 채널 : "+ch);
		System.out.println("채널을 내립니다 : "+ ++ch);
	}
	
	//볼륨
	void volUp(){
		System.out.println("현재 볼륨 : "+ vol);
		System.out.println("볼륨을 올립니다 : "+ ++vol);
		
	}
	void volDown(){
		System.out.println("현재 볼륨 : "+ vol);
		System.out.println("볼륨을 내립니다 : "+ ++vol);
		
	}
	//전원
	void powerOff() {
		if(!power) {
			System.out.println("Tv를 켰습니다");
		}else {
			System.out.println("Tv를 껐습니다");
		}
	}
}
