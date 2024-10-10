package eaxm_Modifier;

import java.util.HashMap;

public class MapExample {

    public static void main(String[] args) {
        HashMap<String, String> emails = new HashMap<String, String>();
        emails.put("홍팍", "sehong@cloudstudying.kr");
        emails.put("나리", "nari@cloudstudying.kr");
        emails.put("정애", "jungae@cloudstudying.kr");

        System.out.println("emails.size() -> " + emails.size());
        System.out.println("==key set==");
        for (String key : emails.keySet()) {
            System.out.println(key);
        }

        System.out.println("==values==");
        for (String value : emails.values()) {
            System.out.println(value);
        }
    }
}
