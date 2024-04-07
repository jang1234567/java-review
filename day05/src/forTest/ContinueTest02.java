package forTest;

public class ContinueTest02 {//ContinueTest02클래스 시작
	public static void main(String[] args) {//메인 메소드 시작
		//1부터 10까지 5를 제외하고 출력하기
		// 반복문(for 초기식 int i = 0; 조건식 i < 10; 증감식 i++)
		// 조건문(if 조건식 i == 4)
		// 출력(i+1)
		
		for(int i = 0; i < 10; i++) { //for 반복문 시작,정수형 변수 i가 0이고 10미만일때 까지 반복하고 i는 반복 1번마다 1씩 값증가
//			total += i;
			if(i==4) { //if 조건문 시작, 만약 i 가 4라면 
//				continue;
				break;// 당장 반복문을 종료시킨가
			}//if문 종료
			System.out.println(i+1); //정수형 변수 i에 1 을 더한값을 출력
		} //반복문 for문 종료
	}//메인메소드 종료
}//ContinueTest02클래스 종료










