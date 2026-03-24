package Code_Signal_Course_Java.Creational_Design_Patterns.PrototypePattern.Person;

public class Main {
    public static void main(String[] args) {
        Person originalPerson = new Person("John Doe");
        originalPerson.addAddress(new Address("123 Main St", "New York"));
        originalPerson.addAddress(new Address("456 Elm St", "Boston"));

        // Deep clone the original person
        Person clonedPerson = originalPerson.clone();

        // Modify the cloned person's first address
        clonedPerson.getAddresses().get(0).setStreet("789 Oak St");

        // Print both — original should remain unchanged
        System.out.println("Original Person: " + originalPerson);
        System.out.println("Cloned Person:   " + clonedPerson);
    }
}