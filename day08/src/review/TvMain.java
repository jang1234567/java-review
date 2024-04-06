package review;

public class TvMain {//TvMain 클래스 시작
	public static void main(String[] args) { //메인메소드 시작
		
		//객체화작업(인스턴스화)
		Tv sTv = new Tv();
		//클래스명 객체명 대입 연산자 기본생성자 호출
		System.out.println(sTv); //객체의 주소값 호출
		System.out.println(sTv.power);//객체의 논리형 변수 power 값 호출 => boolean타입의 기본값은 false
		sTv.power = true;// (sTv)객체의 power값에 true대입
		System.out.println(sTv.power);//객체의 논리형 변수 power 값 호출 => true
		System.out.println(sTv.ch);	//(sTv)객체의 정수형 변수 ch값 호출 => int 타입의 기본값은 0
		sTv.ch = 22;	//(sTv)객체의 ch값에 22대입
		System.out.println(sTv.ch);//(sTv)객체의 정수형 변수 ch값 호출 => 22
		//chUp() 매개변수 x, 리턴값 x => 객체명.메소드명();
		sTv.chUp();//(sTv)객체의 메소드 chUp()호출 => 현재 채널을 출력하고 채널 하나 올리는 메소드
		
		//sTv2 객체 매개변수 4개 있는 생성자로 만들기
		Tv sTv2 = new Tv(10, 15, true, "White");
		//클래스명 객체명 대입연산자 4개의값을 초기화하는 생성자 호출
		System.out.println(sTv2);//(sTv2)객체의 주소값 호출
		System.out.println(sTv2.ch);//(sTv2)객체의 정수형 변수 ch 호출 => 생성자에서 10으로 초기화해줌 
		
		
		
	}//메인메소드 종료
}//TvMain 클래스 종료











