package oper;

import java.util.Scanner;

public class OperTest01 {	//OperTest01 클래스의 시작영역
   public static void main(String[] args) {	//메인메소드의 시작 영역
      //두 자리수 정수를 입력받고 십의 자리와 일의자리를 각각 출력하기
//      1) 입력클래스 import
//      2) 정수형 변수 3개 선언
//      3) 출력 메시지(두자리수 정수 입력 : )
//      4) 입력 받아서 변수에 저장(nextInt())
//      5) 십의자리 / 10
//      6) 일의자리 % 10
//      7) 출력
      Scanner sc = new Scanner(System.in);	//입력클래스 호출
      int inputNum = 0, result1 = 0, result2 = 0;	//정수형 변수 inputNum,result1,result2를 선언후 초기화
      System.out.println("두자리 정수를 입력하세요 : ");
      inputNum = sc.nextInt();	//입력받은 값을 정수형 변수 inputNum에 저장
      
      result1 = inputNum / 10;	//정수형 변수 result1에 정수형 변수 inputNum나누기 10을 한 몫을 대입
      result2 = inputNum % 10;	//정수형 변수 result2에 정수형 변수 inputNum나누기 10을 한 나머지를 대입
      System.out.println("십의자리 : " + result1); //result1의 값 호출후 줄바꿈
      System.out.println("일의자리 : " + result2);	//result2의 값 호출후 줄바꿈
   }//메인메소드 끝 영역
}	//OperTest01 클래스의 끝영역