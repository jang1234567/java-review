package ex02;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// 입력클래스 호출
		Scanner sc = new Scanner(System.in);
		// 정수형 변수 선언
		int num1;
		int num2;
		int oper = 0;
		// 입력받기위한 출력문
		System.out.println("정수1을 입력해주세요 : ");
		System.out.println("정수2를 입력해주세요 : ");
		System.out.println("연산기호를 입력해주세요 : ");
		// 입력받은값 선언한 변수에 각각 저장
		num1 = sc.nextInt();
		
		num2 = sc.nextInt();
		oper = sc.next().charAt(oper);

		// switch case 를 이용하여 계산

		switch (oper) {
		case '+':
			System.out.println(num1 + num2);
			break;
		case '-':
			System.out.println(num1 - num2);
			break;
		case '*':
			System.out.println(num1 * num2);
			break;
			//나누는 수가 0일때와 음수일때 예외처리 발생 
		case '/':
			try {
				if (num2 == 0 || num2 < 0)
					throw new MyException("0또는 음수는 나눌수 없습니다");

			} catch (MyException e) {
				e.getMessage();
				e.printStackTrace();
			}

			System.out.println(num1 / num2);
			break;
		}
		sc.close();
	}
}
