package Object_Oriented_Programming.LanguageSellingSystem;


import java.util.Scanner;

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
