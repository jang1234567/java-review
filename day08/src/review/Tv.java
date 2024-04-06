package review;

public class Tv { //Tv클래스 시작
	//필드
	int ch;	// 정수형 변수 ch선언
	int vol;	//정수형 변수 vol선언
	boolean power;	//논리형 변수 power선언
	String color;	//문자열 변수 color선언
	
	//메소드
	void powerOnOff() { //매개변수와 리턴타입이 없는 메소드 구현
		System.out.println("Tv 전원을 켜고 끕니다.");
	}
	
	void chUp() {//매개변수와 리턴타입이 없는 메소드 구현
		System.out.println("현재 채널 : " + ch);
		System.out.println("Tv의 채널을 1올립니다. " + ++ch);
		//채널을 1 올리기위하여 전위 증감연산자 사용
	}
	
	void chDown() {//매개변수와 리턴타입이 없는 메소드 구현
		System.out.println("현재 채널 : " + ch);
		System.out.println("Tv의 채널을 1내립니다. " + --ch);
		//채널을 1 내리기위하여 전위 증감연산자 사용
	}

	
	//생성자 : alt + shift + s + o
	//생성자 오버로딩 : 같은 이름의 생성자로 매개변수의
	//타입, 개수, 순서가 다르면 선언이 가능하다
	public Tv() {	//기본 생성자 생성
		
	}

	public Tv(int ch, int vol, boolean power, String color) 
	//모든 필드를 초기화하는 생성자 생성(생성자 오버로딩)
	{
		this.ch = ch;	//각자 자신의 객체의 각자 자신의 ch값 저장
		this.vol = vol;	//각자 자신의 객체의 각자 자신의 vol값 저장
		this.power = power;//각자 자신의 객체의 각자 자신의 power값 저장
		this.color = color;//각자 자신의 객체의 각자 자신의 color값 저장
		//각각의 객체의 각각의 값을 저장하기 위하여 this 사용
	}

	public Tv(int ch, int vol, boolean power)
	//3개의 필드 ch,vol,power만 초기화하는 생성자 생성(생성자 오버로딩)
	{
		super();	//부모의 생성자를 호출함 
		this.ch = ch;
		this.vol = vol;
		this.power = power;
	}

	public Tv(boolean power, int ch, int vol, String color)
	//모든 필드를 초기화하는 생성자 생성
	//위에도 모든 필드를 초기화하는 생성자가 있지만 순서가 다르기에
	//생성자 오버로딩으로 동일한 이름을 가진 생성자를 만들수 있다
	{
		super();
		this.ch = ch;
		this.vol = vol;
		this.power = power;
		this.color = color;
	}
	
}//Tv클래스 종료






















