package home03;

import java.util.Scanner;

public class Ex05 {
	public static void main(String[] args) {
		// 문자형 변수 2개 선언및 초기화
		//입력클래스 호출, import
		
		//입력받은 문자형변수 저장
		//조건문으로 비교
		char al = ' ', be = ' ';
		Scanner sc = new Scanner(System.in);
		System.out.println("문자를 입력해주세요");
		al = sc.next().charAt(0);
		be = sc.next().charAt(0);
		if(al > be) {
			System.out.println("아스키 코드값이 더 큰 문자는: " + al);
		} else if(be > al) {
			System.out.println("아스키 코드값이 더 큰 문자는: " + be);
		} else if(al == be){
			System.out.println("두 문자는 같은 수 입니다");
		}else {
			System.out.println("문자를 다시 입력해주세요");
		}
		
		
	}

}
