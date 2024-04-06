package variable;

public class EscapeCharacter {	//EscapeCharacter 클래스의 시작 영역
   public static void main(String[] args) {	//메인메소드의 시작 영역
//      //\n : 줄바꿈
	  System.out.println("안녕하세요.\n반갑습니다.");
	  //안녕하세요.
	  //반갑습니다. 출력후 줄바꿈;
	  
     
//      //\t : 일정간격 띄우기(tab)
      System.out.println("안녕하세요.   오늘은 3월 11일입니다.");	//안녕하세요.   오늘은 3월 11일입니다. 출력후 줄바꿈;
      System.out.println("안녕하세요.\n\t오늘은 3월 11일입니다.");
      //안녕하세요.
//  			오늘은 3월 11일입니다. 출력후 줄바꿈;
      
      // \", \' : 강조표현시 주로 사용
      System.out.println("장윤근은 \"웹개발 공부\"를 열심히 합니다");	// 장윤근은 "웹개발 공부"를 열심히 합니다 출력후 줄바꿈;
      System.out.println("저는 '취업'을 꼭 할 겁니다!!");	// 저는 '취업'을 꼭 할 겁니다!! 출력후 줄바꿈;
      System.out.println("저는 \'취업\'을 꼭 할 겁니다!!");	// 저는 '취업'을 꼭 할 겁니다!! 출력후 줄바꿈;
      System.out.println('\'');// ' 출력후 줄바꿈;
      
      // \\ : 역슬래쉬 표현
      System.out.println("제어문자를 사용할 때는 \\를 이용한다");
      // 제어문자를 사용할 때는 \를 이용한다 출력후 줄바꿈;
      
   }	//메인메소드의 끝영역
}	//EscapeCharacter 클래스의 끝 영역

