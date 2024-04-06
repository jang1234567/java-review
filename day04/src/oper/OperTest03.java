package oper;

public class OperTest03 {
	public static void main(String[] args) {
		System.out.println(10&11);// &연산자가 하나일때 이진수로 두 수를 AND(논리곱)연산하여 10
		System.out.println(10|11);	// |연산자가 하나일때 이진수로 두 수를 OR(논리합) 연산하여 11
		System.out.println(10 ^ 11);	//  ^ 베타논리합으로 이진수인 두 수에서 두 비트가 서로 다르면 1이므로 연산결과는 1 출력
		System.out.println(~10);
		System.out.println(~12);
		System.out.println(~-10);
		System.out.println(~-12);
		//~a = -a-1
		
		System.out.println("십진수 : " + 10 + ", 이진수 : " + Integer.toBinaryString(10));
		//십진수 10과 10을 이진수로 바꾼 값 출력
		System.out.println("십진수 : " + 11 + ", 이진수 : " + Integer.toBinaryString(11));
		//십진수 11과 11을 이진수로 바꾼 값 출력
		System.out.println("이진수 : " + Integer.toBinaryString(10&11));
		//10과 11을 이진수로 바꾸고 이진수로 바꾼 값을 논리곱 연산한 값을 출력
		System.out.println("이진수 : " + Integer.toBinaryString(~10));
		//~a = -a-1
		System.out.println("이진수 : " + Integer.toBinaryString(10));
		//10을 이진수로 바꾼 값 출력
		
		System.out.println("========="); 
		//shift 연산자
		System.out.println(10 << 2); //이진수 10(1010)을 왼쪽으로 2칸 shift연산 => 101000 => 40출력
		System.out.println(10 >> 2);	// 이진수 10(1010)을 오른쪽으로 2칸 shift연산 => 10 => 2출력
		System.out.println("이진수 : " + Integer.toBinaryString(10 << 2)); //이진수 10(1010)을 왼쪽으로 2칸 shift연산 => 101000
		System.out.println("이진수 : " + Integer.toBinaryString(10 >> 2)); // 이진수 10(1010)을 오른쪽으로 2칸 shift연산
	
	} //메인메소드 종료 영역
}	//OperTest03 클래스 종료 영역













