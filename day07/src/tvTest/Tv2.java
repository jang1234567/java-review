package tvTest;

public class Tv2 {//Tv2 클래스 시작
	//필드
	int ch;	//정수형 변수 ch 선언
	int vol;	//정수형 변수 vol선언
	boolean power;	//논리형 변수 power선언
	String color;	//문자열 변수 color선언

	//생성자 => 초기값 선언
	public Tv2(int ch, int vol, boolean power, String color) {
//		접근제한자 클래스명 매개변수
		this.ch = ch; //선언하는 객체의 정수형 변수 ch에 매개변수로 받는 ch 대입
		this.vol = vol;//선언하는 객체의 정수형 변수 vol에 매개변수로 받는 vol 대입
		this.power = power;//선언하는 객체의 정수형 변수 power에 매개변수로 받는 power 대입
		this.color = color;//선언하는 객체의 정수형 변수 color에 매개변수로 받는 color 대입
	}//생성자 구현 종료
	
	//메소드
	void power() {//리턴타입 없고 메소드명 power 선언, 매개변수 없음
		if(power) {//만약 논리형 변수 power라면 => true(생성자에서 초기값 true 로 대입)
			System.out.println("tv 전원을 킵니다");
		}//if문 종료
		else { //아니라면
			System.out.println("tv 전원을 끕니다");
		}//else종료
	}//메소드 구현부 종료
}//Tv2클래스 종료








