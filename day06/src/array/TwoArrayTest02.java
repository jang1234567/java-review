package array;

public class TwoArrayTest02 {//TwoArrayTest02클래스  시작
	public static void main(String[] args) {//메인 메소드 시작
		
		int[][] ar1 = new int[2][3];//정수형 2차원 배열 ar1 선언후 크기가 2행 3열 할당
		int num = 10;	//정수형 변수 num 선언후 10 대입
		
		for(int i = 0; i < ar1.length; i++) { //for 외부 반복문 시작, 정수형 변수 i가 0이고 정수형 2차원 배열 ar1의 행의 길이보다 
												//작을때까지 반복, 반복시마다  i 1씩 증가
//			System.out.println(i);
			for(int j = 0; j < ar1[i].length; j++) {//for 내부 반복문 시작, 정수형 변수 j가 정수형 2차원 배열 ar1의 열의 길이보다
										//작을때까지 반복, 반복시마다  j 1씩 증가
//				System.out.println(j);
//				System.out.println("i = " + i + ", j = " + j);
				
				ar1[i][j] = num; //정수형 2차원 배열 ar1의 값에 정수형 변수 num 대입
				num += 10;	//정수형 변수 num에 10 씩 누적합
			}//내부 for문 종료
		}	//외부 for문 종료
		
		//출력용 for문
		for(int[] data : ar1) {//바깥쪽 for문 정수형 2차원배열 ar1 의 행이 끝날때까지 반복
			for(int data2 : data)//안쪽 for문 각각의 2차원배열 ar1 의 행인 data의 열이 끝날때까지 반복
			System.out.println(data2); //모두 출력
		}//for문 종료
	}//메인메소드 종료
}//TwoArrayTest02 클래스 종료










