package Code_Signal_Course_Java.Creational_Design_Patterns.Applying Creational Patterns.Loan;

public class Main {
    public static void main(String[] args) {
        LoanApplication application = new LoanApplication();

        Loan homeLoan = application.applyForLoan(new HomeLoanFactory(), 3.5, 250000.00);
        Loan carLoan  = application.applyForLoan(new CarLoanFactory(),  6.9,  15000.00);

        homeLoan.loanDetails();
        carLoan.loanDetails();
    }
}