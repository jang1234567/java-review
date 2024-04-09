package studentTest;

public class Student {
	// 학생 클래스

	// 필드 => 힙 메모리에 생성(객체 생성될 때)
//	이름, 전공, 나이, 학년, 학점
	String name;	//문자열 이름
	String major;	//문자열 전공
	int age;		//정수형 나이
	int grade;		//정수형 학년
	char score;		//문자형 학점

	// 생성자
//	기본생성자
//	생성자 오버로딩
	public Student() {	//객체 생성시 인수를 넣지 않을 때 호출

	}
//	이름, 전공, 나이 입력받는 생성자
//	생성자 오버로딩
	public Student(String name, String major, int age) { //문자열, 문자열, 정수형의 인수가 전달될 때 호출
		//this : 객체 자기자신
		this.name = name;	//해당 객체의 name이라는 필드에 매개변수로 전달된 값을 대입	
		this.major = major;	
		this.age = age;
	}

//	이름, 전공, 나이, 학년을 입력받는 생성자
//	생성자 오버로딩
	public Student(String name, String major, int age, int grade) {	//문자열, 문자열, 정수형, 정수형 인수가 전달될 때 호출
		//this()	: 자기자신의 생성자, 생성자 내에서만 호출가능, 맨 위에 작성해야한다
		this(name, major, age); //name, major, age 매개변수를 가진 자기 자신의 생성자를 호출
		this.grade = grade;	//해당 객체의 grade라는 필드에 매개변수로 전달된 값을 대입
	}

	// 메소드
//	학생의 이름과 학년, 전공을 출력하는 메소드 printStudent
//	매개변수 x, 리턴값 x
	void printStudent() {
		System.out.println("이름 : " + this.name);
		System.out.println("학년 : " + this.grade);
		System.out.println("전공 : " + this.major);
	}

//	학생의 전공 과목의 성적을 2개 입력받아 전공 과목의 평균을 반환하는 메소드
//	avgScore	매개변수 2 o, 리턴값 o
	double avgScore(int subject1, int subject2) {
		//실수형 변수 =(double) (매개변수1 + 매개변수2) / 2 ;
		double avg = (double)(subject1 + subject2) / 2;
		return avg;
	}

//	학생의 평균이 90점 이상이면 A,70점 이상이면 B, 60점 이상이면 C, 그외는 F학점으로 반환하는 메소드
//	gradeScore 매개변수 o, 반환값 o
	
//	변수 선언
//	조건문(if~else if~else)
//	this.score = 학점
//	return 학점
	
	char gradeScore(double avg) { //문자형 반환, 매개변수로 평균점수 받아오기
		//실수 형으로 작성 시
		char grade; //문자형 변수 선언
		if(avg >= 90) {//만약 받아온 매개변수avg가 90이상이라면
			grade = 'A'; //grade A 대입
		}else if(avg >= 70) {//만약 받아온 매개변수avg가 70이상이라면
			grade = 'B';//grade B 대입
		}else if(avg >= 60) {//만약 받아온 매개변수avg가 60이상이라면
			grade = 'C';//grade C 대입
		}else {//모두 아니라면
			grade = 'F';//grade F 대입
		}
		this.score = grade; //객체 자기자신의 score에 grade값 대입
		return grade;	//문자형 변수 grade를 반환한다
	}//구현부 종료
}//메소드 종료





















