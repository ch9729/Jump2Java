package exam_Class;

class Item {
    String name;
    int power;

    public Item(String name, int power) {
        this.name = name;
        this.power = power;
    }

    public String toString() {
        return String.format("Item {name: %s, power: %d}", name, power);
    }
}

public class ItemTest {

    public static void main(String[] args) {
        Item storm = new Item("스톰 브레이커", 600);
        Item gauntlet = new Item("인피니티 건틀렛", 999);
        Item bow = new Item("호크아이의 활", 50);
        Item shield = new Item("캡틴아메리카의 방패", 50);

        Item[] items = {storm,gauntlet,bow,shield};

        for (Item item : items) {
            System.out.println(item.toString());
        }
    }
}
