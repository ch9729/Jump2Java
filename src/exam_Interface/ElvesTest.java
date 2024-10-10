package exam_Interface;

class Elf {
    String name;
    int hp;

    public Elf(String name, int hp) {
        this.name = name;
        this.hp = hp;
    }

    public String toString() {
        return String.format("[엘프] name: %s, HP: %d", name, hp);
    }
}

class HighElf extends Elf {
    int mp;

    public HighElf(String name, int hp, int mp) {
        super(name, hp);    //부모클래스의 생성자
        this.mp = mp;
    }

    public String toString() {
        return String.format("[하이엘프] Name: %s, HP: %d, MP: %d", name, hp, mp);
    }
}

class ElfLord extends HighElf {
    int shield;

    public ElfLord(String name, int hp, int mp, int shield) {
        super(name, hp, mp);
        this.shield = shield;
    }
    public String toString() {
        return String.format("[엘프로드] Name: %s, HP: %d, MP: %d, SH: %d", name, hp, mp, shield);
    }
}

public class ElvesTest {

    public static void main(String[] args) {
        Elf elf =new Elf("티란데", 100);
        HighElf high = new HighElf("말퓨리온", 160, 100);
        ElfLord lord = new ElfLord("마이에브", 230, 140, 100);

        Elf[] elves = new Elf[] {elf,high,lord};

        for (Elf elf1 : elves) {
            System.out.println(elf1.toString());
        }
    }
}
