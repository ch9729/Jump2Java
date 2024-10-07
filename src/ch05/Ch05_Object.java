package ch05;

// 별도의 계산기 클래스
class Calculator {
    int result = 0; //변수

    //클래스 안의 함수를 메소드라고 한다.
    int add(int num) {  //메서드
        result += num;
        return result;
    }
}

class Animal {
    String name;

    public void setName(String name) {
        this.name = name;
    }
}

public class Ch05_Object {

    public static void main(String[] args) {
        Calculator cal1 = new Calculator(); //cal1 객체 생성
        Calculator cal2 = new Calculator(); //cal2 객체 생성

        System.out.println(cal1.add(3));
        System.out.println(cal1.add(4));

        System.out.println(cal2.add(3));
        System.out.println(cal2.add(8));

        //클래스로 객체 생성
        Animal cat = new Animal();  //클래스로 만든 객체를 인스턴스
        Animal dog = new Animal();  //클래스로 만든 객체를 인스턴스
        Animal horse = new Animal();  //클래스로 만든 객체를 인스턴스
        //위 3개는 서로 다른 참조값을 가지고 있는 객체

        cat.setName("고양이");
        System.out.println(cat.name);
        dog.setName("강아지");
        System.out.println(dog.name);
        horse.setName("말");
        System.out.println(horse.name);
    }
}
