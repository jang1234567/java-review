package task01;

public abstract class Food {
//	Food 추상 클래스
//	추상 메소드
//	   calculatePrice()  음식의 가격을 계산하여 반환
//		getFoodName()추상클래스에서 구현되지 않은 음식이름을 반환하는 메소드
//	일반 메서드
//	   display()    
//	   "주문한 음식: [음식 이름], 가격: [음식 가격]" 음식정보 출력
	
	
	//메소드
	//음식 가격 계산 반환 메소드
	abstract int calculatePrice();
	//음식이름을 반환하는 메소드
	abstract String getFoodName();
	void display() {
		System.out.println("주문한 음식 : " + getFoodName()
					+ " 음식 가격 : " + calculatePrice());
	}
	
	

}
