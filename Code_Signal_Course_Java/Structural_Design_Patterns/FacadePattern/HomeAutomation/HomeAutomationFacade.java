package Code_Signal_Course_Java.Structural_Design_Patterns.FacadePattern.HomeAutomation;

public class HomeAutomationFacade {
    private Light light;
    private AirConditioning ac;
    private Television tv;

    public HomeAutomationFacade() {
        this.light = new Light();
        this.ac = new AirConditioning();
        this.tv = new Television();
    }

    public void wakeUp() {
        System.out.println("Waking up...");
        light.turnOn();
        ac.start();
        tv.turnOn();
    }

    public void leaveHome() {
        System.out.println("Leaving home...");
        light.turnOff();
        ac.stop();
        tv.turnOff();
    }
}
