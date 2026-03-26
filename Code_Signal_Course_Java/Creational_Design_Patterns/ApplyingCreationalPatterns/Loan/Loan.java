package Code_Signal_Course_Java.Creational_Design_Patterns.Applying Creational Patterns.Loan;

public abstract class Loan {
    protected double interestRate;
    protected double loanAmount;

    public Loan(double interestRate, double loanAmount) {
        this.interestRate = interestRate;
        this.loanAmount = loanAmount;
    }

    public abstract void loanDetails();
}