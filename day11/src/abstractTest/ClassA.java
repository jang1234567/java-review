package abstractTest;

public abstract class ClassA { //ClassA라는 추상 클래스 시작
	//추상클래스의 멤버 : 추상메소드, 일반메소드, 필드, 생성자
	abstract void method1();//구현부가 없고 선언부만 있는 추상메소드
	//일반 메소드
	void method2() {
		System.out.println("메소드2 실행");
	}
}//ClassA라는 추상 클래스 종료
