package day09;

import java.util.*;
// Set : 집합.  동일한 값의 데이터는 중복없이 저장
//      HashSet, LinkedHashSet, TreeSet 구현 클래스
public class D06SetTest {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        // 1. 데이터 추가
        set.add("sana");
        set.add("momo");
        set.add("nana");
        set.add("sana");

        // 2. set 의 크기
        System.out.println("set 크기 : " + set.size());

        // 3. toString 출력
        set.add("dahyeon");
        System.out.println("set : " + set);

        // 오류 : 인덱스로 접근하는 get 메소드 없습니다.
        // for(int i=0; i<set.size(); i++)
        //      set.get(i);
        System.out.println("반복문 없이");
        for (String s : set){
            System.out.println(s);
        };

        // HashSet 은 해시테이블에서 데이터를 저장/관리
        // LinkedHashSet 은 '다음 입력값의 주소' 포인터
        Set<String> linkSet = new LinkedHashSet<>();

        System.out.println("LinkedHashSet 데이터");
        linkSet.add("sana");
        linkSet.add("momo");
        linkSet.add("nana");
        linkSet.add("sana");
        linkSet.add("dahyeon");

        System.out.println(linkSet);

        // 데이터 제거 : 값으로 제거
        linkSet.remove("momo");
        linkSet.remove("nana");
        System.out.println(linkSet);

        // 데이터 제거 : 값으로 제거
        boolean result = link;
        System.out.println("확인 출력 : " + linkSet);

        // 8. TreeSet : 이진 트리 탐색이 가능한 자료구조(정렬)
        Set<String> treeSet = new TreeSet<>(set);
        System.out.println("TreeSet --------");
        System.out.println(treeSet);
    }
}
