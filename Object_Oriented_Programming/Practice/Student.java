public class Student {
    String name;
    String department;
    int age;
    double gpa;

    // Parameterized Constructor
    Student(String name, String department, int age, double gpa) {
        this.name = name;
        this.department = department;
        this.age = age;
        this.gpa = gpa;
    }

    // Default Constructor (Optional - good practice for Level 2)
    Student() {
        this.name = "Unknown";
        this.department = "Unassigned";
        this.age = 0;
        this.gpa = 0.0;
    }

    // Method to display student information
    void display() {
        System.out.println("Name: " + name + ", Dept: " + department + ", Age: " + age + ", GPA: " + gpa);
    }

    public static void main(String[] args) {
        // Creating student objects
        Student s1 = new Student("John", "Computer Science", 20, 3.5);
        Student s2 = new Student("Jane", "Physics", 21, 3.8);
        Student s3 = new Student("Bob", "Chemistry", 22, 3.2);
        Student s4 = new Student(); // Using default constructor

        // Displaying details
        System.out.println("--- Student Details ---");
        s1.display();
        s2.display();
        s3.display();
        s4.display();
    }
}