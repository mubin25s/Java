package Code_Signal_Course_Java.Creational_Design_Patterns.AbstractFactory.Document;

public class GoogleDoc extends Document {
    @Override
    public void open(String filename) {
        System.out.println("Opening Google Doc: " + filename);
    }
}
