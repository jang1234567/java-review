package abstractTest;

public class AbstractTest {//AbstractTest 클래스 시작
	public static void main(String[] args) {	//메인메소드 시작
		ClassA a = new ClassB();  //업캐스팅 => 부모클래스인 추상클래스a 타입에 자식값 ClassB 대입
		ClassB b = new ClassB();	// 일반 객체화
		
		System.out.println(a);//a 의 주소값
		System.out.println(b);//b의 주소값
		
		a.method1();//오버라이딩한 메소드 호출
		//=> up casting으로 자식 참조값을 저장했다면 자식클래스에서 오버라이딩한 기능이 실행된다
		//=> 자식 클래스에서 새로 구현한 기능들은 사용 할 수 없다
		a.method2();
		b.method1(); 
		b.method2();//부모타입의 메소드 호출
	}	//메인메소드 종료
}//AbstractTest 클래스 종료
