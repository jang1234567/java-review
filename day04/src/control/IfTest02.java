package control;

import java.util.Scanner;	//입력 클래스 import

public class IfTest02 {	//IfTest02클래스 시작 영역
	public static void main(String[] args) {	//메인메소드 시작 영역
		System.out.println("프로그램 시작");	//프로그램 시작 문자열 출력

		int num = 0;	//정수형 변수 num 선언후 초기화
		Scanner sc = new Scanner(System.in);	//입력클래스 호출
		System.out.println("정수 입력 : ");	// 정수를 입력받기위한 출력문
		num = sc.nextInt();	//입력받은 정수 값을 정수형 변수 num에 대입

		// 조건식(if~else)
		if (num % 2 == 0) {	//if조건식 시작, 정수형 변수 num을 2로 나누었을때 나머지가 0이면 참이면 중괄호 안을 실행한다
			System.out.println(num + "은/는 짝수입니다");	//참일때  출력
		} //첫번째 if문 종료
		else { //위의 조건식이 거짓이면 밑의 중괄호를 실행한다
			System.out.println(num + "은/는 홀수입니다");	//거짓일때 출력
		}	//두번째 else구문 종료
		System.out.println("프로그램 종료"); //프로그램 종료 출력
	}	//메인메소드 종료
}	//IfTest02 클래스 종료










