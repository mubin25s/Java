package Design_Pattern.Practice_problems.GameClientPrototype;

public class GameClientPrototype {
    public static void main(String[] args) {
        System.out.println("--- Prototype Pattern: Game Character Creation ---");

        // Create base characters (prototypes)
        GameCharacter warriorPrototype = new Warrior();
        GameCharacter archerPrototype = new Archer();
        GameCharacter magePrototype = new Mage();

        // 1. Clone Warrior and customize
        GameCharacter warrior1 = warriorPrototype.clone();
        warrior1.setWeapon("Great Axe");
        warrior1.setAttackPower(25); // Customized

        // 2. Clone another Warrior and customize differently
        GameCharacter warrior2 = warriorPrototype.clone();
        warrior2.setWeapon("Shield & Sword");
        warrior2.setHealth(160);

        // 3. Clone Mage
        GameCharacter mage1 = magePrototype.clone();
        mage1.setWeapon("Dark Staff");

        System.out.println("\n--- Created Characters ---");
        System.out.print("Original Warrior: "); warriorPrototype.displayInfo();
        System.out.print("Custom Warrior 1: "); warrior1.displayInfo();
        System.out.print("Custom Warrior 2: "); warrior2.displayInfo();
        
        System.out.println();
        System.out.print("Original Mage:    "); magePrototype.displayInfo();
        System.out.print("Custom Mage 1:    "); mage1.displayInfo();
    }
}
