package wrapperTest;

public class WrapperTask {
   public static void main(String[] args) {
      // 아래 값들을 하나의 배열에 담기, 단 String[] 사용 금지
      // 1, 3.14, 'a', "Cat", true
      // 배열명 : ar

      int num1 = 1;
      double num2 = 3.14;
      char data1 = 'a';
      String data2 = "Cat";
      boolean data3 = true;

      Object[] ar = new Object[] { num1, num2, data1, data2, data3 };
      System.out.println(ar);

      for (Object value : ar) {
         System.out.println(value);
      }

      Object[] ar2 = { 1, 3.14, 'a', "Cat", false };
      System.out.println(ar2);

   }
}
