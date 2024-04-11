package castingTest2;

public class Employee extends Person {//Person클래스를 상속받는 employee클래스 시작
	// 필드
	String workSpace;

	// 생성자
	public Employee(String name, int age, String job, String workSpace) {
		super(name, age, job);//person클래스의 필드를 받는다
		this.workSpace = workSpace;
	}

	// 메소드
	// 메소드 오버라이딩
	@Override
	void eat() {//Person클래스의 메소드 재정의
		System.out.println(this.name + "은/는 " + this.workSpace + "에서 밥을 먹는다");
	}

	void walk() {
		System.out.println(this.name + "은/는 " + this.workSpace + "로 출근한다");
	}

}//클래스 종료
