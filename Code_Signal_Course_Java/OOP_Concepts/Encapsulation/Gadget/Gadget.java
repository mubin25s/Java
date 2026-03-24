package Code_Signal_Course_Java.OOP_Concepts.Encapsulation.Gadget;

public class Gadget {
    private String name;
    private double price;

    public Gadget(String name, double price) {
        this.name = name;
        setPrice(price); // use setter to enforce the minimum price rule
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setPrice(double price) {
        if (price < 50.00) {
            this.price = 50.00;
        } else {
            this.price = price;
        }
    }

    public double getPrice() {
        return price;
    }
}