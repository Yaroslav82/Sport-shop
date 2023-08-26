package app;

import java.util.List;

public class Order {

    private final List<Item> items;

    public Order(List<Item> items) {
        this.items = items;
    }

    public float getCost() {
        float cost = 0.0f;
        for (Item item : items) {
            cost += item.price();
        }
        return cost;
    }

    public void showItems() {
        for (Item item : items) {
            System.out.print("Item : " + item.name());
            System.out.print(", Brand : " + item.brand());
            System.out.println(", Price : " + item.price());
        }
    }
}
