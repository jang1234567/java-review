package staticTest;

public class AClass {//클래스 시작
	//필드
	int iVar;	//정수형 변수 iVar 선언
	static int sVar;	// 스태틱인 정수형 변수 sVar 선언
	
	//메소드
	void iMethod1() {//인스턴스 메소드 => 인스턴스 변수, 스태틱 변수 모두 사용가능
		iVar = 10;
		sVar = 20;
		System.out.println(iVar);
		System.out.println(sVar);
		iMethod2();
		sMethod1();
	}
	
	void iMethod2() {
		System.out.println("인스턴스 메소드2 실행");
	}
	
	//클래스메소드(스태틱메소드)는 static 이 붙은 멤버만 사용가능하다
	static void sMethod1() {
//		iVar = 100; 불가능 => static메소드이기 때문에 인스턴스 변수는 사용불가
		sVar = 200;	//스태틱 변수에 200대입
		System.out.println(sVar);//스태틱 변수 출력
//		iMethod1(); //불가능	=> 본 메소드가 스태틱메소드이기떄문에 인스턴스 메소드는 사용불가
		sMethod2();	//스태틱 메소드 2 호출
	}
	static void sMethod2() {
		System.out.println("스태틱 메소드2 실행");
	}
	public static void main(String[] args) {	//메인메소드 시작
		AClass a = new AClass();	//객체생성
		//어떤동작이 호출되는지 확인해보기
		a.iMethod1();
		a.sMethod1();
	}//메인메소드 종료
}//클래스 종료















