package musicInter;

public class MusicMain {
	public static void main(String[] args) {
		
		check(new Ballad());
		check(new HipHop());
		check(new Rock());
//		Music mu = new Music(); // 부모타입 부모 값
//		Music music = new Ballad(); //부모 타입 자식 값 => 사용가능한 메소드?
//		Music mu2 = new Rock(); //부모 타입 자식 값 => 사용가능한 메소드?
			
	}
	
	static void check(Music music) {
		music.mode(); //mode 오버라이딩 => 업캐스팅되어도 오버라이딩 된 메소드가 호출된다
		if(music instanceof Ballad) {
			((Ballad)music).onlyBallad();
		}else if(music instanceof HipHop) {
			((HipHop)music).onlyHipHop();
		}else if(music instanceof Rock) {
			((Rock)music).onlyRock();
		}
		
	}
}
