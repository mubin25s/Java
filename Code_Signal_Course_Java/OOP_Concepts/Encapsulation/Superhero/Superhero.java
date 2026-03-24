package Code_Signal_Course_Java.OOP_Concepts.Encapsulation.Superhero;

public class Superhero {
    private String alias;
    private int strength;

    public Superhero(String alias, int strength) {
        this.alias = alias;
        this.strength = strength;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public String getAlias() {
        return alias;
    }

    public int getStrength() {
        return strength;
    }
}