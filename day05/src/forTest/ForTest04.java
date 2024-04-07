package forTest;

import java.util.Scanner;

public class ForTest04 {//ForTest04 클래스 시작
	public static void main(String[] args) {	//메인메소드 시작
		//3단 구구단 3x1 =3
		//...
		//3x9 =27
		int dan = 3, num = 1;	//정수형 변수 dan 선언후 3대입, num 선언후 1 대입
		System.out.println(dan + " x " + num + " = " + (dan * num));
		System.out.println(dan + " x " + (num + 1) + " = " + (dan * (num + 1)));
		System.out.println(dan + " x " + (num + 2) + " = " + (dan * (num + 2)));
		System.out.println(dan + " x " + (num + 3) + " = " + (dan * (num + 3)));
		System.out.println(dan + " x " + (num + 4) + " = " + (dan * (num + 4)));
		
		//사용자가 입력한 숫자의 단이 출력되도록 하기
		//입력클래스 import
		//dan 변수 nextInt()
		Scanner sc = new Scanner(System.in); //입력클래스 호출
		System.out.println("출력하고 싶은 단을 입력하세요:"); //입력받기위한 출력문
		dan = sc.nextInt();	//입력받은 정수값을 정수형 변수 dan에 저장
		for(int i = 1; i < 10; i++) {	//반복문 시작, 정수형 변수 i 가 1부터 10미만까지 반복, 반복시마다 i 1씩 증가
			System.out.printf("%d x %d = %d", dan, i, dan*i); //서식문자로 정수형 변수 dan, 정수형 변수 i, 정수형 dan * i 출력
			System.out.println();
		}	//for 반복문 종료
		
	}//메인메소드 종료
}//ForTest04클래스 종료









