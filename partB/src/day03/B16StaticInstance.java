package day03;

public class B16StaticInstance {
    public static void main(String[] args) {
        Counter c1 = new Counter();
        Counter c2 = new Counter();
        System.out.println(Counter.getCount());

    }
}
    /*
     * Counter.getCount() => 이 코드로 알 수 있는 내용은?
     *          get
     */
class Counter{
    private static int count = 0;
    private int num;
    
    public Counter(){   // 생성자 메소드 - new 연산할 때 실행. 리턴이 없습니다.
        count++;
    }

    public static int getCount(){
        return count;
    }

    // count 값을 리턴하는 getter 만들기 => 리턴 타입이 int
    
}