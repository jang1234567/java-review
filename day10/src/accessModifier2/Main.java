package accessModifier2;

import accessModifier.A;

public class Main {//클래스 시작
	public static void main(String[] args) {//메인메소드 시작
		A a = new A();//A클래스의 객체 생성
		Child c = new Child();//Child클래스의 객체 생성
		
		a.var1 = 9;
		System.out.println(a.var1);
		//Child클래스 객체의 메소드 호출
		c.method();
		
		System.out.println(a);//A클래스 객체의 주소값
		System.out.println(c);//Child클래스 객체의 주소값
		
	}//메인메소드 종료
}//클래스 종료
