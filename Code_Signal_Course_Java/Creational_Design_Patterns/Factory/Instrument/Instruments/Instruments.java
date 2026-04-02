package Code_Signal_Course_Java.Creational_Design_Patterns.Factory.Instrument.Instruments;

public abstract class Instruments {
    public abstract void play();
}

class Guitar extends Instruments {
    public void play() {
        System.out.println("Playing Guitar.");
    }
}

class Piano extends Instruments {
    public void play() {
        System.out.println("Playing Piano.");
    }
}

class NullInstrument extends Instruments {
    public void play() {
        System.out.println("Unsupported Instrument Type.");
    }
}

class InstrumentFactory {
    public static Instruments getInstrument(String type) {
        if (type == null) {
            return new NullInstrument();
        }
        if (type.equalsIgnoreCase("Guitar")) {
            return new Guitar();
        } else if (type.equalsIgnoreCase("Piano")) {
            return new Piano();
        }
        return new NullInstrument();
    }
}

public class Main {
    public static void main(String[] args) {
        Instruments guitar = InstrumentFactory.getInstrument("Guitar");
        guitar.play();

        Instruments piano = InstrumentFactory.getInstrument("Piano");
        piano.play();

        Instruments unsupported = InstrumentFactory.getInstrument(null);
        unsupported.play();
    }
}