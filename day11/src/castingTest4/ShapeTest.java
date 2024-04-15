package castingTest4;

public class ShapeTest {
	public static void main(String[] args) {
		Shape r = new Rectangle(); //up casting한 객체 r
		System.out.println(r);	//주소값 출력

		polymorphism(new Circle()); //up casting후 메소드 호출
		polymorphism(new Triangle());//up casting후 메소드 호출

//		System.out.println(r.clacArea());
		downcasting(new Rectangle()); //up casting되었지만 메소드에서 up casting된 객체가 해당 자식의 값이라면 down casting 진행후 값 출력하는 메소드
	}

	// 참조변수의 다형성 기능을 할 메소드
	static void polymorphism(Shape shape) { //매개변수를 Shape 클래스타입으로 받아준다 => 자식의 생성자로 호출할 경우 up casting된다
		// 업캐스팅 된 메소드 호출
		shape.draw();
	}

	// 다운캐스팅 기능을 할 메소드
	// instanceof 연산자를 사용하여 객체의 실제 타입을 확인
	// 넓이구하는 메소드 호출
	static void downcasting(Shape shape) { //매개변수를 Shape 클래스타입으로 받아준다 => 자식의 생성자로 호출할 경우 up casting된다
		if (shape instanceof Circle) { //만약 shape이 Circle의 타입이라면
			double result = ((Circle) shape).clacArea();	//Circle로 다운캐스팅 후 메소드 호출
			System.out.println(result);
		} else if (shape instanceof Rectangle) {//만약 shape이 Rectangle의 타입이라면
			((Rectangle) shape).width = 4;
			((Rectangle) shape).height = 4;
			double result = ((Rectangle) shape).clacArea();//Rectangle로 다운캐스팅 후 메소드 호출
			System.out.println(result);
		} else if (shape instanceof Triangle) {//만약 shape이 Triangle의 타입이라면
			double result = ((Triangle) shape).clacArea();//Triangle로 다운캐스팅 후 메소드 호출
		}
	}

}//ShapeTest 클래스 종료

















