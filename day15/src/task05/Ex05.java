package task05;

import java.util.Scanner;

public class Ex05 {
//	5. 패키지명 task05
//
//	학생 점수 관리 프로그램
//	사용자로부터 5명의 학생이름과 점수를 입력받고, 학생의 점수를 wrapper 클래스의 객체로 저장한다
//	최고 점수를 가진 학생의 이름과 점수를 출력한다.
//	평균점수를 계산하여 출력한다.
	// 입력클래스 호출
	// 반복문으로 학생의 이름과 점수를 입력받고 배열 저장
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Student s1 = new Student();
		Student[] students = new Student[5];
		s1.saveScore(students, sc);
		s1.maxScore(students);

	}
}
