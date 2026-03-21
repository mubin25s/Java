package Code_Signal_Course_Java.Creational_Design_Patterns.AbstractFactory.Document;

public class ExcelDocument extends Document {
    @Override
    public void open(String filename) {
        System.out.println("Opening Excel Document: " + filename);
    }
}
