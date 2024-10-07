package exam_Array;

public class WeightAfterFiveMonths {

    public static void main(String[] args) {
        //입력값 받기
        double start = 72.4;
        int after = 5;

        //계산
        double result = weight(start, after);

        //결과 출력
        System.out.printf("%d개월 후 예상 몸무게 => %.2fkg",after,result);
    }

    private static double weight(double currentWeight, int months) {
        double expectedWeight = currentWeight;
        for(int i = 1; i <= months; i++) {
            expectedWeight += 0.231;
        }
        return expectedWeight;
    }
}
