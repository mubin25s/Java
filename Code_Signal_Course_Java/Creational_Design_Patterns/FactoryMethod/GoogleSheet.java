package Code_Signal_Course_Java.Creational_Design_Patterns.FactoryMethod;

public class GoogleSheet extends Document {
    @Override
    public void open() {
        System.out.println("Opening Google Sheet.");
    }
}
