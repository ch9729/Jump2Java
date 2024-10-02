package example_startJava;

import java.util.Scanner;

public class Inches2Centimeters {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final double inchToCm = 2.54;

        System.out.print("허리 둘레가 몇 인치 인가요?");
        double inch = sc.nextDouble();

        double cm = inchToCm * inch;
        System.out.println("허리 둘레는 " + cm + "cm입니다.");

    }
}
