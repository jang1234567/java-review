package castingTest4;

//슈퍼 상속받은
public class Rectangle extends Shape{//추상클래스 shape을 상속받는 Rectangle클래스
	
	//필드
	int width;
	int height;

	//메소드 오버라이딩
	@Override
	void draw() {
		System.out.println("사각형을 그립니다");
	}
	// 추상메소드 오버라이딩
	@Override
	double clacArea() {
		return this.width * this.height;
	}

	
	
//	//사각형 넓이 구하는 메소드
//	void rectArea(int width, int height) {
//		System.out.println("사각형 넓이 : " + width * height);
//	}
	
}//추상클래스 shape을 상속받는 Rectangle클래스
