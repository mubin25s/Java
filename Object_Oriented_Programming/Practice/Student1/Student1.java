package Object_Oriented_Programming.Practice.Student1;
import Object_Oriented_Programming.Practice.Student;

public class Student1 {

    public static void main(String[] args) {
        
        StudentModel s1 = new StudentModel("John", "Computer Science", 20, 3.5);
        StudentModel s2 = new StudentModel("Jane", "Physics", 21, 3.8);
        StudentModel s3 = new StudentModel("Bob", "Chemistry", 22, 3.2);

        System.out.println("Student 1: " + s1.name + " " + s1.department + " " + s1.age + " " + s1.gpa);
        System.out.println("Student 2: " + s2.name + " " + s2.department + " " + s2.age + " " + s2.gpa);
        System.out.println("Student 3: " + s3.name + " " + s3.department + " " + s3.age + " " + s3.gpa);
    }

}
