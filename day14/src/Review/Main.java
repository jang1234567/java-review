package Review;

public class Main {
	public static void main(String[] args) {
		//익명클래스로 계산기 생성
		Cal cal = new Cal() {

			@Override
			public int add(int num1, int num2) {
				int result1 = num1 + num2;
				return result1;
			}

			@Override
			public int sub(int num1, int num2) {
				int result2 = num1 - num2;
				return result2;
			}			
		};
		
		
		
		//계산기 메소드 2개 출력
		System.out.println(cal.add(10,20));
		System.out.println(cal.sub(30,20));
	}
}
