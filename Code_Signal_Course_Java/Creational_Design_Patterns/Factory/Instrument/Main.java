package Code_Signal_Course_Java.Creational_Design_Patterns.Factory.Instrument;

public class Main {
    public static void main(String[] args) {
        Instrument guitar = InstrumentFactory.getInstrument(InstrumentFactory.InstrumentType.GUITAR);
        guitar.play();

        Instrument piano = InstrumentFactory.getInstrument(InstrumentFactory.InstrumentType.PIANO);
        piano.play();

        Instrument unsupported = InstrumentFactory.getInstrument(null);
        unsupported.play();
    }
}
