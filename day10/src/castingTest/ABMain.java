package castingTest;

public class ABMain {
	public static void main(String[] args) {
		A a = new A();
		System.out.println(a);
		B b = new B();
		System.out.println(b);
		A ab = new B(); //업캐스팅
		System.out.println(ab);
		
		System.out.println(a instanceof A);//true
		System.out.println(a instanceof B);//a는 부모클래스의 객체이므로 false
		System.out.println(b instanceof B);//true
		System.out.println(b instanceof A);//b는A의 자식클래스이므로 True
		
	}
}
