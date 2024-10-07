package example_StartJava;
//https://blog.naver.com/drv98/222021977059 참고공부
import java.util.Scanner;

public class Alba {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("시급이 얼마인가요?" );
        int a = sc.nextInt();
        System.out.print("몇시간동안 일하셨나요?" );
        int time = sc.nextInt();

        int pay = a * time;

        System.out.println("월급은 " + pay + "원입니다.");
    }
}
