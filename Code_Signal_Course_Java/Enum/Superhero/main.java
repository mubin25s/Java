package Code_Signal_Course_Java.Enum.Superhero;

public class main {
    public main(String[] args) {
        System.out.printf("%-14s %10s %8s%n", "Hero", "Strength", "Speed");
        System.out.println("-".repeat(35));

        for (Superhero h : Superhero.values()) {
            System.out.printf("%-14s %8.1f %8.1f%n",
                h, h.getStrength(), h.getSpeed());
        }
    }
}