package task;

import java.util.Scanner;

public class BasicTv002Main {
	public static void main(String[] args) {
		 String msg = "1. 전원 버튼\n"
				   + "2. 채널 올리기\n"
				   + "3. 채널 내리기\n"
				   + "0. 프로그램 종료";
		 
		BasicTv002 bt2= new BasicTv002("black",16,10000);
		
		Scanner sc=new Scanner(System.in);
		while(true) {
			System.out.println(msg);
			int choice = sc.nextInt();
			switch(choice) {
			case 1:
				bt2.powerOnOff();
				break;
			case 2:
				if(bt2.power) {
					System.out.println("현재채널  : "+bt2.channel);
					System.out.println("채널이 변경되었습니다 현재채널은  : "+bt2.channelUp());
				}else {
					System.out.println("tv전원을 켜주세요");
				}
				break;
			case 3:
				if(bt2.power) {
					System.out.println("현재채널  : "+bt2.channel);
					System.out.println("채널이 변경되었습니다 현재채널은  : "+bt2.channelDown());
				}else {
					System.out.println("tv전원을 켜주세요");
				}
				break;
			case 0:
				System.out.println("프로그램을 종료합니다");
				sc.close();
				System.exit(0);
				break;
			default:
				System.out.println("다시 입력하세요");
				break;
			}//switch
		}//while
	}
}
