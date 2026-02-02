import java.util.Scanner;

class Language {
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

class FreeLanguage extends Language {
    public FreeLanguage(String courseName, String languageName, String instructorName, String instructorInitial) {
        super(courseName, languageName, 0.0, instructorName, instructorInitial);
    }

    @Override
    public void displayLanguageDetails() {
        super.displayLanguageDetails();
        System.out.println("Course Type: " + getCourseType());
        System.out.println("Enrollment Required: Yes (Free)");
    }

    @Override
    public String getCourseType() {
        return "Free Course";
    }
}

class PaidLanguage extends Language {
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

public class LanguageSellingSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Sample Data based on PDF
        FreeLanguage language1 = new FreeLanguage("Introduction to Java", "Java", "Ali Akber Rudra", "MAAA");
        PaidLanguage language2 = new PaidLanguage("Advanced Python", "Python", 500.0, "Anisul Haque", "AH", 15);
        PaidLanguage language3 = new PaidLanguage("Learn PHP Easy", "PHP", 100.0, "Shahriar Parvez", "SP", 10);
        PaidLanguage language4 = new PaidLanguage("Acquire C++", "C++", 120.0, "Hasna Hena", "HH", 20);

        System.out.println("[ Available Programming Courses ]");
        language1.displayLanguageDetails();
        System.out.println();
        language2.displayLanguageDetails();
        System.out.println();
        language3.displayLanguageDetails();
        System.out.println();
        language4.displayLanguageDetails();
        System.out.println();

        String selectedLanguage;
        Language selectedCourse = null;

        while (true) {
            System.out.print("\nEnter Programming Language to Enroll (Java/Python/PHP/C++): ");
            selectedLanguage = scanner.nextLine();

            if (selectedLanguage.equalsIgnoreCase("Java")) {
                selectedCourse = language1;
                break;
            } else if (selectedLanguage.equalsIgnoreCase("Python")) {
                selectedCourse = language2;
                break;
            } else if (selectedLanguage.equalsIgnoreCase("PHP")) {
                selectedCourse = language3;
                break;
            } else if (selectedLanguage.equalsIgnoreCase("C++")) {
                selectedCourse = language4;
                break;
            } else {
                System.out.println("Invalid choice! Please enter exactly! (Java/Python/PHP/C++)");
            }
        }

        System.out.println("\n--- Enrollment Details ---");
        selectedCourse.displayLanguageDetails();
        if (selectedCourse instanceof PaidLanguage) {
            System.out.println("In Total Amount to pay: $" + ((PaidLanguage) selectedCourse).calculateFinalPrice());
        }

        scanner.close();
    }
}
