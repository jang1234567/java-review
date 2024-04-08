package tvTest;

public class TvMain2 {//TvMain 클래스 시작
	public static void main(String[] args) {//메인메소드 시작
//		Tv2 sTv1 = new Tv2(); //기본생성자가 존재하지 않아 오류 발생
		Tv2 sTv = new Tv2(10, 10, true, "black");
//		클래스명 객체명 대입연산자 생성자
		System.out.println(sTv.ch);//객체의 ch값 출력
		System.out.println(sTv.power);//객체의 power값 출력
		System.out.println(sTv.vol);//객체의 vol값 출력
		System.out.println(sTv.color);//객체의 color값 출력
		//생성자를 사용하면 객체를 만듦과 동시에 내가 원하는 값으로 초기화 할 수 있다
	}//메인메소드 종료
}//TvMain클래스 종료
