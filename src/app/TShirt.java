package app;

public class TShirt implements Item {

    private final Color color;

    public TShirt(Color color) {
        this.color = color;
    }

    @Override
    public String name() {
        return color.name().toLowerCase() + " T-shirt";
    }

    @Override
    public String brand() {
        return "Active sports";
    }

    @Override
    public float price() {
        return 10 + color.getPrice();
    }
}
