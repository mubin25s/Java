package Code_Signal_Course_Java.OOP_Concepts.Inheritance.Animal;
import Object_Oriented_Programming.four_pillars.Inheritance.Inheritance;

public class Animal {
    private String species;

    public Animal(String species) {
        this.species = species;
    }

    public void showSpecies() {
        System.out.println("Species: " + species);
    }
}