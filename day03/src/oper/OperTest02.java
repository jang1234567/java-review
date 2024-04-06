package oper;

public class OperTest02 {//OperTest02클래스의 시작 영역
   public static void main(String[] args) {	//메인메소드 시작 영역
      //복합대입연산자(누적연산자)
      //산술연산자, 대입연산자를 같이 쓸 때 말한다
      
//      int num = 1;	//정수형 변수 num을 선언후 1 대입
//      System.out.println(num);	//num의 값 호출후 줄바꿈
//      num = num + 10;	//정수형 변수 num 과 10을 더하기 연산후 정수형 변수 num에 대입
//      System.out.println(num);	//num의 값 호출후 줄바꿈
//      num += 10; 	//정수형 변수 num 과 10을 더하기 연산후 정수형 변수 num에 대입
//      System.out.println(num);	//num의 값 호출후 줄바꿈
//      int num1 = 5;	//정수형 변수 num1을 선언하고 5를 대입
//      System.out.println(num1);	//num1의 값 호출후 줄바꿈
//      System.out.println("현재 num1의 값 : " + num1)	//num1의 값 호출후 줄바꿈;
//      num1 -= 3; // num1 = num1 - 3	//정수형 변수 num1과 3을 빼기 연산후 num1에 대입
//      System.out.println("현재 num1의 값 : " + num1);	//num1의 값 호출후 줄바꿈
//      num1 *= 25; // num1 = num1 * 25	//정수형 변수 num1과 25를 곱하기 연산후 num1에 대입
//      System.out.println("현재 num1의 값 : " + num1);	//num의 값 호출후 줄바꿈
      
//      int money = 10000;	//정수형 변수 money를 선언후 10000대입
//      //커피 2000원
//      money = money - 2000; // money -= 2000	//정수형 변수 money와 2000을 빼기 연산후 money에 대입
//      //빵 2500원
//      money -= 2500;	//정수형 변수 money와 2500을 빼기 연산후 money에 대입
//      System.out.println(money);		//money의 값 출력후 줄바꿈
//      //50000원 입금
//      money += 50000;	//정수형 변수 money에 50000을 더하기 연산후 money에 대입
//      System.out.println(money);	//money의 값 출력후 줄바꿈
      
      //1씩 증가, 1씩 감소
      int data = 10;	//정수형 변수 data선언후 10대입
//      data = data + 1;	//정수형 변수 data와 1을 더하기 연산후 정수형 변수 data에 대입
//      data += 1;	//정수형 변수 data와 1을 더하기 연산후 정수형 변수 data에 대입
      data++;	//정수형 변수 data를 후위 증감 연산자 사용
      System.out.println(data);	//data의 값을 출력후 줄바꿈
//      System.out.println(++data);	//정수형 변수 data의 값을 1증가시킨후 출력후 줄바꿈
//      System.out.println(data++); //11	//정수형 변수 data를 출력후 줄바꿈 data의 값에 1을 증가시킨다.
      System.out.println(--data);	//정수형 변수 data의 값을 1감소시킨후 출력후 줄바꿈
      System.out.println(data--);	//정수형 변수 data의 값을 출력후 줄바꿈 data의 값을 1 감소시킨가
      System.out.println(data);	//data의 값을 출력후 줄바꿈
      
      int x = 1; //정수형 변수 x를 선언후 1대입
      System.out.println(x++);	//정수형 변수 x를 출력후 줄바꿈 하고 x의 값에 1증가시킨다
      System.out.println(x);	// x의 값을 출력후 줄바꿈
      System.out.println(--x);	//정수형 변수 x를 1감소시키고 출력후 줄바꿈
      System.out.println(x++ + --x + 2);
      //정수형 변수 x에서 값1 출력후 후위연산자를 통해 2로 증가, 2에서 전위연산자로 인해 1감소시킨후 2를 더하기연산후 출력후 줄바꿈
      
   }//메인메소드 끝 영역
}	//OperTest02클래스의 끝 영역