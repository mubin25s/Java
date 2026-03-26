package Code_Signal_Course_Java.Creational_Design_Patterns.Applying Creational Patterns.Loan;

public class CarLoan extends Loan {

    public CarLoan(double interestRate, double loanAmount) {
        super(interestRate, loanAmount);
    }

    @Override
    public void loanDetails() {
        System.out.println("Car Loan - Interest Rate: " + interestRate + "%, Loan Amount: $" + loanAmount);
    }
}