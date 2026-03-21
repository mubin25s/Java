package Code_Signal_Course_Java.Creational_Design_Patterns.Factory.Instrument;

public class InstrumentFactory {
    public enum InstrumentType {
        GUITAR, PIANO
    }

    public static Instrument getInstrument(InstrumentType type) {
        if (type == null) {
            return new NullInstrument();
        }
        switch (type) {
            case GUITAR:
                return new Guitar();
            case PIANO:
                return new Piano();
            default:
                return new NullInstrument();
        }
    }
}
