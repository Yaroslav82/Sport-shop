package app;

public class Main {

    public static void main(String[] args) {
        Shop sportShop = new Shop();

        Order orderA = sportShop.getBrightOutfit();

        System.out.println("Order A");
        orderA.showItems();
        System.out.println("Total Cost: " + orderA.getCost());

        Order orderB = sportShop.getDarkOutfit();

        System.out.println("\nOrder B");
        orderB.showItems();
        System.out.println("Total Cost: " + orderB.getCost());
    }
}
