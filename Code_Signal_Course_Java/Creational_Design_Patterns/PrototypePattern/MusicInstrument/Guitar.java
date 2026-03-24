package Code_Signal_Course_Java.Creational_Design_Patterns.PrototypePattern.MusicInstrument;

public class Guitar extends MusicInstrument {

    private String brand;

    public Guitar(String instrumentType, String brand) {
        super(instrumentType);
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    @Override
    public MusicInstrument cloneInstrument() {
        return new Guitar(getInstrumentType(), brand);
    }

    public void showDetails() {
        System.out.println("Instrument Type: " + getInstrumentType() + ", Brand: " + brand);
    }
}