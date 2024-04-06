package home03;

import java.util.Scanner;

public class Ex {
	public static void main(String[] args) {
		
		//정수형 변수 선언및 초기화
		//입력함수 호출, import
		//입력받기 위한 출력문 작성
		//입력밪은 값 정수형 변수에 저장
		//조건문작성 60점 이상 합격 미만 불합격
		int score = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("점수 : ");
		score = sc.nextInt();
		
		if(score >= 60) {
			System.out.println("합격");
		}else {
			System.out.println("불합격");
		}
	}

}
