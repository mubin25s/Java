package Code_Signal_Course_Java.Creational_Design_Patterns.FactoryMethod;

public class GoogleDocFactory implements DocumentAbstractFactory {
    @Override
    public Document createDocument() {
        return new GoogleDoc();
    }
}
