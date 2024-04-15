package enumTest;

public class EnumTest02 {
	enum Color{
		RED,
		GREEN,
		BLUE,
		BLACK
	}
	
	public static void main(String[] args) {//메인메소드 시작
		//values() : enum 유형에 속한 모든 상수를 배열로 반환
		Color[] colors = Color.values();
		System.out.println(colors);//배열의 주소값
		for(Color i : colors) {
			System.out.println(i);
		}//반복문을 이용하여 배열안의 값 나열
		
		//valueOf(String name) : 주어진 문자열에 해당하는 열거형 상수를 반환
		//입력한 문자열이 해당 열거형에 존재하지 않는경우 IllegalArgumentException 예외가 발생한다
		String colorStr = "BLUE";
		Color blueColor = Color.valueOf(colorStr);
		System.out.println(blueColor);
	}//메인메소드 종료
}//EnumTest2클래스 종료
