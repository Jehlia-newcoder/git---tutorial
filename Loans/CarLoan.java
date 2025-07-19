package ACLC.Loans;

public class CarLoan extends Loan {
    
    private double processingFees;

    public CarLoan(double loanAmount, double interestRate, int durationYears, double processingFees) {
        super(loanAmount, interestRate, durationYears);
        this.processingFees = processingFees;
    }

    @Override
    public double calculateTotalRepayment() {
        return  super.calculateTotalRepayment() + processingFees;
    }
}
