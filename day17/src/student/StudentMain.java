package student;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class StudentMain {
	public static void main(String[] args) {
		// 컬렉션 프레임워크 이용(점수 저장)
		// 1. 사용자로부터 학생 수와 학생 점수 입력받기
		//입력클래스 호출
		//입력받기위한 출력문
//		입력받은값 정수형 변수에 저장
//		반복문사용=> 입력받은값까지 => 점수입력받기위한 출력문
//		=> 입력받은 값 배열에 저장
		Scanner sc = new Scanner(System.in);
		System.out.println("학생 수 :");
		int stNumber = sc.nextInt();
		ArrayList<Integer> scores = new ArrayList<>();
		for(int i = 0; i < stNumber; i++) {
			System.out.println("학생의 점수를 입력해주세요 : ");
			int score = sc.nextInt();
			scores.add(score);
		}
		System.out.println(scores);
		System.out.println(scores.size());
		// 2. 입력받은 점수를 이용해서 평균점수 계산하기
//		반복문 =>
		int totalScore = 0;
		for(int i = 0; i < scores.size(); i++) {
			totalScore += scores.get(i);
//			System.out.println(totalScore);	
		} 
		double avg = totalScore / scores.size();
		System.out.println("평균점수 : " + avg);
		// 3. 입력받은 점수 중 최고점수 계산하기
		System.out.println("최고점수 : " + Collections.max(scores));
		
		// 4. 계산된 평균점수와 최고점수 출력하기
		System.out.println("평균점수 : " + avg
					+ "최고점수 : " + Collections.max(scores));
		
	}

}
