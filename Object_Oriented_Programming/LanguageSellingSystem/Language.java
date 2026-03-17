package Object_Oriented_Programming.LanguageSellingSystem;


import Java_Project_Package.Course.Course;
import Simple_Problems.Name;
import java.util.Scanner;

public class Language {
    private String courseName;
    private String languageName;
    protected double price;
    private String instructorName;
    private String instructorInitial;

    public Language(String courseName, String languageName, double price, String instructorName, String instructorInitial) {
        this.courseName = courseName;
        this.languageName = languageName;
        this.price = price;
        this.instructorName = instructorName;
        this.instructorInitial = instructorInitial;
    }

    public String getCourseName() {
        return courseName;
    }

    public String getLanguageName() {
        return languageName;
    }

    public double getPrice() {
        return price;
    }

    public String getInstructorName() {
        return instructorName;
    }

    public String getInstructorInitial() {
        return instructorInitial;
    }

    public void displayLanguageDetails() {
        System.out.println("Course Name: " + courseName);
        System.out.println("Language: " + languageName);
        System.out.println("Instructor: " + instructorName);
        System.out.println("Instructor Initial: " + instructorInitial);
        System.out.println("Price: $" + price);
    }

    public String getCourseType() {
        return "General Course";
    }
}
