package Design_Pattern.Practice_problems.GameClientPrototype;

public abstract class GameCharacter implements Cloneable {
    protected String type;
    protected String weapon;
    protected int health;
    protected int attackPower;

    public GameCharacter(String type, String weapon, int health, int attackPower) {
        this.type = type;
        this.weapon = weapon;
        this.health = health;
        this.attackPower = attackPower;
    }
    
    // Abstract method to clone
    public abstract GameCharacter clone();

    // Getters and Setters for modification
    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }
    
    public void setHealth(int health) {
         this.health = health;
    }

    public void setAttackPower(int attackPower) {
        this.attackPower = attackPower;
   }

    public void displayInfo() {
        System.out.println("Character [Type=" + type + ", Weapon=" + weapon + ", Health=" + health + ", Attack=" + attackPower + "]");
    }
}
