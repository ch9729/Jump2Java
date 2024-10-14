package ch07.house;

public class HousePark {
    /* protected는 같은 패키지 + 상속 받은 클래스 */
    protected String lastName = "park";
    public static void main(String[] args) {

        //같은 패키지의 클래스는 import할 필요가 없다.
        HouseKim kim = new HouseKim();
        System.out.println(kim.lastName);
    }
}
