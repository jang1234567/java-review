package castingTest4;

public class Triangle extends Shape{ //추상클래스 shape을 상속받는 Triangle클래스
	
	//필드
	int base;
	int height;
	

	//메소드 오버라이딩
	@Override
	void draw() {
		System.out.println("삼각형을 그립니다");
	}
	// 추상메소드 오버라이딩
	@Override
	double clacArea() {
		return 0.5 * base * height;
	}

//	//삼각형 넓이 구하는 메소드
//	void triArea(int base, int height) {
//		System.out.println("삼각형 넓이 : " + 0.5 * base * height);
//	}
}//추상클래스 shape을 상속받는 Triangle클래스 종료
