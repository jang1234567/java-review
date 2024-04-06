package typeCasting;

public class CastingTest04 {	//CastingTest04 클래스의 시작 영역
	public static void main(String[] args) {	//메인메소드의 시작 영역
		//강제형변환 : (자료형)값
		
		int num1 = (int) 5.24;	//강제형변환
//		정수형 변수 num1을 선언하고 5.24를 정수형으로 강제형변환후 num1에 대입;
		System.out.println(num1);
		//num1의값 출력후 줄바꿈;
		
		System.out.println(5.24);
		//5.24 출력후 줄바꿈;
		
		double num2 = 5;	//자동형변환
//		실수형 변수 num2 선언후 5 대입;
		System.out.println(num2);
//		num2값 출력후 줄바꿈;
		
		char ch1 = 97;	//자동형변환
//		문자형 변수 ch1 선언후 97 대입;
		System.out.println(ch1);
//		ch1의 값 출력후 줄바꿈;
		
		System.out.println((int)'나');	//45208
//		'나'의 값을 정수형으로 바꿔서 출력후 줄바꿈;
		char ch2 = 44032 + 1;
//		문자형 변수 ch2 선언후 44032 + 1 대입;
		System.out.println(ch2);
//		ch2의 값 출력후 줄바꿈;
	
	}//메인메소드의 끝 영역
}//CastingTest04 클래스의 끝 영역
