package control;

public class WhileTest01 { //WhileTest01클래스 시작
	public static void main(String[] args) { //메인메소드 시작
		int cnt = 1;	//정수형 변수 cnt선언후 1 대입
		System.out.println(cnt < 5); //정수형 변수 cnt가 5보다 작다면 true 작지 않다면 false
		while (cnt < 6){ //while 반복문 시작, 정수형 변수 cnt다 6보다 작다면 반복문 실행 
			System.out.println("안녕하세요"); //정수형 변수 cnt다 6보다 작다면 "안녕하세요" 출력
//			cnt += 1; 
			System.out.println(cnt++); //정수형 변수 cnt 1씩 증가시킨다음 출력
//			break;
		}	//while 반복문 종료
	}	// 메인메소드 종료
}	//WhileTest01클래스 종료

