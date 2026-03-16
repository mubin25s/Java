package Code_Signal_Course_Java.Inheritance.Animal;

public class Bird extends Animal {
    private String color;

    public Bird(String species, String color) {
        super(species);
        this.color = color;
    }

    public void displayColor() {
        System.out.println("Color: " + color);
    }
}