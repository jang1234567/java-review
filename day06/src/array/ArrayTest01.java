package array;

public class ArrayTest01 {//ArrayTest01 클래스 시작
	public static void main(String[] args) {//메인메소드 시작
		//배열 선언 후 1~10까지 값 넣기
//		int[] ar1 = new int[10]; 정수형 배열 ar1선언후 크기가 10인 배열 할당
//		System.out.println(ar1);	정수형 배열 ar1의 주소값 출력
		
		//배열에 값을 대입하는 반복문
//		for(int i = 0; i < ar1.length; i++) {반복문 for문 시작, 정수형 변수 i가 0이고 정수형 배열 ar1의 길이보다 작을떄까지 반복,
												//반복시마다 i 1씩 증가
//			ar1[i] = i + 1;		정수형 배열 ar1의 i 번째에 i + 1 대입히면서 배열 완성
//		}for문 종료
		
		//배열에 값을 출력하는 반복문
//		for(int i = 0; i < ar1.length; i++) {반복문 for문 시작, 정수형 변수 i가 0이고 정수형 배열 ar1의 길이보다 작을떄까지 반복,
		//반복시마다 i 1씩 증가
//			System.out.println(ar1[i]);//정수형 배열 ar1의 인덱스 i번째의 값 출력
//		}
		
		//1부터 10까지의 값을 배열 넣고 총 합 구하기
		//칸 수만 알고있을 때 배열 생성
		int[] ar2 = new int[10];//정수형 배열 ar2 선언후 크기가 10으로 할당
		
		//1) 총합 저장할 변수 선언
		//2) 반복문(for문 배열의 값을 넣어줄 반복문) - 값 대입, 확인용 출력
		//3) 반복문(for문 총합을 구할 반복문) - 값 대입(배열에 저장된 값을 총합 변수)
		//4) 출력
		
		int total = 0; //정수형 변수 total 선언
		for(int i = 0; i < ar2.length; i++) {//반복문 for문 시작, 정수형 변수 i가 0이고 정수형 배열 ar2의 길이보다 작을떄까지 반복,
			//반복시마다 i 1씩 증가
//			ar2[i] = i+1;
//			ar2[i] = ar2.length - i; //인덱스0부터 값이 10, 인덱스1 값이 9 ,.. 인덱스9 값이 1
			//i의 값 : 0~9
			ar2[ar2.length - 1 - i] = ar2.length - i;
			//정수형 배열 ar2의 인덱스가 ar2의 길이에서 1을 빼고 i를 뺀 값이고 그 공간의 ar2의 길이 -i 한 값을 대입한다
		}//for문 종료

		for(int i = 0; i < ar2.length; i++) {//반복문 for문 시작, 정수형 변수 i가 0이고 정수형 배열 ar2의 길이보다 작을떄까지 반복,
			//반복시마다 i 1씩 증가
			total += ar2[i];
			//정수형 변수 total에 정수형 배열의 인덱스 i번쨰를 누적합한다
		}//for문 종료
		System.out.println(total);//정수형 변수 total 출력
		
		
	}//메인메소드 종료
}//ArrayTest01 클래스 종료














