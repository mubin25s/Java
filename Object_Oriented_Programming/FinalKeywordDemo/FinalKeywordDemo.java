package Object_Oriented_Programming.FinalKeywordDemo;

public class FinalKeywordDemo {
    public static void main(String[] args) {
        // Final variable
        final int MAX_SPEED = 120;
        // MAX_SPEED = 150; // COMPILE ERROR

        System.out.println("Maximum allowed speed: " + MAX_SPEED);
        
        Parent p = new Parent();
        p.displaySecurityCode();
        
        ImmutableBase base = new ImmutableBase();
        base.show();
    }
}
