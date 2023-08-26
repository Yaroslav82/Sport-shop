package app;

import java.util.ArrayList;
import java.util.List;

public class OrderBuilder implements Builder {

    private final List<Item> items = new ArrayList<>();

    @Override
    public void reset() {
        items.clear();
    }

    @Override
    public void addItem(Item item) {
        items.add(item);
    }

    @Override
    public Order getResult() {
        return new Order(items);
    }
}
