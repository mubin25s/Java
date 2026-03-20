package Code_Signal_Course_Java.OOP_Concepts.Abstraction.Appliance;

public class Main {
    public static void main(String[] args) {
        Appliance appliance = new Television();
        appliance.turnOn();
        appliance.turnOff();

        appliance = new WashingMachine();
        appliance.turnOn();
        appliance.turnOff();
    }
}