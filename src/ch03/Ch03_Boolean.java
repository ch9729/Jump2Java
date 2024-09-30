package ch03;

public class Ch03_Boolean {

    public static void main(String[] args) {
        //boolean: 참 또는 거짓

        boolean isSuccess = true;   //1
        boolean isTest = false;     //0
        //참 또는 거짓을 판단하는 연산
        //조건문에 사용하거나 불타입에 대입
        System.out.println(2 > 1);
        System.out.println(2 < 1);
        System.out.println(3 % 2 == 1);

        //조건문에 사용
        int base = 180;
        int h = 179;
        boolean isTall = h > base;  //h가 더 크면 참

        //if문에는 조건이 참일대만 적용
        if(isTall) {
            System.out.println("키가 더 큽니다.");
        }else {
            System.out.println("키가 더 작습니다.");
        }
    }
}
