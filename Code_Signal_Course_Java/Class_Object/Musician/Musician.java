package Code_Signal_Course_Java.Class_Object.Musician;

public class Musician {
    private String name;
    private String instrument;
    private int yearsActive;

    public Musician(String name, String instrument, int yearsActive) {
        this.name = name;
        this.instrument = instrument;
        this.yearsActive = yearsActive;
    }

    public void display() {
        System.out.println("Name: " + name + ", Instrument: " + instrument + ", Years Active: " + yearsActive);
    }
}