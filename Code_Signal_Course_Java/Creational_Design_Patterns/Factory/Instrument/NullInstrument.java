package Code_Signal_Course_Java.Creational_Design_Patterns.Factory.Instrument;

public class NullInstrument extends Instrument {
    @Override
    public void play() {
        System.out.println("Unsupported Instrument Type.");
    }
}
