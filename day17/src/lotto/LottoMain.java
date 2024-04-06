package lotto;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;

// 로또 번호 생성 프로그램
// 1. 1~45까지의 숫자 중 6개의 서로 다른 숫자를 무작위로 선택하여 로또 번호 생성한다
// HashSet<Integer>
// Random -> nextInt(45) + 1
public class LottoMain {
	static HashSet<Integer> lottoNumber() {
		HashSet<Integer> lotto = new HashSet<>();
		Random r1 = new Random();

		
		for (int i = 0; i < 6; i++) {
			int num = r1.nextInt(45) + 1;
			if (!lotto.contains(num)) {
				lotto.add(num);
				continue;
			}
			i--;
		}
		return lotto;
	}	
		
		// 2. 출력될 때 오름차순으로 정렬하여 출력한다
	static ArrayList<Integer> sortLotto(HashSet<Integer> lotto){
		ArrayList<Integer> list = new ArrayList<>(lotto);
		Collections.sort(list);
//		System.out.println(list);
		return list;
	}
		// Collections sort()
//		ArrayList<Integer> list = new ArrayList<>(lotto);
//		Collections.sort(list);
//		System.out.println(list);
		
	public static void main(String[] args) {
//		System.out.println(lottoNumber());
//		sortLotto(lottoNumber());
//		System.out.println(sortLotto(lottoNumber()));
		// 3. 사용자로부터 몇회차의 로또번호를 생성할지 입력받고 각 회차별로 생성된
		// 로또번호를 출력한다
		// 입력클래스, 입력메소드 nextInt(), 출력메시지
		Scanner sc = new Scanner(System.in);
		System.out.println("몇 회차의 로또 번호를 생성하시겠습니까?");
		int choice = sc.nextInt();
		//반복문 만큼 lottoNumber출력
		for(int i = 0; i < choice; i++) {
			System.out.println(sortLotto(lottoNumber()));
			
			
		}

	}
}