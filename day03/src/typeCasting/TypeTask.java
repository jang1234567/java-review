package typeCasting;

public class TypeTask {	//Typetask클래스의 시작 영역
   public static void main(String[] args) {	//메인메소드의 시작 영역
      //1. 올해 년도, 월, 일을 정수형타입의 변수로 만들고
      //올해는 0000년, 0월, 0일 입니다 형태로 출력하기
      
//      변수선언(정수형 변수 3개)
//      출력(변수 + 연결)
      int year = 2024, month = 3, date = 12;	//정수형 변수 year 선언후 2024대입,정수형 변수 month선언후 3대입, 정수형 변수 date선언후 12 대입
      System.out.println("올해는 " + year + "년, " + month + "월, " + date + "일입니다");
      //올해는 2024년, 3월, 12일입니다 출력후 줄바꿈
      
      //2. 올해 년도를 문자열로 만든 변수 year2를 선언하고
      //24라는 값만 출력하기
      
//      문자열타입 year2 변수(값 year + "")
//      문자형타입 변수(2개 index2, index3 저장) charAt()
//      출력
      String year2 = year + ""; //문자열 변수 year2선언후 정수형 변수 year를 문자열로 형변환후 대입
      System.out.println(year2);	//year2의 값을 출력후 줄바꿈
      char ch1 = year2.charAt(2);	//문자형 변수 ch1 선언후 문자열 변수 year2의 인덱스 2번째 값을 대입
      char ch2 = year2.charAt(3);	//문자형 변수 ch2 선언후 문자열 변수 year2의 인덱스 3번째 값을 대입
//      System.out.print(ch1);
//      System.out.print(ch2);
      System.out.printf("%c%c", year2.charAt(2), year2.charAt(3));
      // 문자열 변수 year2의 인덱스 2번째값과 3번째 값을 출력
      
      //3. 1번에서 만든 변수들중 월, 일을 문자열로 바꿔서
      // result 변수에 저장하고 실수(3.12)로 변환하여 출력하기
      
//      변수 2개선언(String 타입)
//      변수선언(변수명 result 타입 String 값 문자열)
//      실수로 Double.parseDouble(result)
      
      String month1 = month + ".";	//문자열 변수 month1을 선언후 정수형 변수 month를 문자열로 형변환 후 대입
      String date1 = date + "";		//문자열 변수 date1을 선언후 정수형 변수 date를 문자열로 형변환 후 대입
      System.out.println("\n"+month1 + date1);	// 줄바꿈 + month1과 date1연결한 값을 출력후 줄바꿈
      String result1 = month1 + date1;	//문자열 변수 result1을 선언후 month1과 date1을 연결한 값을 대입
      Double result = Double.parseDouble(result1);	//실수형 변수 result를 선언후 문자열 변수 result1을 실수형 으로 형변환 후 대입
      System.out.println(result);	//result의 값을 출력후 줄바꿈
   }	//메인메소드의 끝 영역
}	//TypeTask의 끝 영역

