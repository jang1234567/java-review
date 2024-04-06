package print;

public class PrintTest03 {	//PrintTest03클래스의 시작영역
	public static void main(String[] args) {	//메인메소드의 시작 영역
		//서식문자의 옵션
		System.out.println("안녕하세요 500");
//		안녕하세요 500 출력후 줄바꿈;
		System.out.printf("%s %d\n","안녕하세요",500);
//		안녕하세요 500 출력;
		System.out.printf("%-10.2s,%d\n","안녕하세요",500);
//		안녕        ,500 출력;
		System.out.printf("%-10s,%010d\n","안녕하세요",500);
//		안녕하세요     ,0000000500 출력;
		System.out.printf("%5s\t\t%05d원","꼬북칩",2000);
//		  꼬북칩		02000원 출력;
	}	//메인메소드 끝 영역

}	//PrintTest03클래스의 끝 영역
