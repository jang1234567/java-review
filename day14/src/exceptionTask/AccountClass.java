package exceptionTask;

import throwTest.MyException;

public class AccountClass {
	// 은행계좌 클래스

	// 필드 : 잔고 balance
	private int balance;

	// 출금 메소드 : withdraw 매개변수 1개
	void withdraw(int num1) throws MyException{
		if (num1 > balance) {
			try {
				throw new MyException();
			} catch (MyException e) {
				e.printStackTrace();
			}
			System.out.println("출금불가! 현재 잔고는" + this.balance + "원 입니다");
			System.out.println("출금 금액의" + (num1 - this.balance) + "원이 부족하여 출금이 불가능 합니다");
		}else {
			System.out.println("정상 출금");
		}
	}
	//입금 메소드
	void deposit(int num2) {}
}
// 생성자
// 잔액보다 출금금액이 크
