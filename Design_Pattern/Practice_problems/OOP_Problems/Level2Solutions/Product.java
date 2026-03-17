package Design_Pattern.Practice_problems.OOP_Problems.Level2Solutions;
import Simple_Problems.Name;

public class Product {
    int productId;
    String productName;
    double price;

    Product(int productId, String productName, double price) {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
    }

    void display() {
        System.out.println("Product ID: " + productId + ", Name: " + productName + ", Price: " + price);
    }
}
