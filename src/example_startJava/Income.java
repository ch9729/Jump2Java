package example_startJava;

import java.util.Scanner;

public class Income {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("월요일 수입 : $");
        double mon = sc.nextDouble();
        System.out.print("화요일 수입 : $");
        double tue = sc.nextDouble();
        System.out.print("수요일 수입 : $");
        double wen = sc.nextDouble();
        System.out.print("목요일 수입 : $");
        double thu = sc.nextDouble();
        System.out.print("금요일 수입 : $");
        double fri = sc.nextDouble();
        
        double sum = mon + tue + wen + thu + fri;

        System.out.printf("월요일부터 금요일까지 얻은 총 수입은 $%.2f입니다", sum);
    }
}
