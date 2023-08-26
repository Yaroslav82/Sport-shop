package app;

public class Shop {

    private final Builder builder = new OrderBuilder();

    public Order getBrightOutfit() {
        builder.reset();
        builder.addItem(new TShirt(Color.RED));
        builder.addItem(new Cap(Color.WHITE));
        return builder.getResult();
    }

    public Order getDarkOutfit() {
        builder.reset();
        builder.addItem(new TShirt(Color.BLUE));
        builder.addItem(new Cap(Color.BLACK));
        return builder.getResult();
    }
}
