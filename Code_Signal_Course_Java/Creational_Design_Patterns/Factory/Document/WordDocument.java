package Code_Signal_Course_Java.Creational_Design_Patterns.Factory.Document;

public class WordDocument extends Document {
    @Override
    public void open() {
        System.out.println("Opening Word Document.");
    }
}