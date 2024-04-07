package forTest;

public class ContinueTest01 {//ContinueTest01클래스 시작
	public static void main(String[] args) {	//메인메소드 시작
		//1부터 100까지의 합 출력
		//1) 총합 구할 변수
		//2) for(초기식 : int i = 1; 조건식 : i <= 100; 증감식 : i++){
		//3)	총합 변수 += i }
		//4) 출력
		
		int total = 0; //정수형 변수 total 선언후 초기화
		for(int i = 1; i <= 100; i++) {//for 반복문 시작,정수형 변수 i가 1이고 100이하일때 까지 반복하고 i는 반복 1번마다 1씩 값증가
//			total += i;
			if(i % 2 == 0) {//if 조건문 시작, 만약 정수형 변수 i 가 2로 나누었을때 나머지가 0이면
				continue;	//아래 코드를 실행하지 않고 다음반복문으로 넘어간다
			}//if 조건문 종료
			total += i;	//정수형 변수 total에 정수형 변수 i 누적합
//			System.out.println(i);
		}//for 반복문 종료
		System.out.println("1부터 100까지의 홀수의 총합 : " + total); //정수형 변수 total 출력
	}//메인메소드 종료
}	//ContinueTest01클래스 종료













