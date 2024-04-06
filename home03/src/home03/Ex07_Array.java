package home03;

import java.util.Scanner;

public class Ex07_Array {
   public static void main(String[] args) {
      // 배열
      // 문자열 배열 선언
      // 입력클래스 import
      // 입력 메시지 출력
      // 정수형 변수 = 입력 메소드
//      while(조건?)
      // 조건문(if~else문)

      Scanner sc = new Scanner(System.in);
      String[] days = { "월요일", "화요일", "수요일", "목요일", "금요일", "토요일", "일요일" };
//      System.out.println(days[0]);

      while (true) {
         System.out.println("1부터 7사이의 숫자 입력 : ");
         int dayNum = sc.nextInt();
         if (dayNum >= 1 && dayNum <= 7) {
            String day = days[dayNum - 1];
            System.out.println(dayNum + "일의 요일은 " + day + "입니다");
         } else if (dayNum == 0){
            break;
         } else {
            System.out.println("잘못된 입력입니다");
         }
      }
   }
}
