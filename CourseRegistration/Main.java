package CourseRegistration;

public class Main {
    public static void main(String[] args) {
        Course c1 = new Course("CS101", "Intro to Java");
        Student s1 = new Student("Alice");
        s1.register(c1);
    }
}
