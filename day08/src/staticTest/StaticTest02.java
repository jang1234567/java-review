package staticTest;

public class StaticTest02 {//클래스 시작
	public static void main(String[] args) {//메인메소드 시작
		//다른 클래스에서 instance 멤버를 사용하는 경우 
		AClass a = new AClass();
		//AClass의 객체 a 생성
//		System.out.println(a.iVar);
		a.iVar = 5; //객체 a의 정수형 변수에 5 저장
//		a.iMethod1();
		
		//다른 클래스에서 static 멤버를 사용하는 경우 객체를 이용하는 것은 권장하지 않는다
		a.sVar = 15;//객체 a의 static 변수 sVar에 15 대입
		System.out.println(a.sVar);
		a.sMethod1();//객체a의 스태틱 메소그 호출
		
		//클래스 명을 이용하여 static 멤버에 접근하는 것을 권장한다
		AClass.sMethod1(); //AClass의 스태틱 메소드 호출
		AClass.sVar = 250;//AClass의 스태틱 변수에 250 대입
		System.out.println(AClass.sVar);
	}//메인메소드 종료
}//클래스 종료









