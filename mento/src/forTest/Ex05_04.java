package forTest;

import java.util.Scanner;

public class Ex05_04 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int dice1, dice2;
		int i = 0;

		boolean isMatched = true;
		while (isMatched) {

			System.out.print("주사위 1 : ");
			dice1 = sc.nextInt();
			if(dice1 > 6) {
				System.out.println("숫자를 다시 입력해주세요");
				return;
			}
			System.out.print("주사위 2 : ");
			dice2 = sc.nextInt();
			if(dice2 > 6) {
				System.out.println("숫자를 다시 입력해주세요");
				return;
			}
			i++;

			
			 if (dice1 == dice2) {
				System.out.println(i + "번째에 매칭이 완료되었습니다");
				System.out.println(dice1);
				System.out.println(dice2);
				break;
		}else {
			System.out.println(i + "번째에 매칭되지 않았습니다");
		}
			
		}
	}

}
