package task04;

import java.util.Scanner;

public class Ex05 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("정수를 입력해주세요:");
        if (sc.hasNextInt()) { // 사용자 입력이 정수인지 확인
            int num = sc.nextInt();
            fizzBuzzCheck(num);
        } else {
            System.out.println("숫자가 아닌 문자열이 입력되었습니다.");
        }
        sc.close(); // 스캐너 닫기
    }

    public static void fizzBuzzCheck(int num) {
        if (num % 3 == 0 && num % 5 == 0) {
            System.out.println("FizzBuzz");
        } else if (num % 3 == 0) {
            System.out.println("Fizz");
        } else if (num % 5 == 0) {
            System.out.println("Buzz");
        } else {
            System.out.println(num);
        }
    }
}
