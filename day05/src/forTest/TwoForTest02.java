package forTest;

public class TwoForTest02 {//TwoForTest02 클래스 시작
	public static void main(String[] args) {//메인메소드 시작
		//2단~9단까지 구구단 출력하기
		
		for(int dan = 2; dan < 10; dan++) { //외부 반복문 for문 시작,정수형 변수 dan이 2고, dan이 10보다 작을때까지 반복
											//반복시마다 dan이 1씩 증가
//			System.out.println(dan);
			for(int num = 1; num < 10; num++) {	//내부 반복문 for문 시작, 정수형변수 num 1대입, num이 10 보다 작을때까지 반복
												//반복시마다 num이 1씩 증가
//				System.out.println("dan : " + dan + ", num : " + num);
				System.out.println(dan + "x" + num + "=" + dan*num);	//정수형 변수 dan과 num출력, dan * num 출력
			}//내부 for문 종료
			System.out.println();//줄바꿈
		}//외부 for문 종료
	}//메인메소드 종료
}//TwoForTest02 클래스 종료
