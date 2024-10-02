package example_startJava;

import java.util.Scanner;

public class AverageWeight {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("1월의 몸무게는 얼마인가요?");
        double a = sc.nextDouble();
        System.out.print("2월의 몸무게는 얼마인가요?");
        double b = sc.nextDouble()+0.71;
        System.out.println("3월의 몸무게는 얼마인가요?");
        double c = b-0.43;

        double totalWeight = (a+b+c)/3;

        System.out.printf("%.2fkg", totalWeight);
    }
}
