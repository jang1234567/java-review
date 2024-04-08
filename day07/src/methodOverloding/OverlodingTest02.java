package methodOverloding;

public class OverlodingTest02 {//OverlodingTest02 클래스 시작
	//정수 1개 출력하는 메소드(printNum())
	void printNum(int num) { //리턴타입 없고 메소드명 printNum선언 , 매개변수 정수형 변수 num을 매개변수로 받아온다
		System.out.println(num);
	}//구현부 종료
	
	//실수 1개 출력하는 메소드(printNum())
	void printNum(double num) {//리턴타입 없고 메소드명 printNum선언 , 매개변수 실수형 변수 num을 매개변수로 받아온다
		System.out.println(num);
	}//구현부 종료
	
	//문자열 1개 출력하는 메소드(printNum())
	void printNum(String num) {//리턴타입 없고 메소드명 printNum선언 , 매개변수 문자열 변수 num을 매개변수로 받아온다
		System.out.println(num);
	}//구현부 종료
	
	//문자열배열을 출력하는 메소드(printNum())
	void printNum(String[] num) {//리턴타입 없고 메소드명 printNum선언 , 매개변수 문자열 배열 num을 매개변수로 받아온다
		System.out.println(num);//배열의 주소값 출력
		for(String text : num) {//반복문 배열 num의 인덱스에 담긴 각각의 값은 문자열 변수 text에 담아서 출력
			System.out.println(text);
		}//for문 종료
	}//구현부 종료
	
	public static void main(String[] args) {//메인메소드 시작
		OverlodingTest02 ot = new OverlodingTest02();//클래스명 객체명 대입연산자 기본생성자
//		System.out.println(ot);
		
		//정수 출력 메소드
		ot.printNum(10);//정수형 매개변수를 가진 printNum 메소드 호출
		
		//실수 출력 메소드
		ot.printNum(10.5);//실수형 매개변수를 가진 printNum 메소드 호출
		
		//문자열 출력 메소드
		ot.printNum("문자열");//문자열 매개변수를 가진 printNum 메소드 호출
		
		//문자열 배열 출력 메소드
		String[] str1 = {"java", "dbms", "jdbc"};//문자열 배열 str1 선언후 값 대입
		
//		System.out.println(str1);
//		System.out.println(str1[0]);
//		System.out.println(str1[1]);ㅕ9
//		System.out.println(str1[2]);
		ot.printNum(str1);//배열을 매개변수로 가지고 있는 객체의 메소드명 호출
	}//메인메소드 종료
}//OverlodingTest02 클래스 종료



