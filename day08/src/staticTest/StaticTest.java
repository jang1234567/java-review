package staticTest;

public class StaticTest {//클래스 시작
	public static void main(String[] args) {//메인메소드 시작
		StaticTest st = new StaticTest(); //객체 생성
//		System.out.println(st);
		
		st.iMethod1();	//객체 st의 imethod1 호출
		st.sMethod1(); //실행가능하지만 권장하지 않음

		sMethod1(); //스태틱 메소드는 프로그램 시작과 동시에 메모리에 저장되기 때문에 객체선언 없이 사용가능
	}
	
	void iMethod1() {
		System.out.println("인스턴스 메소드1 실행");
		iMethod2(); //메소드 호출 o
		sMethod1();
	}
	
	void iMethod2() {
		System.out.println("인스턴스 메소드2 실행");
		sMethod2();
	}
	
	static void sMethod1() {
		System.out.println("스태틱 메소드1 실행");
//		iMethod1(); 실행불가능 => 스태틱 메소드는 인스턴스 메소드 호출 불가
	}
	
	static void sMethod2() {
		System.out.println("스태틱 메소드2 실행");
//		iMethod2(); 실행불가능 => 스태틱 메소드는 인스턴스 메소드 호출 불가
		sMethod1();
	}
}
