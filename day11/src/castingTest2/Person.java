package castingTest2;

//슈퍼클래스
public class Person {//클래스 시작
	//필드
	String name;
	int age;
	String job;
	
	//생성자
	//모든 매개변수 다 받는 생성자 1개
	public Person(String name, int age, String job) {
		super();//최상위 클래스 Object클래스 호출
		this.name = name;
		this.age = age;
		this.job = job;
	}

	//메소드
	void eat() { //리턴타입X 매개변수X
		System.out.println(this.name + "은/는 밥을 먹는다");
	}


}//클래스 종료
