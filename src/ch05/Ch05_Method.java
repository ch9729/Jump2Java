package ch05;

class Sample {
    // 매개변수 = 메서드에 전달된 입력값을 저장하는 변수
    int sum(int a, int b) {
        return a + b;
    }
    
    //리턴값이 없는 메서든
    void sum2(int a, int b) {
        System.out.println(a + "와" + b + "의 합은" + (a+b) + "입니다.");
        System.out.printf("%d와 %d의 합은 %d입니다. \n",a,b,(a+b));
    }
    
    //입력은 없고 문자열  Hello가 반환됨
    String say() {
        return "Hello";
    }

    //입력과 리턴이 없는 메서드
    void hello() {
        System.out.println("hi");
    }

    //리턴으로 빠져나오기 (메서드에서 리턴을 만나면 종료됨)
    void sayNick(String name) {
        if("바보".equals(name) || "멍청이".equals(name)) {
            return; //만약 인수가 바보이면 return으로 sayNick메서드를 빠져나온다.
        }
        System.out.println("나의 별명은 " + name + "입니다.");
    }
    
    //메서드 안에 선언 변수 효력범위(메서드 안에서만 사용)
    int varTest(int a) {
        a++;
        return a;
    }
}

public class Ch05_Method {

    public static void main(String[] args) {
        Sample sample = new Sample();
    
        //인수 = 메서드를 호출할 때 전달하는 입력값
        int c = sample.sum(3, 4);

        System.out.println(c);

        String n = sample.say();
        System.out.println(n);

        sample.sum2(3, 4);

        sample.hello();
        
        sample.sayNick("바보");       //출력x
        sample.sayNick("멍청이");      //출력x
        sample.sayNick("천재");

        int a = 1;
        a = sample.varTest(a);
        System.out.println(a);
    }
}
