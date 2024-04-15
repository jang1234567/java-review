package abstractTest;

public class ClassB extends ClassA{ //추상화 classA를 상속받는 classB시작

	@Override
	void method1() {	//이곳에서 추상클래스A의 추상메소드를 오버라이딩하여 구현해주어야한다 => 강제성 부여
		System.out.println("오버라이딩 메소드1");
	}
	
}//추상classA를 상속받는 classB 종료
