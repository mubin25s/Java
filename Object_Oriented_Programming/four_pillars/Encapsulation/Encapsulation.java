package Object_Oriented_Programming.four_pillars.Encapsulation;

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
