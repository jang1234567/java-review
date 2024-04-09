package ThingTask;

public class Book extends Things{ //Things클래스를 상속받는 Book클래스
	//필드
	String author;

	
	//생성자
	public Book(String name, String author) {
		super(name);//부모의 필드를 이용하여 값 대입
		this.author = author;
	}

	//메소드
	//부모클래스의 메소드를 재정의
	@Override
	void printInfo() {
		System.out.println("책이름 : " + super.name);//부모의 필드를 사용하였지만 this를 써도 똑같다
		System.out.println("저자 : " + this.author);
	}
}//클레스 종료



















