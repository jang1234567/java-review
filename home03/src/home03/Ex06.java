package home03;

import java.util.Scanner;

public class Ex06 {
	public static void main(String[] args) {
//      사용자로부터 세 개의 숫자를 입력받아 세 수 중 중간값을 출력하기
//      입력클래스 import
//      변수 4개 선언(int 입력메소드 3개, 결과(중간값) 1개)
//      변수1, 2, 3 = 입력메소드(nextInt)
//      조건문(if~else if~else문)
//         if(변수1 >= 변수2 && 변수1 <= 변수3 || 변수1 <= 변수2 && 변수1 >= 변수3) // 변수1 
//         else if(변수2 >= 변수1 && 변수2 <=변수3 || 변수2 <= 변수1 && 변수2 >= 변수3) //변수2
//         else   //변수3
//      출력

		Scanner sc = new Scanner(System.in);
		int num1 = 0, num2 = 0, num3 = 0, median = 0;
		System.out.println("세 개의 숫자 입력 : ");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		num3 = sc.nextInt();
		if ((num1 >= num2 && num1 <= num3) || (num1 <= num2 && num1 >= num3)) {
			median = num1;
		} else if ((num2 >= num1 && num2 <= num3) || (num2 <= num1 && num2 >= num3)) {
			median = num2;
		} else {
			median = num3;
		}
		System.out.println("중간값 : " + median);
		sc.close();
	}
}
