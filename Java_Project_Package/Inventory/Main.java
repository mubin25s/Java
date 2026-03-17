package Java_Project_Package.Inventory;

import Object_Oriented_Programming.four_pillars.Abstraction.Abstraction;
import Object_Oriented_Programming.four_pillars.Abstraction.Laptop;

public class Main {
    public static void main(String[] args) {
        Inventory inv = new Inventory();
        inv.addProduct(new Product("P1", "Laptop", 10));
        inv.addProduct(new Product("P2", "Mouse", 50));
        inv.listProducts();
    }
}
