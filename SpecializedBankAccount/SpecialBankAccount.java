package ACLC.SpecializedBankAccount;

public class SpecialBankAccount {
    protected String accountNumber;
    protected double balance;

    public SpecialBankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            this.balance += amount;
        } else {
            System.out.println("Invalid deposit amount.");
        }}

    public void withdraw(double amount) {
        if (amount > 0 && this.balance >= amount) {
            this.balance -= amount;
        } else {
            System.out.println("Insufficient balance or invalid amount.");
        }}

    public void displayBalance() {
        System.out.println();
        System.out.println("Balance: P" + this.balance);
        System.out.println();
    }}


