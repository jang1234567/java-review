package method;

public class MethodTask {
	String printName() {
//		System.out.println("장윤근");
		return "장윤근";
		}
	
	int add() {
		int result = 0;
		for(int i = 1; i < 101; i++) {
			result += i;
			}
		return result;
	}
	
	int sum(int number1, int number2, int number3, int number4, int number5) {
		int result = number1 + number2 + number3 + number4 + number5;
		return result;
	}
	
	public static void main(String[] args) {
		MethodTask mt = new MethodTask();
		//1. 이름을 넘겨받아 1.~님 안녕하세요 5번 출력하는 메소드
		//메소드명 : printName()
		String name = mt.printName();
		for(int i = 0; i < 5; i++) {
			System.out.println(name + "님 안녕하세요");
		}
		
		
		
		
		//2. 1~100까지의 합을 반환하는 메소드
		int number = mt.add();
		System.out.println(number);
		
		//3. 5개의 정수를 넘겨주면 합을 반환하는 메소드
		
		int number2 = mt.sum(10,20,30,40,50);
		System.out.println(number2);
		
	}
}
