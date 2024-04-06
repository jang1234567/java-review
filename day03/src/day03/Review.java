package day03;

public class Review {  //Review클래스의 시작 영역
	public static void main(String[] args) {	//메인메소드의 시작 영역
		
		  //복사 단축키 : ctrl + alt + 방향키 위 아래
	      //이동 단축키 : alt + 방향키 위 아래
	      char ch1 = ' '; //문자형변수 ch1선언후 공백 대입
	      //char 타입은 '' 빈문자 값을 넣을 수 없다(오류발생)
	      System.out.println(ch1);	//ch1의 값 출력후 줄바꿈
	      System.out.println("=====");	
	      String st1 = "";	//문자열 변수 st1선언후 빈문자열 값 대입
	      //String 타입은 "" 빈문자열 값을 넣을 수 있다
	      System.out.println(st1);	//st1의 값 출력후 줄바꿈
	      System.out.println("=====");
	      
	      //""안에 숫자가 들어가 있어도 ""로 묶여있으면 문자열이다
	      System.out.println("12424" + 1);	//문자열12424와 1을 연결한 값을 출력후 줄바꿈
	      System.out.println(12424 + 1);	//정수12424와 1을 더한값을 출력후 줄바꿈
	      
	      
	   }	//메인메소드의 끝 영역
	}	//Review클래스의 끝 영역