package ch05_7;
//인터페이스는 다중상속
interface Predator {
    // 추상메서드(구현이 되지 않은 메서드로 {}가 없다.)
    String getFood();

    //default 메서드(구현된 메서드 (앞에 default를 작성))
    default void printFood(){
        System.out.printf("내 사료는 %s이다\n",getFood());
    }
}

class Animal {
    String name;

    public void setName(String name) {
        this.name = name;
    }
    
    //다형성 : 하나의 객체가 여러 자료형 타입 Tiger과 Line은 Animal 타입 선언
    //Tiger과 Line타입의 메서드를 따로 만들 필요가 없다.
    //instanceof는 실제객체가 클래스타입과 동일하면 true 아니면 false
    // void barkAniaml(Animal animal) {
    //     if(animal instanceof Tiger) {
    //         System.out.println("어흥");
    //     }else if(animal instanceof Lion) {
    //         System.out.println("으르렁");
    //     }

    void barkAnimal(Barkable animal) {
        animal.bark();
    }
}

class Tiger extends Animal implements Predator, Barkable {
    @Override
    public String getFood() {
        return "사과";
    }

    @Override
    public void bark() {
        System.out.println("어흥");
    }
}

class Lion extends Animal implements Predator, Barkable {
    @Override
    public void bark() {
        System.out.println("으르렁");
    }

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

interface Barkable {
    void bark();
}

public class Ch05_interface {

    public static void main(String[] args) {
        Tiger tiger = new Tiger();
        Lion lion = new Lion();
        ZooKeeper z = new ZooKeeper();
        z.feed(tiger);  //인터페이스 타입 객체 입력(구현한 클래스 객체)
        z.feed(lion);

        Predator p1 = new Tiger();
        p1.printFood();     //디폴트 메서드
        Predator p2 = new Lion();
        p2.printFood();

        Animal animal = new Animal();
        animal.barkAnimal(tiger);
        animal.barkAnimal(lion);
    }
}
