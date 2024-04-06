package control;

public class IfTest01 {	//IfTest01 클래스 시작
	public static void main(String[] args) {	//메인메소드 시작영역
		//if문
		System.out.println("1번"); // 1번이라는 값을 가지고 있는 문자열 출력
		if(true) {		
			//if 조건문 사용 => 참(true)일때 중괄호 영역안에 있는 코드 실행
			System.out.println("2번");	//2번이라는 값을 가지고 있는 문자열 출력
		} //if문 종료영역
		
		if(10 % 2  == 0) { //if문 시작 영역
			System.out.println("3번");	//참일때 3번이라는 값을 가지고 있는 문자열 출력
		}	//if문 종료영역
		
		System.out.println("4번");	//4번이라는 값을 가지고 있는 문자열 출력
	}	//메인메소드 종료 영역
}	//IfTest01 클래스 종료 영역
