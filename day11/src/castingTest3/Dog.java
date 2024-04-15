package castingTest3;

public class Dog extends Animal {//Animal클래스를 상속받는 Dog클래스

	// 메소드
	// 메소드 오버라이딩
	@Override
	void crying() {	//Animal클래스의 메소드 오버라이딩
		System.out.println("멍멍!!");
	}

	void walk() {
		System.out.println("산책가자!");
	}

	// 생성자
	public Dog(String name) {
		super(name);
	}

}//클래스 종료

























