package animalTest;

public class AnimalMain {//클래스 시작
	public static void main(String[] args) {//메인메소드시작

		//객체 2개 생성하고 메소드 호출
		Animal cat = new Animal();//기본 생성자로 받는 객체 생성
		cat.printAnimal();
		//이름과 나이와 종을 받는 생성자로 객체 생성
		Animal dog = new Animal("멍멍이", 2, "골든리트리버");
		System.out.println(dog.eat("개껌"));

	}//메인메소드 종료
}//클래스 종료
