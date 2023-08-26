package app;

public interface Builder {
    void reset();

    void addItem(Item item);

    Order getResult();
}
