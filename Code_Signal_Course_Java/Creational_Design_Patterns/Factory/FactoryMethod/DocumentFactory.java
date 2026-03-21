package Code_Signal_Course_Java.Creational_Design_Patterns.Factory.FactoryMethod;

public class DocumentFactory {
    public static Document createDocument(DocumentAbstractFactory factory) {
        return factory.createDocument();
    }
}
