package control;

import java.util.Scanner;	//입력클래스 import

public class SwitchTest01 {	//SwitchTest01클래스 시작영역
	public static void main(String[] args) {	//메인메소드 시작영역
		Scanner sc = new Scanner(System.in);	//입력클래스 호출
		int choice = 0;	//정수형변수 choice 선언후 초기화
		String result = "";	//문자열 변수 result 선언후 초기화
		
		System.out.println("1부터 4까지 정수 입력 : ");	//정수값을 선언받기위한 출력문
		choice = sc.nextInt();	//입력받은 정수값을 정수형 변수 choice에 저장
//		System.out.println(choice);
		
		switch(choice) { //switch case 조건문 시작영역 
		//=> 정수형변수 choice와 같은값을 가질때 해당 영역의 case 실행
		case 1: case 3:	//choice가 1 또는 3일때 실행
			result = "홀수";		//문자열 변수 result에 홀수 라는 문자열 값 저장
			break;
		case 2: case 4:
			result = "짝수";
			break;
//		case 3:
//			result = "홀수";
//			break;
//		case 4:
//			result = "짝수";
//			break;
		default:
			result = "잘못입력했습니다";
			break;
		}
		System.out.println(result);
		
		
	}
}





















