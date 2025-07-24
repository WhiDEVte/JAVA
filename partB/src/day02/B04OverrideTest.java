package day02;
/*
 * 오버라이드는 클래스의 '상속' 관련 개념입니다.
 * 자바의 모든 클래스는 Object라는 이름의 최상위 클래스로를 자동 상속받습니다.
 * Object는 몇가지 기본 메소드를 갖고 있는데, 이것을 새로운 클래스를 만들면서 변경할 수 있는데
 * 그것이 오버라이드 입니다.
 */
public class B04OverrideTest {
    public static void main(String[] args) {

        Score2 momo = new Score2();
        
        momo.name = "모모";
        momo.kor = 99;
        momo.eng = 89;
        momo.math = 88;

        System.out.println("momo 의 정보 : " + momo);
        System.out.println("---" + momo.name + " , " + momo.kor + " , " + momo.eng + " , " + momo.math);
    }
}


class Score2{
    String name;
    int kor;
    int eng;
    int math;

    // Object 부모 클래스의 메소드 : clone(), hashcode(), equals(), toString()

    // toString() 은 오버라이드(재정의). @Override 는 실행코드가 아니라 개발관련 주석

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "---" + name + " , " + kor + " , " + eng + " , " + math;
    }
    
}   // Score 끝 (Scope - 범위)
/*
 *  정리 :
 *  Score2 momo = new Score2();
 *  String sana = "sana";
 * 
 *  아래의 2줄은 모두 momo.toString(), sana.toString() 을 실행합니다.
 *  기본적으로 객체참조변수.toString()은 참조값을 출력.
 *  toString() 을 재정의(오버라이드)하면 출력 문자열을 바꿀 수 있어요
 *  String 클래스는 이미 toString() 메소드가 재정의 되어서 문자열이 출력됩니다.
 *  개바자가 만든 클래스는 개발자가 재정의 합니다.
 * 
 *  System.out.println(momo)
 *  system.out.println(sana) 
 * 
 */