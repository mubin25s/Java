package Code_Signal_Course_Java.Creational_Design_Patterns.PrototypePattern.Hero;

public class Main {
    public static void main(String[] args) {
        FlyingHero originalHero = new FlyingHero("SkyDiver", "Super Flight");
        FlyingHero clonedHero = (FlyingHero) originalHero.cloneHero();

        originalHero.showDetails(); // Hero Alias: SkyDiver, Power: Super Flight
        clonedHero.showDetails();   // Hero Alias: SkyDiver, Power: Super Flight
    }
}