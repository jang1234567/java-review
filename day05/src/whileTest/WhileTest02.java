package whileTest;

public class WhileTest02 {	//WhileTest02클래스 시작
	public static void main(String[] args) {//메인메소드 시작
		//1부터 100까지의 짝수의 합 출력(while문)
		
		//로직구성
		//1) 변수 선언(카운트, 총합)
		//2) 반복문(while){
//		 	출력 카운트변수
		//3) 조건문(if (카운트 % 2 == 0)){
		//4) 총합 구할 변수 += 카운트 }
		//5) 카우트 변수 증가
		//6) 출력
		
		int cnt = 1, even = 0;	//정수형 변수 cnt 선언후 1대입, 정수형 변수 even선언후 0대입
		while (cnt <= 100 ) {	//while 반복문 시작, 만약 정수형 cnt가 100보다 작거나 같으면 무한 반복
//			System.out.println(cnt);
			if (cnt % 2 == 0) {//if문 조건문 시작, 만약 정수형 변수cnt 가  2로 나누었을때 나머지가 0이라면
				even += cnt;	//정수형 변수 even에 cnt 누적합
			}//if 조건문 종료
			cnt++; //정수형 변수 1씩 증가
		}	//while문 종료
		System.out.println(even);		//정수형 변수 even 출력
	}	//메인메소드 종료
}	//WhileTest02클래스 종료












