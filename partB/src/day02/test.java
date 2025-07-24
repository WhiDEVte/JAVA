package day02;

public class test {
    public static void main(String[] args) {

        System.out.println(MyCalculator1.powerOfTwo(7)); // 8


    }

}

class MyCalculator1 {
    // 2의 n승 계산하기(n=0일 때 결과는 1)
    static int powerOfTwo(int count) {
        int result = 1;
        for (int i = 0; i < count; i++) {
            result = result * 2;
        }
        return result;

    }
}