package Code_Signal_Course_Java.Structural_Design_Patterns.CompositePattern.FileSystem;

public class File implements FileSystemComponent {
    private String name;
    public File(String name) { this.name = name; }
    @Override public void showDetails() { System.out.println("File: " + name); }
}
