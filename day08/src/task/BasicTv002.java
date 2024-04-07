package task;

public class BasicTv002 {
	//필드
	String color;
	int inch;
	int price;
	boolean power;
	int channel = 1;
	
	//생성자
	public BasicTv002(String color, int inch, int price) {
		super();
		this.color = color;
		this.inch = inch;
		this.price = price;
	}

	public BasicTv002(String color, int inch, int price, int channel) {
		super();
		this.color = color;
		this.inch = inch;
		this.price = price;
		this.channel = channel;
	}
	
	//메소드
	//전원 켜는 메소드 powerOnOff() 매개변수 x, 리턴값 x
	void powerOnOff() {
		power = !power;
		
		if(power) {
			System.out.println("tv 전원이 켜졌습니다");
		}else {
			System.out.println("tv 전원이 껴졌습니다");
		}
	}//powerOnOff()
	
	//채널올리는 메소드 channelUp() 매개변수 x, 리턴값 o
	int channelUp() {
		return channel++;
	}
	
	//채널내리는 메소드 channelDown() 매개변수 x, 리턴값 o
	int channelDown() {
		return channel--;
	}
 }
