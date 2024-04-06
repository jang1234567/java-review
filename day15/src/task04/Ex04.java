package task04;
//질문 문자열을 작성하는데 예외처리 후에 FizzBuzz 이 부분이 함께 출력되는 이유는?

import java.util.Scanner;

public class Ex04 {
//	4. 패키지명 task04
//
//	사용자로부터 숫자를 입력받아, 입력받은 숫자가 3의 배수인 경우 "Fizz", 
//	5의 배수인 경우 "Buzz", 3과 5의 공배수인 경우 "FizzBuzz", 그 외의 경우에는 입력받은 숫자를 출력하는 프로그램을 작성하세요. 
//	사용자가 문자열을 입력할 경우, "숫자가 아닌 문자열이 입력되었습니다"라는 예외 메시지를 출력하세요.

	// 입력클래스 호출
	// 정수형 변수 선언
	// 정수를 입력받기위한 출력문
	// 입력받은 정수를 정수형 변수에 저장
	// 이때 사용자가 문자열을 입력할 경우 예외처리
	// 정수를 입력받았을때 조건문작성
	// 3의 배수이고 3과5의 공배수가 아닌경우 Fizz
	// 5의 배수이고 3과5의 공배수가 아닌경우 Buzz
	// 3과 5의 공배수인 경우 FizzBuzz
	// 그 외에는 입력받은 숫자 출력
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = 0;
		try {
			System.out.println("정수를 입력해주세요");
			num = sc.nextInt();
		} catch (Exception e) {
			System.out.println("숫자가 아닌 문자열을 입력했습니다");
		}
		if (num % 3 == 0 && num % 5 == 0) {
			System.out.println("FizzBuzz");
		} else if ((num % 5 == 0) && !(num % (3 * 5) == 0)) {
			System.out.println("Buzz");
		} else if ((num % 3 == 0) && !(num % (3 * 5) == 0)) {
			System.out.println("Fizz");
		} else {
			System.out.println(num);
		}

	}

}