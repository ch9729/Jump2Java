package ch05;

//부모 클래스
class Anima {
    String name;

    public void setName(String name) {
        this.name = name;
    }
}

//자식 클래스 (Animal 클래스를 상속받는다)
class Dog extends Anima {
    //생성자는 클래스명과 똑같고 리턴 타입이 없다.
    Dog() {  //기본(디폴트)생성자 (생략 가능)
    }

    void sleep() {
        System.out.println(this.name + "는 잔다.");
    }
}

class HouseDog extends Dog {
    @Override
    void sleep() {      //오버라이딩 재정의
        System.out.println(this.name + "는 집에서 잔다.");
    }

    void sleep(int hour) {
        System.out.println(this.name + "는 집에서 " + hour + "시간 잔다.");
    }
}

public class Ch05_Inheritance {
//자바는 다중상속이 불가능
    public static void main(String[] args) {
        Dog d = new Dog();
        d.setName("퍼피");
        System.out.println(d.name);
        d.sleep();

        Anima a = new Dog();    //상속관계일때 부모타입으로 선언가능

        //메서드 오버라이딩 : 상속 관계에 있는 부모 클래스에서 이미 정의된 메소드를 자식 클래스에서 재정의 하는 것
        HouseDog h = new HouseDog();
        h.setName("해피");
        h.sleep();

        //메서드 오버로딩 : 같은 이름의 메소드를 중복하여 정의하는 것(매개변수의 개수나 타입을 다르게 가능)
        h.sleep(3);
    }
}
