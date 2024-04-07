package forTest;

public class ForTest03 {//ForTest03 클래스 시작
	public static void main(String[] args) {//메인메소드 시작
//		//초기식 : int i = 0
//		
//		//1~100 짝수만 출력 tab키 적용
////		1) for( 초기식 : int i = 0;
////			조건식 : i <= 100; or i <= 50;
////			증감식 : i++		or 	i += 2
////		2) 조건문	 if	(i% 2== 0 && i != 0) or	(if i != 0)
////		3)		출력문(print(i + "\t")
//		
//		for(int i = 0; i <= 50; i+=2) {
//			if(i != 0) {
//				System.out.println(i*2);
//			}
//		}
//	
//		//A~F 출력
		for(char c = 'A'; c <= 'F'; c++) {//for 반복문 시작, 문자형 변수 c가 A 로 선언, 문자형 변수 c가 F이하일때까지 반복문 
											//반복시마다 문자형 변수 c 1씩 증가
			System.out.println(c);		//문자혀 변수 c 출력
		}	//for문 종료
		int al = 'F'; //65~70	//정수형 변수 al 선언후 값 F 대입
		System.out.println(al);	// 정수형 변수 al 출력, F는 정수값으로 70
		for(int i = 0; i < 6; i++) {	//반복문 시작, 정수형 변수 i 선언후 i가 6보다 작을때 i가 반복마다 1씩 증가
			System.out.println((char)(i+65)); //정수형 변수 i에 65를 더한후 정수값을 문자형으로 형변환후 출력
		}
		
		//aBcDeFgHiJkLmNoPqRsTuVwXyZ 출력
		for(int i = 0; i < 26; i++) {//반복문 for문 시작, 정수형 변수 i 0으로 선언, 0부터 26 미만 까지 반복, 반복시마다 i 1씩 증가 
//			if(i % 2 == 0) {
//				System.out.print((char)(i+97));
//			}else {
//				System.out.print((char)(i+65));
//			}
			System.out.print((char)(i % 2==0? i+97:i+65));
			//만약 정수형 변수 i가 2로 나누었을때 나머지가 0이라면 정수형 변수 i에 97을 더한후 문자형으로 형변환 한 값을 출력,
			//만약 정수형 변수 i가 2로 나누었을때 나머지가 0이 아니라면 정수형 변수 i에 65를 더한후 문자형으로 형변환 한 값을 출력
			
		}//for반복문 종료
	}	//메인메소드 종료
}//ForTest03 클래스 종료











