package forTest;

public class Ex05_06 {
	public static void main(String[] args) {

		for (int i = 0; i < 4; i++) {

			for (int j = 0; j < 4 - i; j++) {
				System.out.print(1);
			}
			for (int k = 0; k < (2*i) + 1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
