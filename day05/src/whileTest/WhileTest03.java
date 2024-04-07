package whileTest;

import java.util.Scanner;

public class WhileTest03 {//WhileTest03 클래스 시작
	public static void main(String[] args) {	//메인메소드 시작
	      //1) 입력클래스 import
	      //2) 숫자 저장할 변수
	      //3) do{
	      //4)    숫자 입력 메시지 출력
	      //5)    변수 nextInt() 사용
	      //6)   조건문(if <= 0) {
	      //7)      양수가 아닙니다 출력 }
	      //8) }while(<= 0)
	      //9) 출력

//		while문으로 바꾸기
	      //1) 입력클래스 import
	      //2) 카운트변수(숫자저장할 변수)
		  //3) while(<=0){
		  //4)   숫자 입력 메시지 출력
	      //5)   변수 nextInt() 사용
	      //6)   조건문(if <= 0) {
	      //7)     양수가 아닙니다 출력 }
		  //8) 출력
		Scanner sc = new Scanner(System.in);	//입력클래스 호출
		int number = 0;	//정수형 변수 number 선언후 초기화
		while(number <= 0) {	//만약 정수형 변수 number가 0이하이면
			System.out.println("숫자 입력 : ");//숫자입력받기위한 출력문
			number = sc.nextInt();	//정수형 변수 number에 입력받은 정수값 저장
			if(number <= 0) { //if문시작, 만약 정수형 변수 number가 0 이하라면
				System.out.println("양수가 아닙니다");//양수가 아닙니다 출력
			}//if조건문 종료
		} //while 반복문 종료
		System.out.println(number + "양수입니다"); //정수형 변수 number + 양수입니다
	}	//메인메소드 종료
}//WhileTest03 클래스 종료
















