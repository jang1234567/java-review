package castingTest4;

public class ShapeTest {
	public static void main(String[] args) {
		Shape r = new Rectangle();
		System.out.println(r);

		polymorphism(new Circle());
		polymorphism(new Triangle());

//		System.out.println(r.clacArea());
		downcasting(new Rectangle());
	}

	// 참조변수의 다형성 기능을 할 메소드
	static void polymorphism(Shape shape) {
		// 업캐스팅 된 메소드 호출
		shape.draw();
	}

	// 다운캐스팅 기능을 할 메소드
	// instanceof 연산자를 사용하여 객체의 실제 타입을 확인
	// 넓이구하는 메소드 호출
	static void downcasting(Shape shape) {
		if (shape instanceof Circle) {
			double result = ((Circle) shape).clacArea();
			System.out.println(result);
		} else if (shape instanceof Rectangle) {
			((Rectangle) shape).width = 4;
			((Rectangle) shape).height = 4;
			double result = ((Rectangle) shape).clacArea();
			System.out.println(result);
		} else if (shape instanceof Triangle) {
			double result = ((Triangle) shape).clacArea();
		}
	}

}

















