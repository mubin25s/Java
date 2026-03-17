package Object_Oriented_Programming.AccessModifiersDemo;

public class DataHolder {
    public String publicField = "Public: Everyone can see me";
    private String privateField = "Private: Only DataHolder can see me";
    protected String protectedField = "Protected: Package and subclasses can see me";
    String defaultField = "Default: Only package members can see me";

    public void showPrivate() {
        // Private fields are accessible within the same class
        System.out.println("Accessing from within class: " + privateField);
    }
}
