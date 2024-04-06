package print;

public class PrintTask { //PrintTask 클래스의 시작 영역
	public static void main(String[] args) {	//메인메소드 시작 영역
//      실습1 문자열을 수정하여 실행결과처럼 출력하세요
      //System.out.print("봄여름가을겨울");
      // 실행결과:
      // 봄
      //       여름
      // 가을
      //       겨울
      System.out.printf("봄\n\t여름\n가을\n\t겨울");
      
      
//      실습2
//      문자열타입 weather, 값은 맑음
//      정수형타입 month, 월
//      정수형타입 date, 일
//      실수형타입 max => 10.5253
//      실수형타입 min => 5.2535
      // 문자형 타입 요일
      
      String weather = "맑음";	//문자열 변수 weather 선언후 맑음 대입;
      int month = 3, date = 11;	//정수형 변수 month 선언후 3대입, 정수형 변수 date 선언후 11대입;
      double max = 10.5253;	// 실수형 변수 max 선언후 10.5253 대입;
      double min = 5.2535;	// 실수형 변수 min 선언후 5.2535 대입;
      char day = '월';	// 문자형 변수 day 선언후 월 대입;
      
      
      
//      변수를 이용해서 printf 값을 출력
//      월 일의 최고 기온은 00.00입니다
      System.out.printf("\n%d월 %d일의 최고 기온은 %.2f 입니다",month, date, max);
//      3월 11일의 최고 기온은 10.53 입니다 출력;
      
//      월 일의 최저 기온은 00.000입니다
      System.out.printf("\n%d월 %d일의 최저 기온은 %.3f 입니다",month, date, min);
//      3월 11일의 최저 기온은 5.254 입니다 출력;
      
//      오늘의 날씨는 "맑음"입니다
      System.out.printf("\n오늘의 날씨는 \"%s\" 입니다",weather);
//      오늘의 날씨는 "맑음" 입니다 출력;
      
      //월 일 요일의 날씨는 맑음입니다
      System.out.printf("\n%d월의 %d일 %c요일 날씨는 %s 입니다",month, date, day, weather); 
//      3월의 11일 월요일 날씨는 맑음 입니다 출력;

		
	} //메인메소드 끝 영역

}	//PrintTask 클래스의 끝 영역
