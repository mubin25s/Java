package four_pillars;

/**
 * ENCAPSULATION
 * Definition: Wrapping data (variables) and code (methods) together as a single unit.
 * It restricts direct access to some of the object's components.
 */
class Student {
    // Private fields: Not accessible directly from outside the class
    private String name;
    private int age;

    // Public Getter for name
    public String getName() {
        return name;
    }

    // Public Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Public Getter for age
    public int getAge() {
        return age;
    }

    // Public Setter for age with validation logic
    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        } else {
            System.out.println("Please enter a valid age.");
        }
    }
}

public class Encapsulation {
    public static void main(String[] args) {
        Student s1 = new Student();
        
        // s1.name = "John"; // This would cause a compile-time error
        
        s1.setName("John Doe");
        s1.setAge(20);

        System.out.println("--- Encapsulation Example ---");
        System.out.println("Student Name: " + s1.getName());
        System.out.println("Student Age: " + s1.getAge());
    }
}
