package example_startJava;

import java.util.Scanner;

public class Profile {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("이름을 입력하세요 : ");
        String name = sc.nextLine();
        System.out.print("나이를 출력하세요 : ");
        int age = sc.nextInt();
        System.out.print("키를 입력하세요 : ");
        int tall = sc.nextInt();
        System.out.print("자바 입문 여부를 출력하세요 : ");
        boolean ox = sc.nextBoolean();

        System.out.println("이름:" + name);
        System.out.println("나이:" + age);
        System.out.println("신장:" + tall);
        System.out.println("입문자입니까?:" + ox);

        
    }
}
