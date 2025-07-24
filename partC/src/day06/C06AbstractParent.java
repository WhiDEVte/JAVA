package day06;

public class C06AbstractParent {
    public static void main(String[] args) {
        // 추상클래스 부모는 직접 객체 생성 못함
        // Animal ani = new Animal(1, "동물", "화이트");    // 오류

        Animal ani1 = new Cat(1, "소금이", "그레이");
        System.out.println(ani1);                    // toString 출력
        ani1.sound();                                // 추상 메서드 호출
        System.out.println(ani1.todo("낮잠 자기"));  // 추상 메서드 구현 호출
    }
}

abstract class Animal {
    private int id;
    protected String name;
    protected String color;

    Animal(int id, String name, String color) {
        this.id = id;
        this.name = name;
        this.color = color;
    }

    abstract void sound();  // 소리 추상 메서드

    abstract String todo(String task); // 할 일 추상 메서드

    @Override
    public String toString() {
        return String.format("Animal[id=%d, name=%s, color=%s]", id, name, color);
    }
}

class Cat extends Animal {
    Cat(int id, String name, String color) {
        super(id, name, color);
    }

    @Override
    void sound() {
        System.out.println(name + "가 야옹~ 하고 울어요.");
    }

    @Override
    String todo(String task) {
        return name + "는 " + task + " 중입니다.";
    }
}
