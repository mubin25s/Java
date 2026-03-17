package Object_Oriented_Programming.LanguageSellingSystem;


import Java_Project_Package.Course.Course;
import java.util.Scanner;

public class PaidLanguage extends Language {
    private double discount;

    public PaidLanguage(String courseName, String languageName, double price, String instructorName, String instructorInitial, double discount) {
        super(courseName, languageName, price, instructorName, instructorInitial);
        this.discount = discount;
    }

    @Override
    public void displayLanguageDetails() {
        super.displayLanguageDetails();
        System.out.println("Course Type: " + getCourseType());
        System.out.println("Discount: " + discount + "%");
        System.out.println("Final Price: $" + calculateFinalPrice());
    }

    public double calculateFinalPrice() {
        return getPrice() - (getPrice() * discount / 100);
    }

    @Override
    public String getCourseType() {
        return "Paid Course";
    }
}
