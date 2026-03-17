package Code_Signal_Course_Java.OOP_Concepts.Inheritance.Animal;
import Object_Oriented_Programming.four_pillars.Inheritance.Inheritance;

public class Main {
    public static void main(String[] args) {
        Bird bird = new Bird("Parrot", "Green");
        bird.showSpecies();
        bird.displayColor();
    }
}
