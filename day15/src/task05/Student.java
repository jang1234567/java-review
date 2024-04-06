package task05;

import java.util.Scanner;

public class Student {
	// 필드
	String name;
	int score;

	// 생성자

	public Student(String name,  int score) {
		this.name = name;
		this.score = score;
	}

	public Student() {
	}

	// 메소드
	// 학생의 이름과 점수를 저장하는 메소드
	void saveScore(Student[] student, Scanner sc) {
		Student[] students = new Student[5];
		for (int i = 0; i < 5; i++) {
			System.out.println("학생 이름 : ");
			 String name = sc.next();
			System.out.println("학생 점수");
				int score = sc.nextInt();
			students[i] = new Student(name, score);
		}
		System.out.println(students[0].name);
		System.out.println(students[0].score);
	}

	// 최고 점수를 가진 학생의 이름과 점수
	void maxScore(Student[] students) {
		Student highestScore = students[0];
		for (int i = 1; i < 5; i++) {
			if (students[i].score > highestScore.score) {
				highestScore = students[i];
			}
			System.out.println("최고점수를 가진 학생의 이름: " + highestScore.name);
			System.out.println("최고점수를 가진 학생의 점수: " + highestScore.score);
		}

	}

}
