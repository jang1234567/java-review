package task01;

public class Main {
//	1. 
//	Food 추상 클래스
//	추상 메소드
//	   calculatePrice()  음식의 가격을 계산하여 반환
//		getFoodName()추상클래스에서 구현되지 않은 음식이름을 반환하는 메소드
//	일반 메서드
//	   display()    
//	   "주문한 음식: [음식 이름], 가격: [음식 가격]" 음식정보 출력
//
//	Burger, Pizza, Salad 클래스
//	   Food 추상 클래스를 상속하는 서브클래스
//	   각 클래스는 추상 메서드를 오버라이딩하여 음식의 가격 출력
//	 // 추상 메소드인 getFoodName()을 오버라이딩하여 햄버거의 이름을 반환하는 로직을 구현
//	 // 추상 메소드인 calculatePrice()를 오버라이딩하여 가격을 계산하는 로직을 구현
//
//	Main 클래스
//	   Burger, Pizza, Salad 클래스의 인스턴스 생성
//	   각 음식의 속성을 설정
//	   display() 메서드를 호출하여 각 음식의 정보를 출력
//	   calculatePrice() 메서드를 호출하여 각 음식의 가격 출력

	public static void main(String[] args) {
		Salad s1 = new Salad("닭가슴살 샐러드", 8900);
		Pizza p1 = new Pizza("고구마 피자", 6900);
		Burger B1 = new Burger("핫크리스피 버거", 7900);
		s1.display();
		p1.display();
		B1.display();
	}
}
