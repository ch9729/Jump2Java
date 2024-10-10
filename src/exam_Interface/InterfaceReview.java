package exam_Interface;

import java.util.ArrayList;

interface Sounding {
    public void sound();
}

class Dog implements Sounding {
    @Override
    public void sound() {
        System.out.println("Dog: 멍멍");
    }
}

class Baby implements Sounding {
    @Override
    public void sound() {
        System.out.println("Baby: 응애");
    }
}

class Tiger implements Sounding {
    @Override
    public void sound() {
        System.out.println("Tiger: 어흥");
    }
}

class Robot implements Sounding {
    @Override
    public void sound() {
        System.out.println("Robot: 삐빕");
    }
}

public class InterfaceReview {

    public static void main(String[] args) {
        Dog dog = new Dog();
        Baby baby = new Baby();
        Tiger tiger = new Tiger();
        Robot robot = new Robot();

        ArrayList<Sounding> list = new ArrayList<Sounding>();
        list.add(dog);
        list.add(baby);
        list.add(tiger);
        list.add(robot);

        for (Sounding sounding : list) {
            sounding.sound();
        }
    }
}
