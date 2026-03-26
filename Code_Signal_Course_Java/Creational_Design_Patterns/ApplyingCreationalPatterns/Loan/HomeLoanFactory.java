package Code_Signal_Course_Java.Creational_Design_Patterns.Applying Creational Patterns.Loan;

public class HomeLoanFactory implements LoanFactory {

    @Override
    public Loan createLoan(double interestRate, double loanAmount) {
        return new HomeLoan(interestRate, loanAmount);
    }
}