package Code_Signal_Course_Java.Creational_Design_Patterns.Factory.Document;

public class Main {
    public static void main(String[] args) {
        Document wordDoc = DocumentFactory.getDocument(DocumentFactory.DocumentType.WORD);
        wordDoc.open();

        Document excelDoc = DocumentFactory.getDocument(DocumentFactory.DocumentType.EXCEL);
        excelDoc.open();

        Document pdfDoc = DocumentFactory.getDocument(DocumentFactory.DocumentType.PDF);
        pdfDoc.open();
    }
}