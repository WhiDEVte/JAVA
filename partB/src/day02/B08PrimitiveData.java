package day02;

public class B08PrimitiveData {
    public static void main(String[] args) {
        System.out.println("데이터 타입별 크기");
        System.out.println("int : " + Integer.SIZE + "비트 , " + Integer.BYTES + "바이트");
        System.out.println("int : " + Integer.MIN_VALUE + " ~ " + Integer.MAX_VALUE);
        System.out.println("int : " + Long.SIZE + "비트 , " + Long.BYTES + "바이트");
        System.out.println("int : " + Long.MIN_VALUE + " ~ " + Long.MAX_VALUE);

        int a = 2147483647;
        int b = a + 1;
        System.out.println("b=" + b); // 비정상값 출력

        long c = a + 1L;
        // a + 1은 둘다 int이므로 int 계산, a+1L 와 같이 적어도 하나는 long 데이터로 해야 long 연산 합니다.
        System.out.println("long c :" + c);

        System.out.println("Math.addExact(a, 1L) : " + Math.addExact(a, 1L));
        System.out.println("Math.addExact(a, 1) : " + Math.addExact(a, 1)); // 예외 발생
    }

}
