package lambdaTask;

public class Main {

	public static void main(String[] args) {
		MultipleInter result = calculater(true);
		System.out.println(result);
		int result2 = result.mul(10, 15);
		System.out.println(result2);
	}
	// 두수의 곱을 구하는 프로그램
	// 익명클래스 객체 생성
//		MultipleInter m1 = (num1, num2) -> num1 * num2;

	static MultipleInter calculater(boolean a) {
		MultipleInter m2 = null;
		if (a) {
			m2 = (num1, num2) -> num1 * num2;
		} else {
			m2 = (num1, num2) -> 0;
		}
		return m2;

	}

}
