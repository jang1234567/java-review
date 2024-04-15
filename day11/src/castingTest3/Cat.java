package castingTest3;

public class Cat extends Animal{//Animal클래스를 상속받는 Cat클래스 


	//메소드 오버라이딩
	@Override
	void crying() {	//Animal클래스 메소드 오버라이딩
		System.out.println("야옹!!");
	}
	
	//생성자
	public Cat(String name) {
		super(name);
	}

}//클래스 종료
