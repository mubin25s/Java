package Inventory;

public class Main {
    public static void main(String[] args) {
        Inventory inv = new Inventory();
        inv.addProduct(new Product("P1", "Laptop", 10));
        inv.addProduct(new Product("P2", "Mouse", 50));
        inv.listProducts();
    }
}
