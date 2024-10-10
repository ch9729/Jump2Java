package ch05_7;

interface Predator {
    // 추상메서드(구현이 되지 않은 메서드로 {}가 없다.)
    String getFood();
}

class Animal {
    String name;

    public void setName(String name) {
        this.name = name;
    }
}

class Tiger extends Animal implements Predator {
    @Override
    public String getFood() {
        return "사과";
    }
}

class Lion extends Animal implements Predator {
    @Override
    public String getFood() {
        return "바나나";
    }
}

class ZooKeeper {
    public void feed(Predator p) {
        System.out.println("먹이주기 : " + p.getFood());
    }
}

public class Ch05_interface {

    public static void main(String[] args) {
        Tiger tiger = new Tiger();
        Lion lion = new Lion();
        ZooKeeper z = new ZooKeeper();
        z.feed(tiger);  //인터페이스 타입 객체 입력(구현한 클래스 객체)
        z.feed(lion);
    }
}
