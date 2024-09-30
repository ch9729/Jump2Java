package ch03;

public class Ch03_Number {

    public static void main(String[] args) {

        // 정수
        int age = 10;
        long count = 2154848489456464655L;

        float pi = 3.14f;
        double pi2 = 3.14159265358979323846;

        int oxtal = 023;
        int hex = 0xc3;

        System.out.println(oxtal);
        System.out.println(hex);

        //숫자 연산(+, - , *, /) 사칙연산
        int a = 10;
        int b = 5;
        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a / b);
        System.out.println(a * b);
        System.out.println(a % b);  //나머지 연산
        System.out.println(7 % 3);
        System.out.println(3 % 7);


        //증감 연산자(++, --)    1씩 증가 또는 감소
        int i = 0;
        int j = 10;
        i++;
        j--;
        System.out.println(i);
        System.out.println(j);

        System.out.println(++i);
        System.out.println(j--);
        System.out.println(j);

        int x = i++;        //x는 2, i는 3
        int y = i + --j;    //i= 3, j=7

        System.out.println(x);
        System.out.println(y);
    }
}
