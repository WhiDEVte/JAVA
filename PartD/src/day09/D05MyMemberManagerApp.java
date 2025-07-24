package day09;

import java.util.List;
import java.util.ArrayList;

public class D05MyMemberManagerApp {
        public static void main(String[] args) {        
        List<Member> list = new ArrayList<>();
        System.out.println("회원 관리 프로그램입니다.");
        boolean status = true;
        while (status){
            System.out.println("작업 메뉴를 선택하세요.");
            System.out.println("[A] 회원 추가  [R] 회원 삭제   [U] 회원 포인트 변경  [S] 회원 목록  [E] 종료");
            String menu = System.console().readLine("선택 >>> ");
            
            switch (menu.toUpperCase()){
                case "A":
                    addMember(list);
                    break;
                case "R":
                    int index = Integer.parseInt(System.console().readLine("삭제할 인덱스 입력 >>>>>"));
                    System.out.println(index);
                    break;
                case "U":
                    index = Integer.parseInt(System.console().readLine("수정할할 인덱스 입력 >>>>>"));
                    System.out.println(index);
                    break;
                case "S":
                    
                    break;
                case "E":
                    status = false;
                    break;
            }
        }
    }

    private static void addMember(List<Member> list){
        int id = Integer.parseInt(System.console().readLine("\t고객 id 입력 >>> "));
        String name = System.console().readLine("\t고객 이름 입력 >>> ");
        Member m = new Member(id, name, 100);
        list.add(m);
    }

    private static boolean confirm(String task){
        String yn = System.console().readLine(task + " 을(를) 실행할까요?(확인:엔터, 취소:N)");
        // 엔터를 누르면 참 리턴
        return yn.length() != 0 && yn.toUpperCase().equals("N");
    }

}
