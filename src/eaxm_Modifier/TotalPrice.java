package eaxm_Modifier;

import java.util.ArrayList;

class Item {
    private String name;
    private int price;

    public Item(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public int getPrice() {
        return price;
    }
}

class Cart {
    private ArrayList<Item> items;

    public Cart() {
        this.items = new ArrayList<Item>();
    }

    public void add(Item item) {
        items.add(item);
    }

    public int totalPrice() {
        int sum = 0;
        for (Item item : items) {
            sum += item.getPrice();
        }
        return sum;
    }
}

public class TotalPrice {

    public static void main(String[] args) {
        Item item1 = new Item("스트라이프 셔츠", 49900);
        Item item2 = new Item("슬림 면바지", 58900);
        Item item3 = new Item("스니커즈", 46900);
        Cart myCart = new Cart();
        myCart.add(item1);
        myCart.add(item2);
        myCart.add(item3);

        System.out.println("총합: " + myCart.totalPrice() + "원");


    }
}
