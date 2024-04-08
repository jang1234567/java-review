package tvTest;

public class TvMain {//TvMain 클래스 시작
	public static void main(String[] args) {//메인메소드 시작
		//Tv 객체
		Tv samsungTv = new Tv();// 클래스명 객체명 대입연산자 기본생성자
		System.out.println(samsungTv); //객체의 주소값 출력
		
		System.out.println(samsungTv.ch);//객체의 정수형 변수 ch값 출력
		System.out.println(samsungTv.power);//객체의 정수형 변수 power값 출력
		samsungTv.ch = 10; //객체의 ch값 10 대입
		samsungTv.vol = 15;//객체의 vol값 15 대입
		samsungTv.powerOnOff();//객체의  powerOnOff 메소드 호출
		samsungTv.chUp();//객체의 메소드  chUp 호출
		//객체에 값을 저장하는 방법이 불편하다. 이럴 때 생성자를 이용한다.
	}//메인메소드 종료
}//TvMain클래스 종료
