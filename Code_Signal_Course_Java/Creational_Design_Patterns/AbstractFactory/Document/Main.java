package Code_Signal_Course_Java.Creational_Design_Patterns.AbstractFactory.Document;

public class Main {
    public static void main(String[] args) {
        Document wordDoc = DocumentFactory.createDocument(new WordDocumentFactory());
        wordDoc.open("word_file.docx");

        Document googleDoc = DocumentFactory.createDocument(new GoogleDocFactory());
        googleDoc.open("google_doc_file.gdoc");

        Document excelDoc = DocumentFactory.createDocument(new ExcelDocumentFactory());
        excelDoc.open("excel_file.xlsx");

        Document googleSheet = DocumentFactory.createDocument(new GoogleSheetFactory());
        googleSheet.open("google_sheet_file.gsheet");
    }
}
