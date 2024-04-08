package classTest;

public class Student {//Student클래스 시작
	//필드
	String name; //문자열 변수 name 선언
	int math; //정수형 변수 math선언
	int eng;	//정수형 변수 eng선언
	int kor;	//정수형 변수 kor선언
	double avg;	//실수형 변수 avg 선언
	char grade;	//문자형 변수 grade선언
	
	//메소드
	//학생의 총합을 구하는 기능을 가진 메소드
	int getTotal() { //리턴타입 정수, 매개변수 X
		return math + eng + kor;
	}
	
	//평균을 구하는 기능을 가진 메소드
	//매개변수 x, 리턴값 o
	double getAvg() { 
		return getTotal() / 3.0;
	}
	
	
}//클래스종료










