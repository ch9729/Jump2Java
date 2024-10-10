package exam_Interface;

class Drink {
    String name;
    double price;

    public void ordered() {
        System.out.println("주문되었습니다.");
    }
}

class Juice extends Drink {

}

class Coffee extends Drink {

}

class Beer extends Drink {

}

class Water extends Drink {

}

class Tea extends Drink {

}



public class DrinkTest {

    public static void main(String[] args) {
        Drink j = new Juice();
        Drink c = new Coffee();
        Drink b = new Beer();
        Drink w = new Water();
        Drink t = new Tea();

        Drink[] drinks = { j, c, b, w, t };

        for (Drink drink : drinks) {
            drink.ordered();
        }

    }
}
