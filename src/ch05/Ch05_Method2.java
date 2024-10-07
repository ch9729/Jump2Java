package ch05;

class Sample2 {
    int a;  //변수

    void varTest(Sample2 s /* = x001*/) {
        s.a++;  //x001 의 a값인 1을 2로 증가
    }
}

class Counter {
    int count = 0;
}

class Updater {
    void update(Counter c) {
        c.count++;
    }
}

public class Ch05_Method2 {

    public static void main(String[] args) {
        Sample2 s1 = new Sample2(); //x001
        Sample2 s2 = new Sample2();

        s1.a = 1;   //x001의 a값은 1
        s2.a = 2;
        s1.varTest(s1);
        s2.varTest(s2);
        System.out.println(s1.a);
        System.out.println(s2.a);

        Counter counter = new Counter(); //x001
        System.out.println("Before count: " + counter.count);
        Updater updater = new Updater();    //x002
        updater.update(counter);
        System.out.println("After count: " + counter.count);
    }
}
