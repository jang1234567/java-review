package input;

import java.util.Scanner;

public class InputTask02 {	//InputTask02클래스의 시작영역
	public static void main(String[] args) {	//메인메소드의 시작 영역
		// 두 정수를 입력받고 합을 출력하기
		// next()메소드만 사용
		// ex)
		// 정수1 입력 : 10
		// 정수2 입력 : 20
		// 두 정수의 합은 30입니다

		// 자료형의 기본값
		// int : 0
		// double : 0.0
		// char : ' '
		// String : "", null
		// boolean : false

		// 로직구성먼저!
//      1) 변수 2개를 선언(String 2개, int 1개)
//      2) 입력 클래스 import 
//      3) 메세지를 출력 (정수1 입력 : ) print()
//      4) 입력메소드를 사용해서 정수1 변수에 저장 next()
//      5) 메세지를 출력 (정수2 입력 : )
//      6) 입력메소드를 사용해서 정수2 변수에 저장 next()
//      7) int 변수 = Integer.parseInt(정수1) + Integer.parseInt(정수2) 

		String num1 = "", num2 = "";	//문자열 변수 num과 num2를 선언후 초기화
		int result = 0;					//정수형 변수 result를 선언후 초기화
		Scanner sc = new Scanner(System.in);	//입력클래스 호출
		System.out.print("정수1 입력 : ");	
		num1 = sc.next(); //문자열 변수 num1에 입력받은 값 대입
		System.out.print("정수2 입력 : ");
		num2 = sc.next();	//문자열 변수 num2에 입력받은 값 대입
		result = Integer.parseInt(num1) + Integer.parseInt(num2);
		//정수형변수 result에 문자열 변수 num1과 num2를 정수형으로 형변환후 연산하여 대입
		System.out.printf("두 정수의 합은 %d입니다\n", result);
	}	//메인메소드 끝 영역
}	//InputTask02클래스의 끝 영역