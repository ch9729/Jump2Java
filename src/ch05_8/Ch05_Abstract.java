package ch05_8;

//추상 클래스 : abstract 키워드를 클래스 앞에 적음
abstract class Animal {
    //필드 변수
    int a = 0;
    String k = "동물";

    //추상 메서드
    public abstract void color();
    public abstract void height();

    //일반 메서드
    public void printName(String name) {
        System.out.println(name);
    }
}

//추상클래스를 상속받은 클래스는 추상 메서드를 구현해야함
class Cat extends Animal {
    @Override
    public void color() {
        System.out.println("고양이 색");
    }

    @Override
    public void height() {
        System.out.println("고양이 키");
    }
}

public class Ch05_Abstract {

    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.color();
        cat.height();
        cat.printName("고양이");
    }
}
