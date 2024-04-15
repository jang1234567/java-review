package marvelheroes;

public class SpiderMan extends Hero{//Hero를 상속

	//부모클래스의 메소드 오버라이딩
	@Override
	public void useSuperpower() {
		System.out.println(getName() + "거미줄 발사!");
	}
	//부모클래스의 메소드 오버라이딩
	@Override
	public void sayCatchphrase() {
		// TODO Auto-generated method stub
		super.sayCatchphrase();
	}
	//일반 메소드
	public void message() {
		System.out.println(getName() + " 사용가능");
	}
	

}//클래스 종료
