package ch07_3;

class Counter {
    //static변수는 공유됨 (클래스 변수)
    static int count = 0;

    public Counter() {
        count++;
        System.out.println(count);
    }
    
    //메서드 앞에 static 붙고 객체 상관없이 사용가능
    public static int getCount() {
        return count;
    }

    public static void main(String[] args) {
        getCount();
    }
}

public class Ch07_StaticVariable {

    public static void main(String[] args) {
        //스테틱변수(클래스변수)는 객체 만들기 전에 이미 있음
        Counter.count= 10;
        System.out.println(Counter.getCount());
        Counter c1 = new Counter();
        Counter c2 = new Counter();
        Counter c3 = new Counter();
        System.out.println(Counter.getCount());
    }
}
