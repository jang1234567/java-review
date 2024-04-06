package typeCasting;

public class CastingTest01 { //CastingTest01 클래스의 시작 영역
   public static void main(String[] args) {	//메인메소드의 시작 영역
      //자동형변환
      //정수(int 4) 값 -> 정수(long 8) 저장공간
      int iNum = 3;	//정수형 변수 iNum 선언후 3대입;
      long lNum = iNum;	//정수형(long) 변수 lNum선언후 iNum대입;
      //대입연산자 오른쪽에 있는 변수명은 값으로 해석할 수 있어야한다!
      System.out.println(iNum);	//iNum값 출력후 줄바꿈;
      System.out.println(lNum);	//lNum값 출력후 줄바꿈;
      
      //정수(long 8) 값 -> 정수(int 4) 저장공간 => 자동형변환 불가
      long lNum2 = 3L; //정수형(long) 변수 lNum2선언후 3L대입;
//      int iNum2 = lNum2; 강제형변환으로 가능하다
      
      //실수(float 4) 값 -> 실수(double 8) 저장공간
      float fNum1 = 3.14f; //실수형 변수 fNum1 선언후 3.14f 대입;
      double dNum1 = fNum1;	//실수형 변수 dNum1 선언후 fNum1 대입;
      System.out.println(fNum1); //float
//      3.14 출력후 줄바꿈;
      System.out.println(dNum1); //double 소수점 15자리
//      3.140000104904175 출력후 줄바꿈;
      
      //실수(double 8) 값 -> 실수(float 4) 저장공간 => 자동형변환 불가
      double dNum2 = 3.14;	//실수형 변수 dNum2 선언후 3.14 대입;
//      float fNum2 = dNum2;
      
      
      
   } // 메인메소드 끝 영역
}	//CastingTest01 클래스의 끝 영역
