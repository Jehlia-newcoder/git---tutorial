package ACLC.SpecializedBankAccount;

public class SpecializedSavingsAccount extends SpecialBankAccount {
    
    private double interestRate;

    public SpecializedSavingsAccount(String accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    public void addInterest() {
        double interest = this.balance * this.interestRate / 100;
        this.balance += interest;
        System.out.println("Interest Added: " + interest);
    }}
