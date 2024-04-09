package accessTask;

public class MainTask {//클래스 시작
	public static void main(String[] args) {//메인메소드 시작
		//Cat클래스의 객체 생성
		Cat cat = new Cat();
		cat.name = "네로";
		cat.setColor("검정");
//		cat.getColor();
		
//		cat.play();//private이기 때문에 객체에서 바로 호출 불가
		//private이 아닌 다른 메소드에서 호출후 그 메소드를 객체가 호출하면 사용가능(캡슐화)
		cat.scratch();//private메소드인 play()가 여기서 실행
	}//메인메소드 종료
}//클래스 종료
