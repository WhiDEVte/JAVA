package day07;

public class B07AbleTest {
    public static void main(String[] args) {
        someday(new AI("GPT"));
        tomorrow(new Dog());
        // 인터페이스 구현하는 익명 클래스 정의
        Cookable robot = new Cookable(){
            @Override
            public void cook(String material){
                System.out.println(material + "인스턴트 요리를 합니다.");
            }
        }
    }
}
