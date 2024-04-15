package marvelheroes;

public class Main {
	public static void main(String[] args) {
		//객체를 생성하고 슈퍼파워 사용
		Hero hero = new Hero();
		hero.setName("히어로");
		hero.useSuperpower();
		//다운캐스팅하는 메소드 호출
		downcasting(new Hulk());
		downcasting(new SpiderMan());
		
	}
	// 다운캐스팅 기능을 할 메소드
	public static void downcasting(Hero hero) {
		if(hero instanceof Hulk) {
			hero.setName("헐크");
			((Hulk)hero).message();
		} else if(hero instanceof SpiderMan) {
			hero.setName("스파이더맨");
			((SpiderMan)hero).message();
		}  
	}//메소드 종료

}//클래스 종료
