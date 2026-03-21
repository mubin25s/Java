package Code_Signal_Course_Java.Creational_Design_Patterns.FactoryMethod;

public class ExcelDocument extends Document {
    @Override
    public void open() {
        System.out.println("Opening Excel Document.");
    }
}
