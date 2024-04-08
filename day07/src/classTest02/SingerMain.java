package classTest02;

public class SingerMain {
	public static void main(String[] args) {
		//객체 생성
		Singer s1 = new Singer();
		System.out.println(s1);//s1의 주소값 출력
		//객체에 값 대입
		s1.title = "노래제목";
		s1.artist = "가수이름";
		s1.album = "앨범명";
		//객체의 메소드 호출
		s1.artistInfo();
		
	}//메인메소드 종료
}//클래스 종료
