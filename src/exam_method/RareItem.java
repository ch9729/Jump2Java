package exam_method;

public class RareItem {

    public static void main(String[] args) {
        wear(2400, 2000);
        wear(3800, 1200);
    }

    private static void wear(int hp, int mp) {
        if(hp >= 2000 & mp >= 2000) {
            System.out.println("아이템 장착 완료!");
        }else {
            System.out.println("아이템을 착용할 수 없습니다.");
        }
    }
}
