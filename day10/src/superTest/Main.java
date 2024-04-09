package superTest;

public class Main {//클래스 시작
	public static void main(String[] args) {//메인메소드 시작
//		부모클래스의 객체 생성
		Parents p1 = new Parents(100);
		System.out.println(p1);
		System.out.println(p1.pVal);
		
		
		System.out.println("===================");
//		자식클래스의 객체 생성
		Child c1 = new Child(200, 22);
		System.out.println(c1);
		System.out.println(c1.pVal);//부모클래스에서 정수형 변수 pval = val이라고 생성자에서 초기화함
		System.out.println(c1.chVal);
		c1.chMethod1();
	}//메인메소드 종료
}//클래스 종료
