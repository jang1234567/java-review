package array;

public class TwoArrayTest {//TwoArrayTest 클래스 시작
	public static void main(String[] args) {	//메인메소드 시작
		int[][] twoAr;	//정수형 2차원 배열 twoAr 선언
		twoAr = new int[4][4];//정수형 2차원 배열 twoAr에 행의 크기가 4, 열의 크기가 4인 배열 할당
		
		System.out.println(twoAr);	//정수형 2차원배열 twoAr의 주소값 출력
		System.out.println(twoAr[0][0]);	//정수형 2차원 배열 twoAr의 0행 0열의 값 출력
		System.out.println(twoAr[0][1]);//정수형 2차원 배열 twoAr의 0행 1열의 값 출력
		System.out.println(twoAr[0][2]);//정수형 2차원 배열 twoAr의 0행 2열의 값 출력

//		twoAr[0][0] = 1;
//		twoAr[0][1] = 2;
//		twoAr[0][2] = 3;

		for(int i = 0; i < 4; i++) { //행을 의미 
			//for 외부 반복문 시작, 정수형 변수 i가 0이고 4보다 작을때까지 반복, 반복시마다  i 1씩 증가
			for(int j = 0; j < 4; j++) { //열을 의미
				//for 내부 반복문 시작, 정수형 변수 j가 0이고 4보다 작을때까지 반복, 반복시마다  j 1씩 증가
//				System.out.println("i = " + i + ", j = " + j);
				twoAr[i][j] = i * 4 + j + 1;
				//정수형 2차원 배열 twoAr에 각각의 인덱스에 하나씩 값 대입
				System.out.print(twoAr[i][j] + "\t");//2차원 배열의 인덱스 출력
//				System.out.println();
			}//내부 for문 종료
			System.out.println(); //열의 반복문이 끝날때마다 줄바꿈
		}//외부for문 종료
	
	}//메인메소드 종료
}	//TwoArray클래스 종료













