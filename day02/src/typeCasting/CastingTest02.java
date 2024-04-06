package typeCasting;

public class CastingTest02 {	//CastingTest02 클래스릐 시작영역
   public static void main(String[] args) {	//메인메소드의 끝 영역
      //자동형변환
      //정수 + 정수 = 정수
      int num1 = 10, num2 = 20;	// 정수형 변수 num1 선언후 10 대입, 정수형 변수 num2선언후 20 대입;
      //printf출력메소드 이용  10 + 20 = 30 
      System.out.printf("%d + %d = %d", num1, num2, num1 + num2);
//      10 + 20 = 30 출력;
      
      //실수 + 실수 = 실수
      double num3 = 10.0, num4 = 5.3;	// 실수형 변수 num3 선언후 10.0 대입, 실수형 변수 num4선언후 5.3 대입;
      System.out.printf("\n%.1f + %.1f = %.1f\n", num3, num4, num3 + num4);
//      10.0 + 5.3 = 15.3 출력;
      System.out.println(num3 + num4);	//15.3 출력후 줄바꿈;
      
      //정수 + 실수 = 실수
      System.out.println(num1 + num3);	//20.0 출력후 줄바꿈;
      
      //+) 실수형값이 제대로 나오지 않는 문제 : 부동소수점 연산의 한계
      //부동소수점 연산 : 컴퓨터에서 실수를 표현하는 방법중 하나, 정확도에 제한이 있다
      double number1 = 0.1; //실수형 변수 number1 선언후 0.1 대입
      double number2 = 0.2;	//실수형 변수 number2 선언후 0.2 대입
      System.out.println(number1 + number2); //0.30000000000000004 출력후 줄바꿈;
   }//메인메소드의 끝 영역
}//CastingTest02 클래스릐 끝영역
