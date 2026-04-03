package Code_Signal_Course_Java.Structural_Design_Patterns.ProxyPattern.ImageLoader;

public class Main {
    public static void main(String[] args) {
        Image img1 = new ProxyImage("photo1.jpg");
        Image img2 = new ProxyImage("photo2.jpg");
        
        System.out.println("Displaying img1 (loading required):");
        img1.display();
        
        System.out.println("\nDisplaying img1 again (already loaded):");
        img1.display();
        
        System.out.println("\nDisplaying img2 (loading required):");
        img2.display();
    }
}
