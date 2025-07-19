package ACLC.Loans;

public class Loan {
    
    protected double loanAmount;
    protected double interestRate;
    protected int durationYears;

    public Loan(double loanAmount, double interestRate, int durationYears) {
        this.loanAmount = loanAmount;
        this.interestRate = interestRate;
        this.durationYears = durationYears;
    }

    public double calculateTotalRepayment() {
        return loanAmount + (loanAmount * interestRate * durationYears / 100);
    }
}
