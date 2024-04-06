package home03;

public class Ex01 {
	public static void main(String[] args) {
		//정수형 변수 선언후 1대입
		//while 반복문 사용
		//반복문 안에 조건문 적용(홀수만 출력할수있게)
		//반복문 종료후 후위형증감연산자 사용
		
		int num = 1;
		while(num<=10) {
			if(num % 2 == 1) {
				System.out.println(num);	
			} num++;
			
		}
	}

}
