package Code_Signal_Course_Java.Structural_Design_Patterns.DecoratorPattern.Computer;

public class Main {
    public static void main(String[] args) {
        Computer gamingComputer = new GamingComputer(new BasicComputer());
        System.out.println(gamingComputer.assemble()); // Basic Computer + Gaming Features

        Computer workstationComputer = new WorkstationComputer(new BasicComputer());
        System.out.println(workstationComputer.assemble()); // Basic Computer + Workstation Features
    }
}