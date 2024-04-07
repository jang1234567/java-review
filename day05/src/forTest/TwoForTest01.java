package forTest;

public class TwoForTest01 {//TwoForTest01클래스 시작
	public static void main(String[] args) {//  메인메소드 시작
		for(int i = 0; i < 3; i++) {//for 반복문 시작, 정수형 변수 i가 0 이고 3보다 작을때까지 반복, 반복시마다 i가 1씩 증가
//			System.out.println(i);
			for(int j = 1; j < 3; j++) { 
				//i가 0일때 j 반복을 모두 수행후 i 1 증가
				//for 반복문 시작 정수형 변수 j가 1이고 3보다 작을때까지 반복, 반복시마다 j 1씩 증가
				System.out.println("i = " + i + ", j = " + j); //정수형 변수 i와 j 출력
			}//내부 for문 종료
		}//외부 for문 종료
	}//메인메소드 종료
}//TwoForTest01클래스 종료
