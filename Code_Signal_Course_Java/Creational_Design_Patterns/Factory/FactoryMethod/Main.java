package Code_Signal_Course_Java.Creational_Design_Patterns.Factory.FactoryMethod;

public class Main {
    public static void main(String[] args) {
        Document wordDoc = DocumentFactory.createDocument(new WordDocumentFactory());
        wordDoc.open();

        Document googleDoc = DocumentFactory.createDocument(new GoogleDocFactory());
        googleDoc.open();

        Document excelDoc = DocumentFactory.createDocument(new ExcelDocumentFactory());
        excelDoc.open();

        Document googleSheet = DocumentFactory.createDocument(new GoogleSheetFactory());
        googleSheet.open();
    }
}
