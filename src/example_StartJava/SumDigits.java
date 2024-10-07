package example_StartJava;

public class SumDigits {

    public static void main(String[] args) {
        int num = 374;
        int oneDigit = num / 100;
        int twoDigit = num / 10 % 10;
        int threeDigit = num % 10;

        int total = oneDigit + twoDigit + threeDigit;

        System.out.println("총합 : " + total);

    }
}
