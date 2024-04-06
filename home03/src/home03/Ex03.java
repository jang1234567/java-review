package home03;

import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		
		//정수형 변수 2개선언
		//입력클래스 호출,import
		//while문으로 반복문
		//입력받을 정수 출력문 작성
		//정수형 변수num 에 값 저장
		//정수형 변수 sum에 출력된 num 누적합 저장
		//조건문 0 작성시 종료
		
		
		int num = 1;
		int sum = 0;
		Scanner sc = new Scanner(System.in);
		
		while(num != 0) {
			System.out.println("정수 : ");
			num = sc.nextInt();
			sum += num;
			
			if(num == 0) {
				break;
			}
			
		}System.out.println("출력받은 정수의 합: " + sum);
	}
}
