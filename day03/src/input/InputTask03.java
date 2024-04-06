package input;

import java.util.Scanner;

public class InputTask03 {	//InputTask03클래스의 시작 영역
   public static void main(String[] args) {	//메인메소드의 시작영역
      //이름과 나이를 입력받아서 000님의 나이는 0살입니다 출력하기
      //이름 : 000
      //나이 : 0
      //000님의 나이는 0살입니다
      //next() 또는 nextLine()메소드만 사용할것!
      
//      1) 이름, 나이 변수 선언
//      2) 입력 클래스 import
//      3) 이름입력 메시지 출력
//      4) next() 이름 입력
//      5) 나이 입력 메시지 출력
//      6) next() 나이 입력
//      7) 출력
      
      String name = "", age = ""; //문자열 변수 name과 age를 선언후 초기화
      Scanner sc = new Scanner(System.in);	//입력클래스 호출
      System.out.print("이름 입력 : ");
      name = sc.next();	//입력받은 값을 문자열 변수 name에 저장
      System.out.print("나이 입력 : ");	
      age = sc.next();	//입력받은 값을 문자열 변수 age에 저장
      System.out.println(name + "님의 나이는 " + age + "살입니다");
      System.out.println("내년의 나이는 " + (Integer.parseInt(age)+1) + "살입니다");
      //문자열 변수 age를 정수형 변수로 형변환후 1을 더하기 연산하여 최종 문자열을 출력후 줄바꿈
      
   }	//메인메소드 끝 영역
}//InputTask03클래스의 끝 영역