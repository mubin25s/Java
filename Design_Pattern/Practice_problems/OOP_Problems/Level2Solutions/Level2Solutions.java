package Design_Pattern.Practice_problems.OOP_Problems.Level2Solutions;

import Object_Oriented_Programming.four_pillars.Abstraction.Abstraction;
import Object_Oriented_Programming.four_pillars.Abstraction.Laptop;

public class Level2Solutions {
    public static void main(String[] args) {
        System.out.println("--- Level 2: BankAccount ---");
        BankAccount account = new BankAccount();
        account.deposit(1000);
        account.withdraw(400);
        System.out.println("Current Balance: " + account.checkBalance());

        System.out.println("\n--- Level 2: Grade ---");
        Grade g = new Grade();
        g.inputMarks(85, 90, 78);
        System.out.println("Average: " + g.calculateAverage());
        System.out.println("Grade: " + g.determineGrade());

        System.out.println("\n--- Level 2: Employee ---");
        Employee emp1 = new Employee(); // Default
        Employee emp2 = new Employee("John", 101, 50000); // Parameterized
        emp1.display();
        emp2.display();

        System.out.println("\n--- Level 2: Product ---");
        Product p = new Product(501, "Laptop", 75000);
        p.display();
    }
}
