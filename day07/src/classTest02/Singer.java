package classTest02;

public class Singer { //클래스 시작
	//필드
	String artist;
	String title;
	String album;
	
	//메소드
	//정보출력 메소드
	void artistInfo() { //리턴타입X 매개변수 X
		System.out.println("노래 제목 : " + title);
		System.out.println("가수명 : " + artist);
		System.out.println("앨범명 : " + album);
	}
}
