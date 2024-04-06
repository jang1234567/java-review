package control;

import java.util.Scanner; //입력 클래스 import

public class IfTest03 {	//IfTest03 클래스 시작영역
   public static void main(String[] args) {	//메인메소드 시작영역
      //if~else if~else문
      //학생의 java 성적을 입력받아서 학점(A+,A,B,C) 계산하기
      //A+ : 100
      //A : 90~99
      //B : 70~89
      //C : 그외
      
      //입력클래스 import
      //출력메시지(입력받을)
      //변수 = 입력메소드 nextInt()
      //조건문(if~else if~else)
      
      Scanner sc = new Scanner(System.in);	//입력클래스 호출
      System.out.println("학생의 java 점수 입력 : ");	//입력받을 정수값을 위한 출력문
      int score = sc.nextInt();	//입력받은 정수값을 정수형변수 score에 저장
      
      if(score == 100) {	//조건문 시작, score ==100 일때 참이면 중괄호 영역을 실행한다
         System.out.println("A+");	//score ==100 이면 A+ 출력
      }else if(99 >= score && score >= 90) {	//else if 조건문 시작,만약 score가 99이하이고 90 이상이면 중괄호 영역을 실행한다
         //java에서는 비교연산자를 연속해서 범위를 지정할 수 없다
         //논리연산자를 사용하여 두개의 비교연산을 결합해야한다
         System.out.println("A");	//A출력
      }//else if 조건문 종료
      else if(89 >= score && score > 69) {//else if 조건문 시작,만약 score가 89이하이고 69이면 중괄호 영역을 실행한다
         System.out.println("B");	//B 출력
      }//else if 조건문 종료
      else if(100 < score || score < 0) {//else if 조건문 시작,만약 score가 0미만이고 100 초과이면 중괄호 영역을 실행한다
         System.out.println("잘못된 값입니다");	//잘못된 값입니다 출력
      }//else if 조건문 종료
      else {//else  조건문 시작,만약 위의 조건들이 모두 거짓일때 중괄호 영역 실행
         System.out.println("C");	//C출력
      }//else  조건문 종료
      System.out.println("출력끝");	//출력끝 출력
   }	//메인메소드 종료 영역
}//IfTest03클래스 종료