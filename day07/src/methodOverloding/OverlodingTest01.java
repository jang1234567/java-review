package methodOverloding;

public class OverlodingTest01 {//OverlodingTest01 클래스 시작
	//메소드 오버로딩 : 매개변수의 타입, 개수, 순서가 다르면 같은 이름의 메소드로 선언할 수 있다
	
	//두 개를 더해서 출력하는 메소드
	int printnum(int num1, int num2) { //정수형 타입 반환,메소드명 printNum선언, 매개변수 정수형 변수 num1,num2 선언
		System.out.println(num1 + num2);
		return num1 + num2; //매개변수로 받은 num1 과 num2를 더한 값을 리턴
	}//구현부 종료
	
	double printnum(double num1, int num2, int num3) {//실수형 타입 반환,메소드명 printNum선언, 매개변수 실수형 변수 num1,num2,num3 선언
		System.out.println(num1 + num2);
		return num1 + num2;//매개변수로 받은 num1 과 num2를 더한 값을 리턴
	}//구현부 종료
	
	public static void main(String[] args) {//메인메소드 시작
		OverlodingTest01 ot = new OverlodingTest01();
//		클래스명 객체명 생성자
		
	}//메인메소드 종료
}//OverlodingTest01 클래스 종료
