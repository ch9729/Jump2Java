package example_StartJava;

import java.util.Scanner;

public class SpeedConversion {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("몇미터 달렸습니까?");
        double meter = sc.nextDouble();
        System.out.print("몇 초만에 도착했습니까?");
        double sec = sc.nextDouble();

        double km = meter / 1000;
        double hour = sec / 3600;

        double sisok = km / hour;

        System.out.println(sisok + "km/h");
    }
}
