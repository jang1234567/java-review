package classTest;

public class StudentMain {//클래스 시작
	public static void main(String[] args) {//메인메소드 시작
		
		Student st1 = new Student();//st1객체생성
		System.out.println(st1);//st1의 주소값 출력
		Student st2 = new Student();//st2객체생성
		System.out.println(st2);//st2의 주소값 출력
		
		//st1객체의 값 대입
		st1.name = "장윤근";
		st1.math = 90;
		st1.eng = 0;
		st1.kor = 100;
		
		System.out.println(st1.name);//st1객체의 name 출력
		System.out.println(st1.math);//st1객체의 math 출력
		
		System.out.println(st2.name);//st2객체의 name 출력
		System.out.println(st2.math);//st2객체의 math 출력
		

		//st1의 총합 구하기
		System.out.println(st1.math + st1.eng + st1.kor);
		//st1의 총합 메소드 호출
		System.out.println(st1.getTotal());
		//st2의 총합 메소드 호출
		System.out.println(st2.getTotal());
		
		//st1의 평균 구하기 메소드 호출
		System.out.println(st1.getAvg());
		
	}//메인메소드 종료
}	//클래스 종료










