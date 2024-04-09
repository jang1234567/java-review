package accessModifier;

public class Main { //클래스 시작
	public static void main(String[] args) {//메인메소드 시작
		A a = new A();//A클래스의 객체 생성
		//public, default, protected
		//같은 패키지 내에 다른 클래스기 때문에 모두 접근가능
//		a.var1 = 10;
//		a.var2 = 20;
//		a.var3 = 30;
//		
//		System.out.println(a.var1);
//		System.out.println(a.var2);
//		System.out.println(a.var3);
		
		//같은 패키지 내에 다른 클래스에 있는 메소드
		//public, default, protected 접근 가능
		a.publicMethod();
		a.proMethod();
		a.defaultMethod();
		//A클래스의 private변수 사용방법
		System.out.println(a.getVar4());
		//set으로 값 선언, get으로 값 반환
		a.setVar4(40);
		System.out.println(a.getVar4());
		
	}//메인메소드 종료
}//클래스 종료


















