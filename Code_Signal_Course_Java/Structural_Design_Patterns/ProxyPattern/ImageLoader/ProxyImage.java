package Code_Signal_Course_Java.Structural_Design_Patterns.ProxyPattern.ImageLoader;

public class ProxyImage implements Image {
    private String filename;
    private RealImage realImage;
    public ProxyImage(String filename) { this.filename = filename; }
    @Override public void display() {
        if (realImage == null) { realImage = new RealImage(filename); }
        realImage.display();
    }
}
