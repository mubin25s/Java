package Code_Signal_Course_Java.Creational_Design_Patterns.FactoryMethod;

public class ExcelDocumentFactory implements DocumentAbstractFactory {
    @Override
    public Document createDocument() {
        return new ExcelDocument();
    }
}
