package ex01;

public class Main {
	public static void main(String[] args) {
		//점수 배열 생성
		int[] grades = {100,90,80};
		//학생 생성
		Student s1 = new Student("장윤근", grades);
		int[] grades1 = {80,70,60};
		Student s2 = new Student("김민혁", grades1);
		int[] grades2 = {70,90,80};
		Student s3 = new Student("이현우", grades2);
		//학생정보 보여주기 메소드
		s1.showGradeInfo();
		s2.showGradeInfo();
		s3.showGradeInfo();
		
		System.out.println(s1.scoreAvg());
		System.out.println(s1.toString());
		
		//학급생성
		School sc1 = new School();
		sc1.registerStudent(s1);
		sc1.registerStudent(s2);
		sc1.registerStudent(s3);
		
		sc1.showStudentList();
	}

}
