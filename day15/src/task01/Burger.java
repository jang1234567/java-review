package task01;

public class Burger extends Food {
	//필드
	String burgerName;
	int burgerPrice;

	//생성자
	public Burger(String burgerName, int burgerPrice) {
		this.burgerName = burgerName;
		this.burgerPrice = burgerPrice;
	}

	@Override
	String getFoodName() {
// 추상 메소드인 getFoodName()을 오버라이딩하여 햄버거의 이름을 반환하는 로직을 구현
		return burgerName;
	}

	@Override
	int calculatePrice() {
		
		return burgerPrice;
	}

	

}
