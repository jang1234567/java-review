package task03;

import java.util.Scanner;

public class Ex03 {
//	3. 패키지명 task03
//
//	문자열을 입력받아, 입력받은 문자열을 정수로 변환하여 출력하는 프로그램을 작성하세요. 
//	만약 입력받은 문자열이 숫자가 아닐 경우, NumberFormatException 예외가 발생하게 되며
//	"숫자가 아닌 문자열이 입력되었습니다"라는 메시지를 출력할것
	// 입력클래스 호출
	// 문자열 변수 선언
	// 정수형 변수 선언
	// 문자열을 입력받기 위한 출력문
	// 입력받은 문자열을 문자열 변수에 저장
	// 입력받은 문자열이 숫자로 형변환 불가일 경우 예외 발생
	// 예외 발생 문구 출력문 작성
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String num;
		int number;
		System.out.println("숫자를 입력해주세요");
		num = sc.next();
		try {
			number = Integer.parseInt(num);
			System.out.println(number);
		} catch (NumberFormatException e) {
			System.out.println("숫자가 아닌 문자열이 입력되었습니다.");
		}	finally {
			System.out.println("예외처리 완료");
		}

	}

}
