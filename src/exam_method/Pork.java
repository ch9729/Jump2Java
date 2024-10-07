package exam_method;

public class Pork {

    public static void main(String[] args) {
        int n = 3;

        double result = caloriceCalculator(n);
        System.out.printf("삼겹살 %d인분: %.2f kcal", n, result);
    }

    private static double caloriceCalculator(int n) {
        return 5.179* 180 * n;
    }
}
