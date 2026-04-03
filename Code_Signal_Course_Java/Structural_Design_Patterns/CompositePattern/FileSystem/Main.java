package Code_Signal_Course_Java.Structural_Design_Patterns.CompositePattern.FileSystem;

public class Main {
    public static void main(String[] args) {
        File file1 = new File("Document.txt");
        File file2 = new File("Image.jpg");
        Directory dir1 = new Directory("MyFiles");
        dir1.addComponent(file1);
        dir1.addComponent(file2);

        Directory root = new Directory("Root");
        root.addComponent(dir1);
        root.addComponent(new File("System.log"));

        root.showDetails();
    }
}
