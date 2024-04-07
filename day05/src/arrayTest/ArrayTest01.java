package arrayTest;

public class ArrayTest01 {//ArrayTest01클래스 시작
	public static void main(String[] args) {//메인메소드 시작
		//1) 정수형 배열명 number1 선언하고 크기가 5인 배열 생성
//		자료형[] 배열명 = new 자료형[배열크기];
		int[] number1 = new int[5]; //정수형 배열 number1 선언후 크기가 5인 배열로 초기화
		System.out.println(number1);//정수형 배열이므로 number1의 주소값 출력
		System.out.println(number1[0]);//정수형 배열 number1의 인덱스 0번째 값 출력
		System.out.println(number1[1]);//정수형 배열 number1의 인덱스 1번째 값 출력
		
		//2) 문자열 배열명 cities 초기값 서울, 부산, 강원, 경기, 제주를 할당
		String[] cities = {"서울", "부산", "강원", "경기", "제주"};
//		문자열 배열 cities 선언후 문자열 값 대입
		System.out.println(cities);//문자열 배열 cities의 주소값 출력
		System.out.println(cities[0]);//문자열 배열 cities의 인덱스 0번째값 출력
		System.out.println(cities[1]);//문자열 배열 cities의 인덱스 1번째값 출력
		
		//3) 실수형 배열명 number2 크기가 3인배열생성하면서 
		//초기값 1.1, 2.2, 3.3 할당
		double[] number2; //실수형 배열 number2 선언
//		System.out.println(number2);
		number2 = new double[]{1.1, 2.2, 3.3}; //실수형 배열 number2에 실수형 값 대입
		System.out.println(number2);//실수형 배열number2의 주소값 출력
		System.out.println(number2[1]);//실수형 배열number2의 인덱스 1번째 출력
		
		//4) 몇칸인지도 모르고 어떤값이 들어갈지도 모를 때
		//자료형[] 배열명 = null;
		char[] data = null; //문자형 배열 data의 null 대입
//		System.out.println(data);
		//data = new char[] {'a','b'}; //문자형데이터의 크기가 2인 배열 선언
		data = new char[2]; //문자형데이터의 크기가 2인 배열 선언
		System.out.println(data);//값출력 공백
		System.out.println(data[0]);//공백출력
		
		
		System.out.println(number2);
		
	}//메인메소드 종료
}//ArrayTest02클래스 종료





















