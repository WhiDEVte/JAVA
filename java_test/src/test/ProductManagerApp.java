package test;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ProductManagerApp {
    public static void main(String[] args) {
        List<Product> list = new ArrayList<>();
        initProductList(list); // 수정_1

        System.out.println("ㅁㅁㅁㅁ 상품 관리 프로그램입니다. ㅁㅁㅁㅁ");
        boolean status = true;
        while (status) {
            System.out.println("\n 작업 메뉴를 선택하세요.");
            System.out.println("[A] 상품 추가   [R] 상품 삭제   [U] 가격 변경   \n"
                    + "[L] 전체 상품 목록  [S] 상품 조회  [E] 종료  ");
            String menu = System.console().readLine("선택 >>> ");
            try {
                switch (menu.toUpperCase()) {
                    case "A":
                        addProduct(list);
                        break;
                    case "R":
                        int index = Integer.parseInt(System.console().readLine("\t삭제할 인덱스 입력 >>>>")); // 수정_2
                        if (confirm("삭제")) {
                            Product p = list.remove(index); // 수정_3
                            System.out.println("\t삭제 데이터 : " + p);
                        } else {
                            System.out.println("\t삭제를 취소했습니다.");
                        }
                        break;
                    case "U":
                        index = Integer.parseInt(System.console().readLine("\t수정할 인덱스 입력 >>>>"));
                        double price = Double.parseDouble(System.console().readLine("\t판매 가격 입력 >>>> ")); // 수정_4
                        if (confirm("포인트 변경")) {
                            Product p = list.get(index); // 수정_5
                            p.setPrice(price);
                            System.out.println("\t업데이트 결과 : " + p); // 수정_6
                        } else {
                            System.out.println("\t포인트 변경을 취소했습니다.");
                        }
                        break;
                    case "L":
                        System.out.println("\t\t상품 리스트");
                        for (int i = 0; i < list.size(); i++) // 수정_7
                            System.out.println("\t" + i + ": " + list.get(i));
                        break;
                    case "S":
                        String find = System.console().readLine("\t찾는 상품 제목 단어 입력 >>> "); // 수정_8
                        for (int i = 0; i < list.size(); i++) {
                            Product p = list.get(i); // 수정_9
                            if (p.getTitle().contains(find)) {
                                System.out.println("\t" + i + ": " + p);
                            }
                        }
                        break;
                    case "E":
                        status = false; // 수정_10
                        break;
                    default:
                        System.out.println("잘못된 메뉴 선택입니다.");
                        break;
                } // switch end
            } catch (Exception e) { // 수정_11
                System.out.println("숫자만 입력하세요.");
            }
        } // while end
    } //main end

    private static void initProductList(List<Product> list) {
        Product p1 = new Product(1212, "LG그램", 345600.0);
        Product p2 = new Product(2499, "LG스탠바이", 190100.0);
        Product p3 = new Product(1213, "삼성OLED", 554500.0);
        Product p4 = new Product(4546, "바디프랜드", 632000.0);
        list.add(p1);
        list.add(p2);
        list.add(p3);
        list.add(p4); // 수정_12
    }

    private static void addProduct(List<Product> list) {
        Random rnd = new Random(); // 수정_13
        int id = rnd.nextInt(8889) + 1111; // 1111 ~ 9999
        String title = System.console().readLine("\t상품 제목 입력 >>> ");
        double price = Double.parseDouble(System.console().readLine("\t상품 가격 입력 >>> "));
        if (confirm("상품 등록")) {
            Product p = new Product(id, title, price); // 수정_14
            list.add(p);
            System.out.println("\t등록 확인 : " + p);
        } else {
            System.out.println("\t등록 취소 했습니다.");
        }
    }

    private static boolean confirm(String task) {
        String yn = System.console().readLine(task + " 을(를) 실행할까요?(확인:엔터, 취소:N)   ");
        return yn.length() != 0 && yn.toUpperCase().equals("N") ? false : true;
    }
}
