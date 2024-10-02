package example_startJava;

import java.util.Scanner;

public class Ex1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("정수 a값을 입력하세요 : ");
        int a = sc.nextInt();
        System.out.print("정수 b값을 입력하세요 : ");
        int b = sc.nextInt();

        int mul = a * b;
        int divide = a / b;
        int ader = a % b;

        System.out.printf("곱한값은 %d입니다.\n",mul);
        System.out.printf("나눈값은 %d입니다.\n",divide);
        System.out.printf("나머지는 %d입니다.",ader);
    }
}
