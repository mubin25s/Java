package Code_Signal_Course_Java.Creational_Design_Patterns.Factory.FactoryMethod;

public class GoogleSheetFactory implements DocumentAbstractFactory {
    @Override
    public Document createDocument() {
        return new GoogleSheet();
    }
}
