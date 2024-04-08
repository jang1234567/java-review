package methodOverloding;

public class valueTest {//valueTest클래스 시작
	public static void main(String[] args) {	//메인메소드 시작
		valueTest vt = new valueTest(); 
		//클래스명 객체명 대입연산자 기본생성자
//		System.out.println(vt);
		
		int num = 1; 	//기본자료형
		int[] arr = {10}; //reference 타입
		
		//변수 자체를 보냄(call by value)
		vt.add_value(num); //101
		System.out.println(num); //1 : 값 변화가 없다
		
		//배열 자체를 보냄(call by reference)
		System.out.println(arr[0]); //1
		vt.add_reference(arr); //110
		System.out.println(arr[0]); //110 : 값이 변화한다
		
		
	}//메인메소드 종료
	
	void add_value(int num) { //리턴타입 없음, 메소드명 선언, 매개변수 정수형변수 num
		num += 100;//정수형 변수 num에 100 더한값 num에 저장
		System.out.println(num);
	}//구현부 종료
	
	void add_reference(int[] arNum) {//리턴 타입 없음, 메소드명 선언, 매개변수로 정수혀 배열 받기
		arNum[0] += 100;	//정수형 배열 arNum의 인덱스 0번째 값에 100 더한후 저장
		System.out.println(arNum[0]);
	}//구현부 종료
}//valueTest클래스 종료











