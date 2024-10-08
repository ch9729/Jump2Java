package exam_Class;

class Miner {
    String name;
    int conins;

    public Miner(String name) {
        this.name = name;
        conins = 0;
    }

    public String toString() {
        return String.format("Miner { name: %s, conins: %d}", name, conins);
    }

    public void mine() {
        conins += 1;
    }
}

public class MinerTest {

    public static void main(String[] args) {
        Miner malon = new Miner("말런");
        Miner gloria = new Miner("글로리아");

        malon.mine();
        malon.mine();
        malon.mine();
        gloria.mine();
        gloria.mine();
        System.out.println(malon.toString());
        System.out.println(gloria.toString());
    }
}
