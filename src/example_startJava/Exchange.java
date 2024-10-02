package example_startJava;

import java.util.Scanner;

public class Exchange {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("쓰지 못한 유로는 얼마인가요? ");
        int euro = sc.nextInt();
        System.out.print("쓰지 못한 달러는 얼마인가요? ");
        int dollar = sc.nextInt();

        double euroToKwnRate = 1281.62664;
        double dollarToKwnRate = 1091.70306;

        int KorEuro = (int)(euro*euroToKwnRate);
        int KorDollar = (int)(dollar*dollarToKwnRate);

        int kwn = KorEuro + KorDollar;

        System.out.printf("환전 결과: %d원",kwn);
    }
}
