package castingTest2;

public class CastingTest {
	public static void main(String[] args) {
		//객체화 작업(인스턴스화)
		//Person클래스의 객체 생성(부모)
		Person p1 = new Person("짱구", 5, "유치원생");
		//Student클래스의 객체 생성(자식)
		Student p2 = new Student("김영선", 20, "대학생", "코리아학교");
		//Employee클래스의 객체 생성(자식)
		Employee p3 = new Employee("홍길동", 40, "개발자", "코리아회사");
		
		//메소드 오버라이딩된 것으로 호출됨을 확인
//		p1.eat();
//		p2.eat();
//		p3.eat();
		
		System.out.println(p2);//주소값 출력
		
		printWalk(p1);
		printWalk(p2);
		printWalk(p3);
		
		
//		Person pr = new Student(null, 0, null, null); 부모타입의 객체에 자식의 참조값이 들어가면 업캐스팅
	}
	
	//매개변수 부모클래스 타입의 매개변수(들어오면서 자동 업캐스팅)
	static void printWalk(Person person) {//스태틱, 리턴타입 X, 매개변수 Person클래스 타입의 person
		if(person instanceof Student) {//person이 Student클래스 타입이라면
			((Student)person).walk();	//Student클레스 타입으로 다운캐스팅
		}else if(person instanceof Employee) {//person이 Employee타입이라면
			((Employee)person).walk();//Employee 클래스 타입으로 다운캐스팅
		}else { //전부 아니라면
			System.out.println("걷기싫어");//걷기 싫어 출력
		}
	}//메소드 구현 종료
	
}//클래스 종료























