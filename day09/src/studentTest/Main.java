package studentTest;

public class Main {//클래스 시작
	public static void main(String[] args) {//메인메소드 시작
		Student st1 = new Student("장윤근", "컴공", 20, 2);
		//객체 생성 => 매개변수 4개를 받는 생성자로 호출, 값 기화
		System.out.println(st1);//주소값 출력
		
		System.out.println(st1.score);	
		//객체의 문자형 변수 score출력
		//객체의 매소드를 호출하지 않아서 점수를 알수 없음
		//출력해도 나오지 않는다
		
		//메소드 호출 -> 학점 출력
		double avg = st1.avgScore(33, 44);
		//객체st1의 메소드 호출 => 매개변수로 값 넘겨주고 리턴값을 실수형 변수 avg에 대입
		System.out.println(avg);//실수형 변수 출력
		//변수에 담지 않고 바로 출력
		System.out.println(st1.gradeScore(avg));
		
		System.out.println(st1.score);
		
	}//메인메소드 종료
}
