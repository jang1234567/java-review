package classTest02;

public class MarvelMain {//클래스 시작
	public static void main(String[] args) {//메인메소드 시작
		MarvelHero ironMan = new MarvelHero("아이언맨", "에너지빔", 20);
		//객체선언후 생성자에 값 대입해서 초기화
		System.out.println(ironMan);//주소값 출력
		
		MarvelHero hulk = new MarvelHero();
		//객체 선언,기본 생성자
		System.out.println(hulk);//주소값 출력
		//ironman객체에 값 대입
		ironMan.name = "아이언맨";
		ironMan.superpower = "에너지 빔";
		ironMan.age = 40;
		//hulk객체에 값 대입
		hulk.name = "헐크";
		hulk.superpower = "근력파워";
		hulk.age = 35;
		//ironman객체의 메소드 호출
		ironMan.heroInfo();
		//hulk객체의 메소드 호출
		hulk.heroInfo();
		//hulk객체의 메소드 호출
		hulk.performAction();
		
		
	}//메인메소드 종료
}//클래스 종료
