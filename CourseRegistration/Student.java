package CourseRegistration;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private String name;
    private List<Course> registeredCourses;

    public Student(String name) {
        this.name = name;
        this.registeredCourses = new ArrayList<>();
    }

    public void register(Course c) {
        registeredCourses.add(c);
        System.out.println(name + " registered for " + c);
    }
}
