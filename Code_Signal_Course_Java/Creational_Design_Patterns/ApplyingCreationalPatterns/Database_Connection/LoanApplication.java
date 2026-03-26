package Code_Signal_Course_Java.Creational_Design_Patterns.Applying Creational Patterns.Database_Connection;

public class LoanApplication {

    private final String applicantName;
    private final double loanAmount;
    private final int termLength;
    private final String collateral;
    private final double interestRate;

    private LoanApplication(LoanApplicationBuilder builder) {
        this.applicantName = builder.applicantName;
        this.loanAmount = builder.loanAmount;
        this.termLength = builder.termLength;
        this.collateral = builder.collateral;
        this.interestRate = builder.interestRate;
    }

    public static class LoanApplicationBuilder {
        private final String applicantName;
        private final double loanAmount;
        private int termLength;
        private String collateral;
        private double interestRate = 0.0; // default value

        public LoanApplicationBuilder(String applicantName, double loanAmount) {
            this.applicantName = applicantName;
            this.loanAmount = loanAmount;
        }

        public LoanApplicationBuilder withTermLength(int termLength) {
            this.termLength = termLength;
            return this;
        }

        public LoanApplicationBuilder withCollateral(String collateral) {
            this.collateral = collateral;
            return this;
        }

        public LoanApplicationBuilder withInterestRate(double interestRate) {
            this.interestRate = interestRate;
            return this;
        }

        public LoanApplication build() {
            return new LoanApplication(this);
        }
    }

    @Override
    public String toString() {
        return "LoanApplication [Applicant Name=" + applicantName +
               ", Loan Amount=" + loanAmount +
               ", Term Length=" + termLength + " years" +
               ", Collateral=" + collateral +
               ", Interest Rate=" + interestRate + "%]";
    }
}