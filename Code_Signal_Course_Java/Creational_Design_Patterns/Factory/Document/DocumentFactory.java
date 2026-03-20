package Code_Signal_Course_Java.Creational_Design_Patterns.Factory.Document;

public class DocumentFactory {
    public enum DocumentType {
        WORD, EXCEL, PDF
    }

    public static Document getDocument(DocumentType type) {
        switch (type) {
            case WORD:
                return new WordDocument();
            case EXCEL:
                return new ExcelDocument();
            case PDF:
                return new PDFDocument();
            default:
                throw new IllegalArgumentException("Unknown document type: " + type);
        }
    }
}