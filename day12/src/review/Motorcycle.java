package review;

public class Motorcycle extends Vehicle {
	//필드
	private int speed;

	@Override
	public void move() {
		System.out.println("오토바이가 이동합니다");
	}

	@Override
	public void setSpeed(int speed) {
		this.speed = speed;
		
	}

	@Override
	public int getSpeed() {
		return this.speed;
	}
	
	
}
