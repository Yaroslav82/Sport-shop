package app;

public enum Color {
    WHITE(0.5f),
    BLACK(1.25f),
    RED(2.25f),
    BLUE(2.5f);

    private final float price;

    Color(float price) {
        this.price = price;
    }

    public float getPrice() {
        return price;
    }
}
