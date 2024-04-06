package task01;

public class Pizza extends Food{
	//필드
	String pizzaName;
	int pizzaPrice;
	
	//생성자
	public Pizza(String pizzaName, int pizzaPrice) {
		this.pizzaName = pizzaName;
		this.pizzaPrice = pizzaPrice;
	}

	@Override
	int calculatePrice() {
		
		return pizzaPrice;
	}

	@Override
	String getFoodName() {
		
		return pizzaName;
	}
	

	
}
