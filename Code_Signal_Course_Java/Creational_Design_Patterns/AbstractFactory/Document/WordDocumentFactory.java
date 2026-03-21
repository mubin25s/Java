package Code_Signal_Course_Java.Creational_Design_Patterns.AbstractFactory.Document;

public class WordDocumentFactory implements DocumentAbstractFactory {
    @Override
    public Document createDocument() {
        return new WordDocument();
    }
}
