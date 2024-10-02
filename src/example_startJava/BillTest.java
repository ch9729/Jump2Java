package example_startJava;

public class BillTest {

    public static void main(String[] args) {
        int price = 152365;

        int oman = price / 50000;
        int man = price % 50000 / 10000;
        int ochnu = price % 50000 / 5000;
        int chun = price % 50000 / 1000;

        //총 지폐 개수
        int totalCun = oman + man + ochnu + chun;

        //나머지 값 (1000원 이하는 버림)
        int discounted = price % 50000 % 1000;

        //나머지 버림 값 제외한 값
        int totalPrice = price - discounted;

        System.out.printf("5만원 x %d\n", oman);
        System.out.printf("1만원 x %d\n", man);
        System.out.printf("5천원 x %d\n", ochnu);
        System.out.printf("1천원 x %d\n", chun);
        System.out.println("-----------------");
        System.out.printf("총 장수: %d장\n", totalCun);
        System.out.printf("금액 : %d원\n", totalPrice);
        System.out.printf("할인: %d원\n", discounted);
    }
}
