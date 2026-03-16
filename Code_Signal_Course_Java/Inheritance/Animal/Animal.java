package Code_Signal_Course_Java.Inheritance.Animal;

public class Animal {
    private String species;

    public Animal(String species) {
        this.species = species;
    }

    public void showSpecies() {
        System.out.println("Species: " + species);
    }
}