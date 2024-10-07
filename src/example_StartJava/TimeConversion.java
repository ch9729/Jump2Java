package example_StartJava;

import java.util.Scanner;

public class TimeConversion {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("몇초 입니까?");
        int totalSec = sc.nextInt();

        int hour = totalSec / 3600;
        int min = totalSec % 3600 / 60;
        int sec = totalSec % 60;

        System.out.printf("%d시간 %d분 %d초",hour,min,sec);
    }
}
