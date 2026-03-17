package Object_Oriented_Programming.AccessModifiersDemo;

public class AccessModifiersDemo {
    public static void main(String[] args) {
        DataHolder dh = new DataHolder();

        System.out.println(dh.publicField);     // OK
        System.out.println(dh.protectedField);  // OK (same package)
        System.out.println(dh.defaultField);    // OK (same package)
        
        // System.out.println(dh.privateField); // COMPILE ERROR: privateField has private access in DataHolder
        
        dh.showPrivate(); // OK: Calls a public method that accesses the private field
    }
}
