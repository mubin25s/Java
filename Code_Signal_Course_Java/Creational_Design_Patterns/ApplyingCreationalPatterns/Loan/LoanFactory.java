package Code_Signal_Course_Java.Creational_Design_Patterns.Applying Creational Patterns.Loan;

public interface LoanFactory {
    Loan createLoan(double interestRate, double loanAmount);
}