package input;

import java.util.Scanner;

public class InputTask01 {	//InputTask01클래스의 시작 영역
   public static void main(String[] args) {	//메인메소드의 시작 영역
      //이름을 입력하세요 : 000
      // 000님 안녕하세요 출력
      
//      1) 입력클래스
//      2) import
//      3) 이름을 입력하세요 출력 print()
//      4) String 타입 변수 입력메소드 .next()
//      5) 출력
      
      Scanner sc = new Scanner(System.in);	//입력 클래스 호출
      System.out.print("이름을 입력하세요 : ");	//이름을 입력하라는 메소드 출력
      String name = sc.next();	//문자열 변수 name을 선언후 입력받은 값을 대입
//      System.out.print(name + "님 안녕하세요");
//      System.out.printf("%s님 안녕하세요", name);
      System.out.println(name);	//name의 값을 출력후 줄바꿈
   }	//메인메소드의 끝 영역
}	//InputTask01클래스의 끝 영역