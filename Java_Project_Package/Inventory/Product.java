package Inventory;

public class Product {
    private String id;
    private String name;
    private int quantity;

    public Product(String id, String name, int quantity) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
    }

    public void updateQuantity(int amount) {
        this.quantity += amount;
    }

    public String toString() {
        return id + ": " + name + " (Qty: " + quantity + ")";
    }
}
