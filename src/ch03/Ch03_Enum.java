package ch03;

public class Ch03_Enum {
    //enum : 서로 연관 있는 여러개의 상수 집합을 정의
    enum CoffeeType {
        AMERICANO,
        ICE_AMERICANO,
        CAFE_LATTE
    }

    public static void main(String[] args) {
        System.out.println(CoffeeType.AMERICANO);
        System.out.println(CoffeeType.ICE_AMERICANO);
        System.out.println(CoffeeType.CAFE_LATTE);

        //반복문
        for (CoffeeType type : CoffeeType.values()) {
            System.out.println(type);
        }
    }
}
