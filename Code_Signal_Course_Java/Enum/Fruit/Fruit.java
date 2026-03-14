package Code_Signal_Course_Java.Enum.Fruit;

public enum Fruit {
    APPLE (52, 10),
    ORANGE(47,  8),
    BANANA(96, 12),
    GRAPE (69, 17);

    private final int calories; // per 100g
    private final int sugar;    // grams per 100g

    Fruit(int calories, int sugar) {
        this.calories = calories;
        this.sugar    = sugar;
    }

    public int getCalories() { return calories; }
    public int getSugar()    { return sugar;    }

    public double sugarToCalorieRatio() {
        return (double) sugar / calories;
    }

    @Override
    public String toString() {
        return name().charAt(0) + name().substring(1).toLowerCase();
    }
}