package home03;

public class Ex02 {
	public static void main(String[] args) {
		
		//정수형 변수 선언 후 1대입
		//while반복문 사용
		//반복문안에 조건문으로  출력
		//반복문 종료후 후위 증감연산자 사용
		
		int num = 1;
		while(num < 101) {
			if(num % 7 == 0 && num % 5 != 0 ) {
			}else {
				System.out.println(num);
			} num++;
		}
	}

}
