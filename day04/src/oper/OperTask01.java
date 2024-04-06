package oper;

import java.util.Scanner;	//입력클래스 import

public class OperTask01 {	//OperTask01 클래스 시작
	public static void main(String[] args) {	//메인 메소드 호출
		//정수 2개를 입력받아서 큰 수 출력하기
		
		//정수1 입력 : 10
		//정수2 입력 : 20
		//정수1 보다 정수2가 더 큽니다
		
		//로직구성!!
		//1) 입력클래스 import
		//2) 변수 3개(int 2개, String 1개)
		//3) 입력 메시지1
		//4) 변수1 입력 메소드
		//5) 입력 메시지2
		//6) 변수2 입력메소드
		//7) 변수3 삼항연산자
		//8) 변수3 출력
		
		Scanner sc = new Scanner(System.in);	//입력클래스 선언
		int num1 = 0, num2 = 0;					//정수형 변수 num1과 num2를 선언후 초기화
		String result = "", msg = "정수 입력 : ";	//문자열 변수 result와 msg선언후 초기화
		
		System.out.println(msg);	//입력값을 받기위한 문자열 변수 msg 출력
		num1 = sc.nextInt();		//입력받은 정수값을 정수형 변수 num1에 저장
		System.out.println(msg);	//입력값을 받기위한 문자열 변수 msg 출력
		num2 = sc.nextInt();		//입력받은 정수값을 정수형 변수 num2에 저장
//		result = num1 > num2 ? "큰 수:" + num1 : "큰 수 : " + num2;
		System.out.println(result = num1 > num2 ? "큰 수:" + num1 : num1 == num2?
				"같습니다" : "큰 수 : " + num2);
		//삼항연산자 조건식 ? 값1 : 값2 => 조건식이 참이면 값1을 호출 아니면 값2를 호출한다
		//삼항연산자를 이용하여 문자열 변수 result를 호출하여 num1값이 num2보다 크면 깂1인 num1을 출력하고 
		//그렇지 않으면 값 2인 num1 == num2 로 넘어간다
		//num1 == num2이 참이면 값1인 "같습니다"를 호출하고 거짓이면 값2인 num2를 호출한다
		
//		System.out.println(result);

		
	}	//메인메소드 종료영역
}//OperTask01 클래스 종료








