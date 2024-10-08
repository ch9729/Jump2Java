package ch05_6;

class Animal {

    public Animal() {
        System.out.println("Animal 객체 생성");
    }

    String name;

    public void setName(String name) {
        this.name = name;
    }
}

class Dog extends Animal {
    public Dog() {
        System.out.println("Dog 객체 생성");
    }

    void sleep() {
        System.out.println(this.name + "잔다.");
    }
}

class HouseDog extends Dog {
    public HouseDog(String name) {
        this.setName(name);
    }
    
    //타입을 결정하는 생성자
    public HouseDog(int type) {
        if(type == 1) {
            this.setName("요크셔");
        }else if(type == 2) {
            this.setName("진돗개");
        }
    }

    @Override
    void sleep() {
        System.out.println(this.name + " 집에서 잔다.");
    }
}

public class Ch05_Constructor {

    public static void main(String[] args) {
        Dog d = new Dog();
        //디폴트생성자가 아닌 다른 생성자가 하나라도 존재하면 디폴트 생성자는 만들수 없다.
        HouseDog h1 = new HouseDog("해피");
        HouseDog h2 = new HouseDog(1);

        System.out.println(h1.name);
        System.out.println(h2.name);
    }
}
