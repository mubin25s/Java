package Code_Signal_Course_Java.OOP_Concepts.Class_Object.Musician;
import Simple_Problems.Name;

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