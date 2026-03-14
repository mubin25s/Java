package Code_Signal_Course_Java.Enum.Superhero;

public enum Superhero {
    SUPERMAN    (1.0, 100.0),
    BATMAN      (0.8,  10.0),
    WONDER_WOMAN(1.2,  50.0),
    FLASH       (0.7,   5.0);

    private final double strength;
    private final double speed;

    Superhero(double strength, double speed) {
        this.strength = strength;
        this.speed    = speed;
    }

    public double getStrength() { return strength; }
    public double getSpeed()    { return speed;    }

    public double powerLevel() {
        return strength * speed;
    }

    @Override
    public String toString() {
        return name().charAt(0) + name().substring(1).toLowerCase().replace('_', ' ');
        // "WONDER_WOMAN" → "Wonder woman"
    }
}