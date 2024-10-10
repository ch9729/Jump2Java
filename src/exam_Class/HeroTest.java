package exam_Class;

class Hero {
    String name;
    int hp;
    public Hero(String name) {
        this.name = name;
        this.hp = 30;
    }

    public void punch(Hero hero) {
        int random = (int)(Math.random()*10);
        hero.hp -= random;
    }

    public static void battle(Hero a, Hero b) {
        //String attacker, defender;
        while (b.hp > 0 && a.hp > 0) {
                a.punch(b);
                System.out.printf("[%s]의 펀치\n", a.name);
                System.out.printf("%s: %d/30\n", b.name, b.hp);

                b.punch(a);
                System.out.printf("[%s]의 펀치\n", b.name);
                System.out.printf("%s: %d/30\n", a.name, a.hp);
        }
    }
}

public class HeroTest {

    public static void main(String[] args) {
        Hero arthas = new Hero("아서스");
        Hero leona = new Hero("레오나");

        Hero.battle(arthas, leona);
    }
}
