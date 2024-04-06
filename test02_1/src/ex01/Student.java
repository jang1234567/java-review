package ex01;

import java.util.Arrays;

public class Student {
	//필드
	int studentNumber; //학생번호
	String studentName;	//학생이름
	int[] grades = new int[3];	//성적배열
	
	//생성자
//	매개변수 2개 있는 생성자(문자열 studentName, 정수형 배열 grades )
	public Student(String studentName, int[] grades) {
		this.studentName = studentName;
		this.grades = grades;
	}
	
	//메소드
	//성적보기 메소드
	//단순 출력문
	void showGradeInfo() {
		System.out.println("=====성적 정보======");
		System.out.println("학생이름 : " + studentName + " 학생번호" + studentNumber + " 국어점수 : " + grades[0] + " 영어점수 : " + grades[1] + " 수학점수 : " + grades[2]);
	}
//	평균 성적 계산 메소드(scoreAvg 리턴타입 double, 매개변수 x)
	//index를 이용하여 주소안의 값을 각각 더한후 배열의 길이로 나누기
	double scoreAvg() {
		double avg = (grades[0] + grades[1] + grades[2]) / grades.length; 
		return avg;
	}

	
//	toString() 오버라이딩
//	학생이름, 학생 점수를 반환하는 메소드(Arrays.toString(grades)
	@Override
	public String toString() {
		return studentName + Arrays.toString(grades);
	}
	
	
	
	
	

}
