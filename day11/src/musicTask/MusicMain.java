package musicTask;

public class MusicMain {
	public static void main(String[] args) {
	
		MusicMain mm = new MusicMain();
		mm.check(new HipHop());
		mm.check(new Rock());
		
	}
	
	void check(Music music) {
		if(music instanceof Ballad) {
			Ballad ballad = (Ballad)music;
			ballad.mode();
			ballad.onlyBallad();
		}else if(music instanceof HipHop) {
			HipHop hiphop = (HipHop)music;
			hiphop.mode();
			hiphop.onlyHipHop();
		}else if(music instanceof Rock) {
			Rock rock = (Rock)music;
			rock.mode();
			rock.onlyRock();
		}
	}
}
