package input;

import java.util.Scanner;

public class InputTest04 {	//InputTest04클래스의 시작 영역
   public static void main(String[] args) {	//메인 메소드의 시작영역
      //좋아하는 숫자 num   => nextInt()
      //좋아하는 동물 animal => nextLine()
      int num = 0;	//정수형 변수 num선언후 초기화;
      String animal = "";	//문자열 변수 animal선언후 초기화;
      Scanner sc = new Scanner(System.in);	//입력클래스 호출
      System.out.println("좋아하는 숫자를 입력하세요 : ");	
      num = sc.nextInt();	//정수형 변수 num에 입력받은 값 대입
      System.out.println("좋아하는 동물을 입력하세요 : ");
      sc.nextLine(); //엔터 소모
      animal = sc.nextLine(); //문자열 변수 animaldp 입력받은 값 대입
      System.out.println("좋아하는 숫자는 " + num + ", "
            + "좋아하는 동물은 " + animal + "입니다");
      
   }//메인메소드의 끝 영역
}//InputTest04클래스의 끝 영역 
