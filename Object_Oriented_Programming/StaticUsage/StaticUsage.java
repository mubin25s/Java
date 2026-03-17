package Object_Oriented_Programming.StaticUsage;

public class StaticUsage {
    // Static block
    static {
        System.out.println("Static block executed: Class is loaded.");
    }

    public static void main(String[] args) {
        Student s1 = new Student("Alice");
        Student s2 = new Student("Bob");

        s1.display();
        s2.display();

        // Changing static variable using class name
        Student.changeCollege("Innova University");

        System.out.println("\nAfter changing static variable:");
        s1.display(); // Reflects the change
        s2.display(); // Reflects the change
    }
}
