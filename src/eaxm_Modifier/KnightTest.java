package eaxm_Modifier;

class Knight {
    private String name;
    private int hp;

    public Knight(String name, int hp) {
        this.name = name;
        this.hp = hp;
    }

    //get 저장된 값을 가져오기
    //set 값을 입력
    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public String toString() {
        return String.format("Knight {name: %s, hp: %d}", name, hp);
    }
}

public class KnightTest {

    public static void main(String[] args) {
        Knight knight1 = new Knight("돈키호테", 30);
        System.out.println("[객체 생성]");
        System.out.printf("\t%s\n", knight1.toString());
        knight1.setHp(knight1.getHp()+30);
        System.out.println("[체력 증가 + 30]");
        System.out.printf("\t%s\n", knight1.toString());


    }
}
