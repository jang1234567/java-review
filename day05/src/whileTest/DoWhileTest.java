package whileTest;

import java.util.Scanner;

public class DoWhileTest {//DoWhileTest 클레스 시작
	public static void main(String[] args) {	//메인메소드 시작
//		boolean isTrue = false;
//		
//		while(isTrue) {
//			System.out.println("출력");
//		}
//		
//		do {
//			System.out.println("김영선");
//		}while(isTrue);
		
		//사용자로부터 숫자를 입력받아서 해당 숫자가 양수인지 검사
		//입력된 숫자가 양수가 아니면 사용자에게 다시 입력하라는
		//메시지를 출력하고 다시 입력받기
		//입력된 숫자가 양수일 경우만 양수입니다 출력
		
		//1) 입력클래스 import
		//2) 숫자 저장할 변수
		//3) do{
		//4)	 숫자 입력 메시지 출력
		//5)	 변수 nextInt() 사용
		//6)	조건문(if <= 0) {
		//7)		양수가 아닙니다 출력 }
		//8) }while(<= 0)
		//9) 출력
		
		Scanner sc = new Scanner(System.in);	//입력클래스 호출
		int number = 0;	//정수형 변수 number 선언후 0대입
		do { //do while반복문 시작
			System.out.println("숫자 입력 : "); //숫자입력하라는 출력문
			number = sc.nextInt();	//입력받은 숫자 정수형변수 number에 저장
			
			if (number <= 0) {	//만약 number가 0보다 작거나 같다면
				System.out.println("양수가 아닙니다. 다시 입력하세요.");//양수가 아닙니다. 다시 입력하세요 출력
			}	//if 조건문 종료
		}while(number <= 0);//number가 0이하일때 무한 반복
		
		System.out.println(number + "는 양수입니다"); //정수형 변수 number 는 양수 입니다 출력
	}	//메인메소드 종료
	
}//DoWhileTest 클레스 종료











