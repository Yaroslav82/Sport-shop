package app;

public class Cap implements Item {

    private final Color color;

    public Cap(Color color) {
        this.color = color;
    }

    @Override
    public String name() {
        return color.name().toLowerCase() + " cap";
    }

    @Override
    public String brand() {
        return "Smart caps";
    }

    @Override
    public float price() {
        return 3 + color.getPrice();
    }
}
