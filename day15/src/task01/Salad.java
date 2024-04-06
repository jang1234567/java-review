package task01;

public class Salad extends Food{
	//필드
	String saladName;
	int saladPrice;
	
	//생성자
	public Salad(String saladName, int saladPrice) {
		this.saladName = saladName;
		this.saladPrice = saladPrice;
	}
	

	@Override
	int calculatePrice() {
		
		return saladPrice;
	}

	@Override
	String getFoodName() {
		
		return saladName;
	}

	
}
