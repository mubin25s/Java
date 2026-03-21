package Code_Signal_Course_Java.Creational_Design_Patterns.AbstractFactory.Document;

public class WordDocument extends Document {
    @Override
    public void open(String filename) {
        System.out.println("Opening Word Document: " + filename);
    }
}
