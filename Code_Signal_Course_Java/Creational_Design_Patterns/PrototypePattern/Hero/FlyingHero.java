package Code_Signal_Course_Java.Creational_Design_Patterns.PrototypePattern.Hero;

public class FlyingHero extends Hero {

    private String power;

    public FlyingHero(String alias, String power) {
        super(alias);
        this.power = power;
    }

    public String getPower() {
        return power;
    }

    @Override
    public Hero cloneHero() {
        return new FlyingHero(getAlias(), power);
    }

    public void showDetails() {
        System.out.println("Hero Alias: " + getAlias() + ", Power: " + power);
    }
}