package method;

public class MethodTest01 { //클래스 시작

	//10을 더해주는 메소드
	int addTen(int num)  //선언부, 반환타입 : 정수, 메소드명 addTen 선언, 매개변수 정수형 변수 num으로 값 받아온다
	{	//구현부
		int result = num + 10;	//정수형 변수 result 선언후 매개변수 num으로 받아온 값에 10을 더한후 값 대입
		return result; //정수형 변수 result의 값 을 반환한다
	}
	
	public static void main(String[] args) { //메인메소드 시작영역
		MethodTest01 mt = new MethodTest01(); //클래스명 객체명 생성자
		System.out.println(mt);//객체의 주소값 출력
		System.out.println(mt.addTen(10));//객체의 메소드 addTen호출, 매개변수로 10 대입
		//메소드 호출(사용)시 빨간색 밑줄에러 해결방법
		//1) 메소드 선언 부에 static 키워드를 붙히는 방법
		//2) 메인 메소드안에서 클래스의 참조변수를 만들고 참조변수를 이용하는 방법
		
	} //메인메소드 종료영역

} //클래스 종료











