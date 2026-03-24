package Code_Signal_Course_Java.OOP_Concepts.Encapsulation.Superhero;

public class Main {
    public static void main(String[] args) {
        Superhero hero = new Superhero("Iron Man", 85);

        hero.setAlias("Doctor Strange");
        hero.setStrength(95);

        System.out.println("Alias: " + hero.getAlias());
        System.out.println("Strength: " + hero.getStrength());
    }
}