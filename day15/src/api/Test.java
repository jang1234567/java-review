package api;

public class Test {
	public static void main(String[] args) {
		ApiTest2 at = new ApiTest2();
		System.out.println(at);
		
		//alt + shift + z
		try {
			at.div(10, 0);
		} catch (ArithmeticException e) {
			// TODO Auto-generated catch block
//			e.printStackTrace();
			System.out.println(e.toString());
			System.out.println(e.getMessage());
			System.out.println("0으로 나눌수 없습니다");
		}
		
		System.out.println("출력끝");
		//예외처리
	}

}
