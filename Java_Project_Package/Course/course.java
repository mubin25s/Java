package Java_Project_Package.Course;

public class Course {
    private String name;
    private String category;
    private int id;

    public Course(String name, String category, int id) {
        this.name = name;
        this.category = category;
        this.id = id;
    }

    public void displayCourseDetails() {
        System.out.println("ID: " + id + " | Course: " + name + " | Category: " + category);
    }
}
