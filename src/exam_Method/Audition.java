package exam_Method;

public class Audition {

    public static void main(String[] args) {
        double tomVocal = 8.8;
        double tomDance = 7.6;
        double kateVocal = 9.2;
        double kateDance = 7.8;

        System.out.println("Tom의 오디션 결과: " + test(tomVocal, tomDance));
        System.out.println("Kate의 오디션 결과: " + test(kateVocal, kateDance));
    }

    private static String test(double vocal, double dance) {
        return (vocal*dance >=70.0) ? "합격" : "불합격";
    }
}
