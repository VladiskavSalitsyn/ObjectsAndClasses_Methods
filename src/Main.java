public class Main {

    public static void main(String[] args) {
        Basket basket = new Basket();
        basket.add("Milk", 40);
        basket.print("Milk");
        System.out.println();
        basket.add("bread", 55, 3,1.0);
        basket.print("Bread");
    }
}