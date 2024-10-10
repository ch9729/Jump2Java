package eaxm_Modifier;
//https://blog.naver.com/drv98/222021904573 참고공부
import java.util.HashSet;
import java.util.TreeSet;

public class SetExample {

    public static void main(String[] args) {
        TreeSet<String> names = new TreeSet<String>();

        names.add("Daniel");
        names.add("Brian");
        names.add("Eugene");
        names.add("Adam");
        names.add("Cate");

        System.out.printf("names.size() -> %d\n", names.size());
        System.out.printf("names.first() -> %s\n", names.first());
        System.out.printf("names.last() -> %s\n", names.last());

        System.out.println("=========================");
        for (String name : names) {
            System.out.println(name);
        }
    }
}
