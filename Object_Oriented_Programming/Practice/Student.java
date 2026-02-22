public class student {
    String name ;
    String department;
    int age;
    double gpa;

    student(String name,String department, int age, double gpa){
        this.name = name;
        this.department = department;
        this.age = age;
        this.gpa = gpa;
    }


}
public class main {

    public static void main(String[] args) {
        
        student s1 = new student ("John", "Computer Science", 20, 3.5);
        student s2 = new student ("Jane", "Physics", 21, 3.8);
        student s3 = new student ("Bob", "Chemistry", 22, 3.2);

        System.out.println("Student 1: " + s1.name + " " + s1.department + " " + s1.age + " " + s1.gpa);
        System.out.println("Student 2: " + s2.name + " " + s2.department + " " + s2.age + " " + s2.gpa);
        System.out.println("Student 3: " + s3.name + " " + s3.department + " " + s3.age + " " + s3.gpa);
    }

}