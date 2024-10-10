package exam_Interface;

class Novice {
    protected String name;
    protected int hp;

    public Novice(String name, int hp) {
        this.name = name;
        this.hp = hp;
    }

    public String toString() {
        return String.format("[Novice] %s(HP: %d)", name, hp);
    }
}

class Wizard extends Novice {
    protected int mp;

    public Wizard(String name, int hp, int mp) {
        super(name, hp);
        this.mp = mp;
    }

    public void energeVolt() {
        System.out.printf("%s의 에너지 볼트!", this.name);
    }
}

class GreatWizard extends Wizard {
    protected int shield;

    public GreatWizard(String name, int hp, int mp, int shield) {
        super(name, hp, mp);
        this.shield = shield;
    }

    @Override
    public String toString() {
        return String.format("[대마법사]%s(HP: %d,MP: %d, SHIELD: %d)", name, hp, mp, shield);
    }

    @Override
    public void energeVolt() {
        super.energeVolt();
        System.out.printf("(대마법사 버프로 데미지 +30 추가)");
    }
}

public class WizardTest {

    public static void main(String[] args) {
        GreatWizard gandalf = new GreatWizard("간달프", 100, 100, 100);

        System.out.println(gandalf.toString());
        gandalf.energeVolt();
    }
}
