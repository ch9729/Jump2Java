package example_startJava;

import java.util.Scanner;

public class Bills {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("만원권은 몇장 있나요?");
        int man = sc.nextInt();
        System.out.print("오천원권은 몇장 있나요?");
        int oh = sc.nextInt();
        System.out.print("천원권은 몇장 있나요?");
        int chen = sc.nextInt();

        int total = (man*10000)+(oh*5000)+(chen*1000);

        System.out.printf("%d원", total);
    }
}
