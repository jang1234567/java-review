package employee;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class EmployeeMain {
	public static void main(String[] args) {
		// HashMap생성
		HashMap<String, String> list = new HashMap<>();
//		1. 회사의 사원들의 정보를 HashMap에 저장한다
//		HashMap의 Key는 사원의 ID(String)
//		Value는 이름, 나이, 부서로 설정
//		조건1. 새로운 사원정보를 추가
//		001, 짱구, 5, "영업부"
//		002, 철수, 5, "개발부"
//		003, 유리, 5, "사업부"
		list.put("001", "짱구" + " 5" + "영업부");
		list.put("002", "철수" + " 5" + "개발부");
		list.put("003", "유리" + " 5" + "사업부");
		System.out.println(list);

//		조건2. 특정 ID의 사원 정보를 조회
		System.out.println(list.get("002"));
//		조건3. 모든 사원의 정보를 출력
//		entrySet 메소드사용
		Set<Entry<String, String>> all = list.entrySet();
		for (Entry<String, String> entry : all) {
			System.out.println(entry);
		}
//		조건4. 특정 ID의 사원 정보를 삭제
		list.remove("003");
		System.out.println(list);

//		조건5. 모든 사원 정보를 삭제
//		clear 메소드 사용
		list.clear();
		System.out.println(list);

	}

}
