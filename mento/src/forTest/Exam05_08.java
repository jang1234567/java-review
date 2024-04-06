package forTest;

import java.util.Scanner;

public class Exam05_08 { //Exam05_01클래스 시작
	public static void main(String[] args) {	//메인메소드 시작
		// 숫자 맞추기 게임
		int magicNumber = (int) (Math.random() * 50) + 1;
		//정수형 변수 magicNumber선언후 Math.random메소드로 50까지의 수 중 랜덤으로 하나 저장 => random메소드가 double타입을 반환하므로
		// int타입으로 형변환후 정수형 변수 magicNumber에 저장
//		System.out.println(magicNumber);
		Scanner sc = new Scanner(System.in);//입력클래스 호출
		boolean ismatched = false;	//논리형 변수 ismatched에 선언후 false값으로 초기화

		for (int i = 0; i < 10; i++) { //반복문 i가 0부터 10까지 반복시마다 i 1씩 증가
			System.out.println("찾는 숫자를 입력하세요"); //출력문
			int guess = sc.nextInt();	//입력받은 정수값 정수형 변수 guess선언후 저장
			if (guess == magicNumber) { //조건문 입력받은값 guess와 랜덤으로 저장한 변수 magicNumber가 서로 같을시
				System.out.println(i + 1 + "번째에 맞췄습니다"); // 몇번째에 맞췄는지 출력 => i가 0부터이기 떄문에 + 1
				break;	//반복문을 즉시 종료한다
			} else if (guess > magicNumber) {//조건문 입력받은값 guess가 랜덤으로 저장한 변수 magicNumber보다 클때
				System.out.println("맞춰야할 숫자가 더 작습니다");
			} else if (guess < magicNumber) {//조건문 입력받은값 guess보다 랜덤으로 저장한 변수 magicNumber가 클때
				System.out.println("맞춰야할 숫자가 더 큽니다");
			}
		}
		if(ismatched) { //만약 논리형 변수 ismatched라면 => 값이 false이다
			System.out.println("정답을 맞추지 못하였습니다");
		}
	}

}
