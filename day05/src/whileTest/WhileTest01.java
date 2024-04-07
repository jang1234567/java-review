package whileTest;

import java.util.Scanner;

public class WhileTest01 { //WhileTest01 클래스 시작
	public static void main(String[] args) {	//메인 메소드 시작
		// 안녕하세요 000님 환영합니다 10번 출력
		// 로직구성
		// 1) 카운트 변수 선언
		// 2) while (카운트변수 < 11){
		// 3) 출력문(안녕하세요 000님 환영합니다)
		// 4) ++ 증감연산자
		// }
		
		//로직구성
		// 1) 입력 클래스 import
		// 2) 이름 변수 선언
		// 3) 카운트 변수(반복횟수를 조건식)
		// 4) while문 {
		// 5) 입력받을 메시지
		// 6) 이름 입력 메소드
		// 7) 출력 메시지
		// 8) ++ 증감연산자
		
		Scanner sc = new Scanner(System.in);//입력 클래스 호출
		String name = "";	//문자열 변수 name선언후 초기화
		int cnt = 1;	//정수형 변수 cnt 선언후 1대입
		while(cnt < 11) {	//while반복문 시작, 만약 정수형 변수 cnt가 11보다 작다면 무한반복
			System.out.println("이름을 입력하세요 : ");	//이름을 입력하세요 라는 출력문
			name = sc.nextLine();	//문자열 변수 name에 입력받은 문자열 저장
			System.out.println("안녕하세요 " + name + "님 환영합니다");//안녕하세요 + 문자열 변수 name + 님 환영합니다 출력
			cnt++; //정수형 변수 1증가
		} //while 반복문 종료
	} //메인메소드 종료
	
}//WhileTest01 클래스 종료











