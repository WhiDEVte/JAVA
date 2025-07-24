package day09;

import java.util.List;
import java.util.ArrayList;

public class test {
    public static void main(String[] args) {
        List<Member> list = new ArrayList<>();
        System.out.println("회원 관리 프로그램입니다.");
        System.out.println("[A] 회원 추가  [R] 회원 삭제   [U] 회원 포인트 변경  [S] 회원 목록  [E] 종료");
        String menu - System.console().readLine("선택 >>> ");

        switch(menu.toUpperCase()){
            case "A":
                addMember(list);
                break;
            case "N":
                String find = System.console().readLine("조회할 이름 입력");
                for(int i=0; i<list.size(); i++){
                    Member m = list.get(i);
                    if(m.getName().contains(find)){
                        System.out.println("\t" + i + ": " + m);
                    }
                }
                break;
            case "R":            
                int index = Integer.parseInt(System.console().readLine("삭제할 인덱스"));
                if (confirm("회원 삭제")){
                    Member m = list.remove(index);
                    System.out.println("삭제 데이터 확인 :" + m);
                }else{
                    System.out.println("삭제 취소합니다.");
                }
                break;
            case "U":
                index = Integer.parseInt(System.console().readLine("수정할 인덱스"));
                double point = Double.parseDouble(System.console().readLine("포인트"))
                if(confirm("포인트 변경")){
                    list.get(index).setPoint(point);
                    System.out.println("업데이트 결과 :");
                }
                System.out.println(index);
                break;
            case "S":
            case "E":
        };
    }
    
}
