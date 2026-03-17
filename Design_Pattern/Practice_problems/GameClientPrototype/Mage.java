package Design_Pattern.Practice_problems.GameClientPrototype;

public class Mage extends GameCharacter {
     public Mage() {
        super("Mage", "Staff", 80, 30);
    }

    private Mage(Mage target) {
        super(target.type, target.weapon, target.health, target.attackPower);
    }

    @Override
    public GameCharacter clone() {
        return new Mage(this);
    }
}
