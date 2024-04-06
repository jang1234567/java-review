package input;

import java.util.Scanner;	//입력클래스 사용하기 위해 주입

public class InputTest01 {	//InputTest01클래스의 시작 영역
	public static void main(String[] args) {	//메인메소드의 시작 영역
		//입력메소드를 사용하기 위해서는 
		//Scanner 입력 클래스를 불러와야한다.
		
		Scanner sc = new Scanner(System.in);	//입력클래스 호출
		//Scanner랑 똑같이 생긴 애를 sc라는 변수에 저장해서 쓸거다.
		System.out.print("숫자 입력: ");	//입력받을 "숫자 입력: " 출력
		String data = sc.next();	//문자열 변수 data를 선언후 입력받은 값을 저장
		System.out.println(data);	//data의 값을 출력후 줄바꿈
		System.out.println("출력 끝");	//출력 끝 출력후 줗바꿈
	}	//메인메소드 끝 영역	

}	//InputTest01클래스의 끝 영역
