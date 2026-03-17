package Code_Signal_Course_Java.Polymorphism.Device;

public class Laptop extends Device {
    private String operatingSystem;

    public Laptop(String name, String powerStatus, String operatingSystem) {
        super(name, powerStatus);
        this.operatingSystem = operatingSystem;
    }

    @Override
    public void status() {
        super.status();
        System.out.println("Operating System: " + operatingSystem);
    }
}