package Object_Oriented_Programming.four_pillars.Encapsulation;

public class Student {
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
