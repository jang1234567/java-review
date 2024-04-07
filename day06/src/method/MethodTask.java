package method;

public class MethodTask {//MethodTask 클래스 시작
	String printName(){// 선언부 문자열 타입 반환 printName 메소드명 선언 매개변수 없음 {//구현부
//		System.out.println("장윤근");
		return "장윤근"; //장윤근이라는 문자열을 반환
		} //구현부 종료
	
	int add(){//선언부 정수형 타입 반환 메소드명 add 선언 매개변수 없음 { //구현부 시작
		int result = 0; //정수형 변수 result선언후 초기화
		for(int i = 1; i < 101; i++) { //반복문 for문 시작 /1부터 100까지 반복, 반복시 i 1증가
			result += i; //정수형 변수 result에 i 값 누적합
			}//for문 종료
		return result;//정수형 변수 result 반환
	}//구현부 종료
	
	int sum(int number1, int number2, int number3, int number4, int number5){//선언부 정수형 타입 반환 메소드명 sum 선언 매개변수 정수형 변수 5개 {
		int result = number1 + number2 + number3 + number4 + number5;//매개변수로 받아온 값을 모두 더한 값 정수형 변수 result에 대입
		return result;//정수형 변수 result 반환
	}//구현부 종료
	
	public static void main(String[] args) { //메인메소드 시작
		MethodTask mt = new MethodTask();	//클래스명 객체명 생성자
		//1. 이름을 넘겨받아 1.~님 안녕하세요 5번 출력하는 메소드
		//메소드명 : printName()
		String name = mt.printName(); //문자열 변수 name 선언후 값에 객체의 printName메소드의 리턴값을 대입
		for(int i = 0; i < 5; i++) {//반복문 i가 0부터 5보다 작을때까지 반복
			System.out.println(name + "님 안녕하세요");//출력
		}//for문 종료
		
		
		
		
		//2. 1~100까지의 합을 반환하는 메소드 
		int number = mt.add(); //정수형변수 number 선언후 객체의 add메소드의 리턴값 대입
		System.out.println(number);//정수형 변수 number 출력
		
		//3. 5개의 정수를 넘겨주면 합을 반환하는 메소드
		
		int number2 = mt.sum(10,20,30,40,50);//정수형변수 number2 선언후 객체의 sum메소드의 리턴값 대입 , 매개변수 값 대입
		System.out.println(number2);//정수형 변수 number2 출력
		
	}//메인메소드 종료
}//MethodTask종료
