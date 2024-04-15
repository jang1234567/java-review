package marvelheroes;

public class IronMan extends Hero{//Hero를 상속

	//부모클래스의 메소드 오버라이딩
	@Override
	public void useSuperpower() {
		System.out.println(getName() + "빔 발사");
	}
	//부모클래스의 메소드 오버라이딩
	@Override
	public void sayCatchphrase() {
		// TODO Auto-generated method stub
		super.sayCatchphrase();
	}
	

}//클래스 종료
