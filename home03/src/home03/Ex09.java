package home03;

import java.util.Scanner;

public class Ex09 {
//	사용자로부터 과일 이름을 입력받아 해당하는 과일의 가격을 출력하기
//	(사과: 1000원, 바나나: 1500원, 포도: 2000원, 기타: "가격 정보 없음")
	public static void main(String[] args) {
		//문자열 변수 1개 선언
		//입력클래스 호출 및 import
		//과일이름 입력받는 출력문 작성
		//입력받은 과일이름 문자열 변수에 저장
		//조건문으로 해당 과일의 가격 출력
		String fruit = "";
		Scanner sc = new Scanner(System.in);
		System.out.println("과일을 입력해주세요");
		fruit = sc.next();
		switch(fruit) {
		case "사과":
			System.out.println("사과는 1000원 입니다");
			break;
		case "바나나":
			System.out.println("바나나는 1500원 입니다");
			break;
		case "포도":
			System.out.println("포도는 2000원 입니다");
			break;
		default:
			System.out.println("기타 : 가격정보 없음");
		}
	}

}
