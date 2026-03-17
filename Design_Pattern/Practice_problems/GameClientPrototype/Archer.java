package Design_Pattern.Practice_problems.GameClientPrototype;

public class Archer extends GameCharacter {
     public Archer() {
        super("Archer", "Bow", 100, 25);
    }

    private Archer(Archer target) {
        super(target.type, target.weapon, target.health, target.attackPower);
    }

    @Override
    public GameCharacter clone() {
        return new Archer(this);
    }
}
