package exam_Class;

class Order {
    Menu[] menus;

    public Order(Menu[] menus) {
        this.menus = menus;
    }

    public int totalPrice() {
        int totalPrice = 0;
        for (Menu menu : menus) {
            totalPrice += menu.price;
        }return totalPrice;
    }
}

class Menu {
    String name;
    int price;

    public Menu(String name, int price) {
        this.name = name;
        this.price = price;
    }
}

public class ChinesRestaurant {

    public static void main(String[] args) {
        Menu jjajang = new Menu("짜장", 4900);
        Menu jjambbong = new Menu("짬뽕", 5900);
        Menu tangsook = new Menu("탕수육", 13900);

        Menu[] menuArr = { jjajang, jjambbong, tangsook };
        Order order = new Order(menuArr);

        System.out.printf("주문 합계: %d원\n", order.totalPrice());
    }
}
