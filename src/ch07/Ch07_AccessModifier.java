package ch07;

class Sample {
    private String secret;
    public String getSecret() {
        return secret;
    }

    public void setSecret(String secret) {
        this.secret = secret;
    }
}

public class Ch07_AccessModifier {
    private String password;
    public static void main(String[] args) {
        /* 접근 제어자 : 변수나 메서드에 사용권한을 설정 */
        /* private < default < protected < public */

        Ch07_AccessModifier ch = new Ch07_AccessModifier();
        ch.password = "1234";
        
        Sample sample = new Sample();
        //sample.secret private라서 접근불가
        sample.setSecret("비밀");
        String n = sample.getSecret();
        System.out.println(n);
    }
}
