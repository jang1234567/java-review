package tvTest;

public class Tv {//Tv 클래스 시작
	//필드 
	//tv 채널, 볼륨, 전원, 가격, 색상
	int ch; //정수형 변수 ch선언
	int vol;//정수형 변수 vol선언
	boolean power;//논리형 변수 power선언
	int price;//정수형 변수 price선언
	String color;//문자열 변수 color선언
	
	//메소드
	void powerOnOff() {//리턴타입 없고 메소드명 powerOnOff선언, 매개변수 없음
		if(!power) {//if 조건문 시작 , 만약 논리형 변수 power가 부정이라면 => true
			System.out.println("tv 전원을 킵니다");
		}//if문 종료
		else {//power라면
			System.out.println("tv 전원을 끕니다");
		}//else 종료
	}//구현부 종료
	
	void chUp() {//리턴타입 없고 메소드명 chUp선언, 매개변수 없음
		if(!power) {//if 조건문 시작 , 만약 논리형 변수 power가 부정이라면 => true
			System.out.println("현재 채널 : " + ch);
			ch++; //증감연산자를 이용해 정수형 변수 ch1씩 증가
			System.out.println("채널을 1 올립니다. 현재채널 : " + ch);
		}//if 문 종료
		else {//power라면 => fasle라면
			System.out.println("tv 전원을 먼저 켜야합니다");
		}//else문 종료
	}//구현부 종료
}//Tv클래스 종료





