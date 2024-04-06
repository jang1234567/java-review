package input;

import java.util.Scanner; //입력클래스를 사용하기 위해 import

public class InputTest02 {	//InputTest02클래스의 시작 영역
	public static void main(String[] args) {	//메인메소드의 시작영역
		//import 자동완성 : ctrl + shift + o
		
		Scanner sc = new Scanner(System.in);	//입력클래스 호출
		
		System.out.println("첫번쨰 입력: ");	//입력받을 값을 위해 첫번쨰 입력: 출력후 줄바꿈
		String str1 = sc.next();	//문자열 변수 str1을 선언후 입력받은 값을 대입
		System.out.println(str1);	//str1의 값을 출력후 줄바꿈
		
		System.out.println("두번쨰 입력: ");	//입력받을 값을 위해 첫번쨰 입력: 출력후 줄바꿈
		String str2 = sc.next();	//문자열 변수 str2을 선언후 입력받은 값을 대입
		System.out.println(str2);	//str2의 값을 출력후 줄바꿈
		
		System.out.println("세번쨰 입력: ");	//입력받을 값을 위해 첫번쨰 입력: 출력후 줄바꿈
		String str3 = sc.next();	//문자열 변수 str3을 선언후 입력받은 값을 대입
		System.out.println(str3);	//str3의 값을 출력후 줄바꿈
		
	}//메인메소드의 끝 영역

}	//InputTest02클래스의 끝 영역
