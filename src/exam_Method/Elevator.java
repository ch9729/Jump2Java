package exam_Method;

public class Elevator {

    public static void main(String[] args) {
        int a = 13;
        int b = 7;
        int c = 10;

        System.out.printf("%d층 -> %s 엘리베이터\n",a,guide(a));
        System.out.printf("%d층 -> %s 엘리베이터\n",b,guide(b));
        System.out.printf("%d층 -> %s 엘리베이터\n",c,guide(c));
    }

    private static String guide(int a) {
        if(1 <=a && a <= 10){
            return "저층";
        }else if(11 <=a && a <= 20){
            return "고층";
        }else {
            return "";
        }
    }
}
