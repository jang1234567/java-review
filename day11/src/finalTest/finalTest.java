package finalTest;

public class finalTest {//finalTest 클래스 시작
	//클래스 내부에서 상수를 선언하는 방법
	static final double PI = 3.14159254359;
	
	
	
	public static void main(String[] args) {//메인메소드 시작
		int maxLength = 10; //변수
		System.out.println(maxLength);
		maxLength = 30; //변수의 값 변경 가능
		System.out.println(maxLength);
		
		//메소드 내부에서 상수를 선언하는 방법
		final int MAX_LENGTH = 100;
		System.out.println(MAX_LENGTH);
//		MAX_LENGTH = 200;
		System.out.println(PI);
	}//메인메소드 종료
}//finalTest 클래스 종료
























