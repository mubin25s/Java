package Code_Signal_Course_Java.Creational_Design_Patterns.Applying Creational Patterns.Loan;

public class HomeLoan extends Loan {

    public HomeLoan(double interestRate, double loanAmount) {
        super(interestRate, loanAmount);
    }

    @Override
    public void loanDetails() {
        System.out.println("Home Loan - Interest Rate: " + interestRate + "%, Loan Amount: $" + loanAmount);
    }
}