package forTest;

public class ForTest02 {//ForTest02클래스 시작
	public static void main(String[] args) { //메인메소드 시작
		//1번 김영선
		//2번 김영선
		//3번 김영선
		//4번 김영선
		//5번 김영선
		//for문 이용해서 출력하기
		
		//로직구성
		//1) for반복문선언 (초기식 : int i = 0;
		//				조건식 : i < 5;
		//				증감식 : i++)
		//2) 이름 출력(i 변수 활용)
		for(int i = 0; i < 5; i++) {//반복문 i 가 0이고 5보다 작을떄 i가 반복마다 1씩 증가
			System.out.println(i+1 +"번 김영선");
		}
		
		//10번째 김영선 ~ 1번째 김영선
		//1) 초기식 int i = 10;
		// 조건식 i >= 1;
		// 증감식 i--
		//2) 출력
		for(int i = 10; i >= 1; i--) {//반복문 i 가 10이고 1보다 크거나 같을떄 i가 반복마다 1씩 감소
			System.out.println(i + "번째 김영선");
		}
		
		//1) 초기식 int i = 0;
		// 조건식 i < 10;
		// 증감식 i++
		//2) 출력
		for(int i = 1; i <= 10; i++) {
			System.out.println(11 - i + "번째 김영선");
			System.out.println(i);
		}
	}
}









