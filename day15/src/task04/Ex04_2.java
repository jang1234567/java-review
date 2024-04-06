package task04;

import java.util.Scanner;

public class Ex04_2 {
//	4. 패키지명 task04
//
//	사용자로부터 숫자를 입력받아, 입력받은 숫자가 3의 배수인 경우 "Fizz", 
//	5의 배수인 경우 "Buzz", 3과 5의 공배수인 경우 "FizzBuzz", 그 외의 경우에는 입력받은 숫자를 출력하는 프로그램을 작성하세요. 
//	사용자가 문자열을 입력할 경우, "숫자가 아닌 문자열이 입력되었습니다"라는 예외 메시지를 출력하세요.
	// 메소드 작성
	static void fizzbuzzCheck(int num) {
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

	// 메소드 호출후 예외처리
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("정수를 입력해주세요");
			int input = sc.nextInt();
			fizzbuzzCheck(input);
		} catch (Exception e) {
			System.out.println("숫자가 아닌 문자열이 입력되었습니다");

		}

	}
}
