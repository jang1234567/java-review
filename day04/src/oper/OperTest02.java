package oper;

public class OperTest02 {	//OperTest02 클래스 시작부분
	public static void main(String[] args) {	//메인 메소드 시작
		//삼항연산자
		//조건식 ? 참일 때 값 : 거짓일 때 값
		int num1 = 10, num2 = 20, num3 = 20;	//정수형 변수 num1,num2,num3를 선언후 각각 값을 10,20,30을 대입하며 초기화
		String num4 = num1 >= 9 ? num1 + "이 9보다 큽니다" : "num1은 9보다 크지않습니다";
		//문자열 변수 num4를 선언후 num1값이 9보다 크거나 같으면 값1인 num1 + "이 9보다 큽니다" 출력, 거짓이면 "num1은 9보다 크지않습니다" 출력
		//위의 코드에서 num1에 값 10을 대입해주었기 때문에 num1이 9보다 크다는 조건이 참이다
		
		System.out.println(true ? 10 : 20); //true이기때문에 참으로 참인 값1인 10출력
		System.out.println(false ? 10 : 20);	//false이기 때문에 거짓으로 거짓인 값2인 20출력
		
		System.out.println(num1 == num2 ? "같다" : "다르다");	//num1은 10이고 num2는 20이므로 조건식에 대한 값은 거짓이므로 값2인 "다르다"출력
		System.out.println(num1 != num2 ? "같다" : "다르다");	//num1은 10이고 num2는 20이므로 조건식에 대한 값은 참이므로 값1인 "같다"출력
		System.out.println(num4);	
		//위의 코드에서 num1에 값 10을 대입해주었기 때문에 num1이 9보다 크다는 조건이 참이다
		//따라서 참인 값1인 num1 + "이 9보다 큽니다" 출력
		
		
	}//메인메소드 종료영역
}//OperTest02 클래스 종료영역
