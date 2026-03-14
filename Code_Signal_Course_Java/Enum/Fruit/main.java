package Code_Signal_Course_Java.Enum.Fruit;

public class main {
    public main(String[] args) {
        System.out.printf("%-8s %10s %8s %10s%n", "Fruit", "Calories", "Sugar(g)", "Ratio");
        System.out.println("-".repeat(40));

        for (Fruit f : Fruit.values()) {
            System.out.printf("%-8s %8d %8d %10.4f%n",
                f, f.getCalories(), f.getSugar(), f.sugarToCalorieRatio());
        }
    }
}