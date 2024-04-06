package ex01;

public class School {
	// 필드
	Student[] students; // student타입 학생 배열
	int studentCount; // 정수형 변수 학생수 선언

	// 생성자, 초기값 설정
	public School() {
//		최대 30까지 학생을 받을 수 있다
		this.students = new Student[30];
//		학생 수는 0부터 시작한다
		this.studentCount = 0;
		}
		
//		학생 등록 메소드 registerStudent
		boolean registerStudent(Student student) {
			//30명이 넘으면 추가 못함
			//학생수와 학생번호는 동일하게 증가
			//학생이 추가될때 학생번호도 증가
			if(studentCount > 30){
				return false;
			}
			this.students[studentCount] = student;
			studentCount = student.studentNumber;
			studentCount++;
			System.out.println("학생을 등록했습니다");
			return true;	
	}
//		학생 목록 보기 메소드 showStudentList
//		(매개변수 x, 리턴값 x)
//		Student클래스의 객체를 가져온다
//		student배열에 길이 만큼 반복문을 사용하여 각 인덱스에 값을 넣어준다
//		학생의 정보를 보여주는 메소드 출력
		void showStudentList() {
			Student student = null;
			for (int i = 0; i < studentCount; i++) {
				student = students[i];

				if (student == null) {
					break;
				}
				student.showGradeInfo();
			}

		}
		

}
