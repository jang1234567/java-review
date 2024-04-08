package construtorTest;

class A { //A클래스 시작
	//메소드 매개변수x, 리턴값x
	void method() {
		System.out.println(this);//자기자신 객체의 주소값 출력
	}
}//A클래스 종료

public class ClassTest {//ClassTest클래스 시작
	public static void main(String[] args) {//메인메소드 시작
		A a = new A();
		//A클래스의 객체 a 생성
		System.out.println(a);//a의 주소값 출력
		a.method();//객체 a의 메소드 호출
		A a1 = new A();
		//A클래스의 객체 a1생성
		System.out.println(a1);//a1의 주소값 출력
		a1.method();//객체 a1의 메소드 호출
	}//메인메소드 종료
}//ClassTest클래스 종료










