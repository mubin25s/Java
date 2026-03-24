package Code_Signal_Course_Java.Creational_Design_Patterns.PrototypePattern.MusicInstrument;

public abstract class MusicInstrument implements Cloneable {

    private String instrumentType;

    public MusicInstrument(String instrumentType) {
        this.instrumentType = instrumentType;
    }

    public String getInstrumentType() {
        return instrumentType;
    }

    public abstract MusicInstrument cloneInstrument();

    @Override
    protected MusicInstrument clone() {
        try {
            return (MusicInstrument) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }
}