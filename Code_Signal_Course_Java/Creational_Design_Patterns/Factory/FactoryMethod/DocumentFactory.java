package Code_Signal_Course_Java.Creational_Design_Patterns.FactoryMethod;

public class DocumentFactory {
    public static Document createDocument(DocumentAbstractFactory factory) {
        return factory.createDocument();
    }
}
