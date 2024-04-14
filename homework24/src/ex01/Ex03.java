package ex01;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Ex03 {
    public static void main(String[] args) {
        // 임의의 문자열 리스트 생성
        List<String> stringList = new ArrayList<>();
        stringList.add("apple banana cherry");
        stringList.add("pineapple banana cherry ");
        stringList.add("apple banana cherry");

        // 모든 단어를 저장할 Set 생성
        Set<String> wordSet = new HashSet<>();

        // 각 문자열을 공백을 기준으로 단어로 분리하여 Set에 추가
        for (String str : stringList) {
            String[] words = str.split(" ");
            for (String word : words) {
                wordSet.add(word);
            }
        }

        // 중복되지 않는 모든 단어의 개수 출력
        System.out.println("중복되지 않는 모든 단어의 개수: " + wordSet.size());
    }
}
