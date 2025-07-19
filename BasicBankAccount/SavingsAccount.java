package ACLC.BasicBankAccount;

public class SavingsAccount extends BankAccount {
    double interestRate;

    public SavingsAccount(String accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    @Override
    public void displayBalance() {
        double interestEarned = this.balance * this.interestRate / 100;
        this.balance += interestEarned;
        super.displayBalance();
        System.out.println("Interest Earned: " + interestEarned);
        System.out.println();
    }}

