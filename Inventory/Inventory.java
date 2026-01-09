package Inventory;

import java.util.ArrayList;
import java.util.List;

public class Inventory {
    private List<Product> products;

    public Inventory() {
        this.products = new ArrayList<>();
    }

    public void addProduct(Product p) {
        products.add(p);
    }

    public void listProducts() {
        for (Product p : products) {
            System.out.println(p);
        }
    }
}
