package typeCasting;

public class CastingTest01 {	//CastingTest01클래스의 시작 영역
	public static void main(String[] args) {	//메인메소드의 시작 영역
		// int, long, double, float, boolean, char
		//기본자료형, 원시자료형, Primitive Type
		
		//String, 클래스 ...
		//클래스자료형, 참조자료형, Reference Type
		
		//다른 자료형의 값을 문자열 자료형으로 만들기
		// + ""
		//기본자료형: 10, 10L, 5.3, 5.3f, true, 'c'
		String str1 = 10 + "";	//문자열 변수 str1 선언후 정수10을 문자열로 형변환 후 대입
		String str2 = 5.3 + "";	//문자열 변수 str1 선언후 실수 5.3을 문자열로 형변환 후 대입
		String str3 = true + "";	//문자열 변수 str1 선언후 논리형 타입 true를 문자열로 형변환후  대입
		String str4 = 'a' + "";	//문자열 변수 str1 선언후 문자형 a를 문자열로 형변환후 대입
		
		System.out.println(str1 + str2);	//str1 + str2 연결한 값을 출력후 줄바꿈 
		
		//문자열을 다른 자료형을 변환
		int number1 = Integer.parseInt(str1);	//정수형 변수 number1을 선언하고 문자열 변수 str1을 정수형으로 형변환 후 대입
		double number2 = Double.parseDouble(str2);	//실수형 변수 number2를 선언하고 문자열 변수 str2를 실수형으로 형변환 후 대입
		boolean isTrue = Boolean.parseBoolean(str3);	//논리형 변수 isTrue를 선언하고 문자열 str3를 논리형으로 형변환 후 대입
		
		System.out.println(number1 + number2);	//number1 + number2 연산한 값을 출력후 줄바꿈
		
		char ch = str4.charAt(0);	//문자형 변수 ch를 선언후 문자열의 인덱스 0번쨰값을 대입
		System.out.println(ch);	//ch의 값을 출력후 줄바꿈
		
		char ch2 = "hello".charAt(0);	//문자형 변수 ch2를 선언후 문자열 hello의 인덱스 0번쨰값을 대입
		//index : 문자열을 구성하는 모든 문자들에 부여된 고유번호
		//index의 시작번호는 0부터 시작한다.
		System.out.println(ch2);	//ch2의 값을 출력후 줄바꿈
	}	//메인메소드 끝 영역

}	//CastingTest01클래스의 끝 영역
