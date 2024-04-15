package castingTest4;

//슈퍼클래스
public abstract class Shape { //추상클래스 shape 시작
	//일반메소드
	void draw() {
		System.out.println("도형을 그립니다");
	}
	
	//추상 메소드 넓이 구하는 메소드
	abstract double clacArea();
}//추상클래스 shape 종료
