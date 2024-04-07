package array;

public class TwoArrayTest03 {//TwoArrayTest03 클래스의 시작
	public static void main(String[] args) {	//메인메소드 시작
		
		int[] ar = {1, 2, 3};//정수형 배열 ar에 값 대입
		System.out.println(ar);//정수형 배열 ar의 주소값 출력
		System.out.println(ar[0]);//정수형 배열 ar의 인덱스 0번쨰 값 출력
		
		int[][] ar2 = {{1, 2, 3}, {4, 5, 6}};	//정수형 2차원 배열 ar2에 값 대입
		System.out.println(ar2); // 2차원 배열의 시작 주소값
		System.out.println(ar2[0]); //2차원 배열의 0번째행의 시작주소값
		System.out.println(ar2[0][0]);//2차원 배열의 0번째행의 0번째 열의 값
		
		System.out.println();
//		for(int i = 0; i < ar.length; i++) {
////			System.out.println(i);
//			System.out.println(ar[i]);
//		}

		for(int i = 0; i < ar2.length; i++) {//행의 값 출력
//			System.out.println(i);
			for(int j = 0; j < ar2[i].length; j++) {//i행의 열의 값 출력
//				System.out.println(j);
				System.out.print(ar2[i][j] + " ");
			}//내부 for문 종료
			System.out.println();// 내부 for문 종료후 줄바꿈으로 열의 값 출력후 줄바꿈
		}//외부 for문 종료
		
	}//메인메소드 종료
}//TwoArrayTest03 클래스의 시작

















