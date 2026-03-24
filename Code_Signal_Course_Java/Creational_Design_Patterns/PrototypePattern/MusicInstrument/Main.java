package Code_Signal_Course_Java.Creational_Design_Patterns.PrototypePattern.MusicInstrument;

public class Main {
    public static void main(String[] args) {
        Guitar originalGuitar = new Guitar("String", "Fender");
        Guitar clonedGuitar = (Guitar) originalGuitar.cloneInstrument();

        originalGuitar.showDetails(); // Instrument Type: String, Brand: Fender
        clonedGuitar.showDetails();   // Instrument Type: String, Brand: Fender
    }
}