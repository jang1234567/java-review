package oper;

public class OperTest04 {	//OperTest04 클래스 시작 영역
	public static void main(String[] args) {	//메인메소드 시작 영역
		//비트연산자를 이용한 암호화 복호화
		
		int origin = 42; //원본메시지
		// 정수형 변수 origin에 42 대입
		int key = 99; //비트 마스크(암호화 및 복호화에 사용)
//		정수형 변수 key에 99 대입

		//xor 연산을 통한 암호화
		int encrypte = origin ^ key;
		//정수형 변수 encrypte 선언후 origin과 key 변수를 각각 이진수로 바꾼후 베타논리합 연산으로 암호화
		System.out.println("암호화된 메시지 : " + encrypte);
//		연산된 값 출력
		int decrypte = encrypte ^ key;
//		정수형 변수 decrypte 선언후 encrypte와 key 변수를 각각 이진수로 바꾼후 베타논리합 연산으로 복호화
		System.out.println("복호화된 메시지 : " + decrypte);
		//연산된 값 출력
		
	} //메인메소드 종료영역
}	//OperTest04클래스 종료 영역
