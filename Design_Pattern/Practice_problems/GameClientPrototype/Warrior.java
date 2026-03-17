package Design_Pattern.Practice_problems.GameClientPrototype;

public class Warrior extends GameCharacter {
    public Warrior() {
        super("Warrior", "Sword", 150, 20);
    }
    
    // Constructor for cloning/customization
    private Warrior(Warrior target) {
        super(target.type, target.weapon, target.health, target.attackPower);
    }

    @Override
    public GameCharacter clone() {
        return new Warrior(this); 
    }
}
