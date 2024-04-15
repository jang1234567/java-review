package castingTest4;

//슈퍼클래스 Shape를 상속받은 서브클래스 Circle
public class Circle extends Shape{//추상클래스 shape을 상속받는 Circle클래스
	//필드
	int radius;
	// 추상메소드 오버라이딩
	@Override
	double clacArea() {
		return radius * radius * Math.PI;
	}

	//메소드 오버라이딩
	@Override
	void draw() {
		System.out.println("원을 그립니다");
	}
	
//	void cirArea(double radius) {
//		System.out.println("원의 넓이 : " + radius * radius * Math.PI);
//	}
}//추상클래스 shape을 상속받는 Circle클래스
