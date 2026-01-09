package CourseRegistration;

public class Course {
    private String code;
    private String title;

    public Course(String code, String title) {
        this.code = code;
        this.title = title;
    }

    public String toString() {
        return code + ": " + title;
    }
}
