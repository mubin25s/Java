package Code_Signal_Course_Java.Creational_Design_Patterns.Applying Creational Patterns.Loan;

public class LoanApplication {

    public Loan applyForLoan(LoanFactory factory, double interestRate, double loanAmount) {
        return factory.createLoan(interestRate, loanAmount);
    }
}