package array;

import java.util.Scanner;

public class ArrayTask {//ArrayTask클래스 시작
	public static void main(String[] args) {//메인메소드 시작
		//1. 3명의 학생 java점수를 입력받아 배열에 저장하고
		//평균점수 출력하기
		
		//1) 변수, 배열(int 총합, String 번학생 점수), int 배열3칸 선언
		//2) 입력클래스 import
		//3) 반복문(for문 - 점수 입력받을 반복문 )
		//4) 반복문(for문 - 합계 구할 반복문)
		//5) 평균 출력(총합 / 배열명.length)
		
//		int total = 0; 정수형 변수 total 선언
//		int[] score = new int[3];	정수형 배열 score선언후 크기가 3인 배열 할당
//		String msg = "번 학생의 java 점수 : "; 문자열 변수 msg의 점수 입력하는 문자열 대입
//		Scanner sc = new Scanner(System.in); 입력클래스 호출
//		for(int i = 0; i < score.length; i++) {반복문 for문 시작, 정수형 변수 i가 0일때 정수형 배열 score의 길이보다 작을떄까지 반복
												//반복시마다 i 1씩 증가
//			System.out.println(i + 1 + msg);	//i에 1을 더한후 문자열 변수 msg출력 ex)몇번 학생의 java점수 출력
//			score[i] = sc.nextInt();	//입력받은 정수를 정수형 배열의 인덱스 i번쨰에 각각 대입
//		}for문 종료
//		for(int i = 0; i <score.length; i++) {반복문 for문 시작, 정수형 변수 i가 0일때 정수형 배열 score의 길이보다 작을떄까지 반복
		//반복시마다 i 1씩 증가
//			total += score[i]; 정수형 변수 total에 정수형 배열 score의 인덱수 i번째의 값을 누적합
//		}for문 종료
//		System.out.println((double)total / score.length); 정수형 변수 total을 double타입으로 형변환 후 정수형 배열 score의 길이만큼 나눈 값 출력
//		//평균점수 => 실수
//		System.out.println(total / 3.0);
//		System.out.println((double)total / 3);
//		System.out.println((double)(total / 3.0));
//		
		//2. 0, 1, 2, 3, 4, 0, 1, 2, 3, 4 배열에 담고 출력하기
		//단, 칸수를 이용해서 배열 생성
		
		//1) 배열3칸 생성
		//2) 반복문(for {
		//3)  	나머지 연산자를 이용(5개마다 값이 반복됨) }
		//4) 반복문(출력을 위한 for문)
		
		int[] ar1 = new int[10]; //정수형 변수 ar1선언후 크기가 10 할당
		for(int i = 0; i < ar1.length; i++) {//반복문 for문 시작, 정수형 변수 i가 0일때 정수형 배열 ar1의 길이보다 작을떄까지 반복
			//반복시마다 i 1씩 증가
			ar1[i] = i % 5; //정수형 배열 ar1의 인덱스 i번쨰에 i를 5로 나눈 나머지 값을 각각 대입
		}
		for(int i = 0; i < ar1.length; i++) {//반복문 for문 시작, 정수형 변수 i가 0일때 정수형 배열 ar1의 길이보다 작을떄까지 반복
			//반복시마다 i 1씩 증가
			System.out.print(ar1[i] + " ");//ar1의 인덱스 출력
		}
		
		
		//3. A~F까지 중 c만 제외하고 배열에 담고 출력하기
		
		//1) 문자형배열 생성 5칸
		//2) 임시 변수 정수형
		//3) 반복문(for문){
		//4)  임시변수 = i
		//5)  if (i > 1) {
		//6) 	임시변수++; }
		//7)  배열에 값대입 => 배열[i] = (char) (temp+65)
		System.out.println();
		char[] ar2 = new char[5];//정수형 배열 ar2를 선언하고 크기가 5 할강
		int temp = 0;//정수형 변수 temp 선언 및 초기화
		for(int i = 0; i < ar2.length; i++) {//반복문 for문 시작, 정수형 변수 i가 0일때 정수형 배열 ar2의 길이보다 작을떄까지 반복
			//반복시마다 i 1씩 증가
//			System.out.println(i);
			temp = i;	//정수형 변수 temp에 i 대입
			if(temp > 1) {//만약 정수형 변수 temp가 1보다 크다면 
				temp++; //증감연산자를 이용해 정수형 변수temp를 1씩 증가시켜준다
			}	//if문 종료
			//방법 2. ar2[2]번째 (c)
//			if(i == 2) {
//				continue;
//			}
//			ar2[i] = (char)(i+65);
			ar2[i] = (char)(temp+65); //정수형 배열 ar2의 인덱스 i번째 값에 정수형 변수 temp에 65를 더한값을 문자형으로 형변환 후 출력
		}//for문 종료
//		for(int i = 0; i<ar2.length; i++) {
//			System.out.println(ar2[i]);
//		}
		for(char data : ar2) { //빠른 for문  문자형 변수 data를 만들고 정수형 배열 ar2를 반복하여 각각의 값 출력
			System.out.println(data);
		}//for문 종료
		
		//4. 5칸의 정수배열을 만들고 입력받아 최대값과 최소값 출력하기
		//1) 정수형 배열 5칸
		//2) 입력 클래스 import
		//3) 변수 String msg; int min, max
		//4) 반복문(for문) - 입력받기 위한 반복문
		//5) min = 배열[0], max = 배열[0]
		//6) 반복문(for문) - 조건문(if문 최소값, if문 최대값)
		//7) 출력
		
		int[] ar3 = new int[5];//정수형 배열 ar3 선언후 크기 5 할당
		Scanner sc = new Scanner(System.in);//입력클래스 호출
		String msg = "번째 정수 입력 : ";//문자열 변수 msg 선언후 값 할당
		for(int i = 0; i < ar3.length; i++) {// 정수형 변수 i가 0이고 정수형 배열 ar3의 크기보다 작을때까지만 반복, 반복시마다 i 1씩 증가
			ar3[i] = sc.nextInt();//입력받은 정수값 정수형 배열 ar3의 각각의 인덱스에 저장
		}//for문 종료
		int min = ar3[0], max = ar3[0]; //정수형 변수 min,max선언후 인덱스 0번째 값을 각각 대입
		for(int i=0; i < ar3.length; i++) {// 정수형 변수 i가 0이고 정수형 배열 ar3의 크기보다 작을때까지만 반복, 반복시마다 i 1씩 증가
			if(min > ar3[i]) {// 조건문 시작 ,만약 정수형 변수 min이 정수형 변수 ar3의 인덱스 i 번째 보다 크다면
				min = ar3[i]; //정수형 변수 min에 정수형 배열 ar3의 인덱스 i 번째 값 대입
			}	//조건문 if 종료
			if(max < ar3[i]) {// 조건문 시작 ,만약 정수형 변수 max이 정수형 변수 ar3의 인덱스 i 번째 보다 작다면
				max = ar3[i];//정수형 변수 max에 정수형 배열 ar3의 인덱스 i 번째 값 대입
			}//조건문 if 종료
		}//반복문 for문 종료
		
		System.out.println("최대값 : " + max); //최댓값인 정수형 변수 max 출력
		System.out.println("최소값 : " + min);	//최솟값인 정수형 변수 min 출력
	}	//메인메소드 종료
}//ArrayTask 클래스 종료













