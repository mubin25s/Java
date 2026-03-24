package Code_Signal_Course_Java.Creational_Design_Patterns.PrototypePattern.Hero;

public abstract class Hero implements Cloneable {

    private String alias;

    public Hero(String alias) {
        this.alias = alias;
    }

    public String getAlias() {
        return alias;
    }

    // Abstract method declaration
    public abstract Hero cloneHero();

    @Override
    protected Hero clone() {
        try {
            return (Hero) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }
}