package map;

import java.util.HashMap;
import java.util.Scanner;

public class HashMapTask {
//   카페메뉴
//   아메리카노 2000원
//   카페라떼 2500원
//   바닐라라떼 4000원
//   초코라떼 4000원

//   HashMap에 저장하기
//   출력과 입력
//   1. 아메리카노
//   2. 카페라떼
//   3. 바닐라라떼
//   4. 초코라떼
//   번호를 선택하세요 : 2
//   카페라떼의 가격은 2500원 입니다

	public static void main(String[] args) {
//	   입력스캐너 호출
		Scanner sc = new Scanner(System.in);
//	   입력받을 정수를 위한 출력문
		System.out.println("1. 아메리카노");
		System.out.println("2. 카페라떼");
		System.out.println("3. 바닐라라떼");
		System.out.println("4. 초코라떼");
		System.out.println("번호를 선택하세요");
		// 입력받은 정수 정수형 변수에 저장
		int num = sc.nextInt();
		// HashMap 생성
		HashMap<String, Integer> map = new HashMap<>();
		// 추가
		map.put("아메리카노", 2000);
		map.put("카페라떼", 2500);
		map.put("바닐라라떼", 4000);
		map.put("초코라떼", 4000);
//		System.out.println(map);
		// 조건문 작성
		switch (num) {
		case 1:
			System.out.println("아메리카노의 가격은 " + map.get("아메리카노") + " 입니다");
			break;
		case 2:
			System.out.println("카페라떼의 가격은 " + map.get("카페라떼") + " 입니다");
			break;
		case 3:
			System.out.println("바닐라라떼의 가격은 " + map.get("바닐라라떼") + " 입니다");
			break;
		case 4:
			System.out.println("초코라떼의 가격은 " + map.get("초코라떼") + " 입니다");
			break;
		default:
			System.out.println("번호를 다시 입력해주세요");
			break;
		}

	}
}